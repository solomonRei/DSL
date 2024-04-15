package org.dsl.geometry.compiler.services;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Slf4j
@RequiredArgsConstructor
@Service
@Scope("prototype")
public class CFGService {

    private String input;

    private int lineCount;

    private String epsilonFound = "";

    private int asciiBegin;

    private StringBuilder response = new StringBuilder();

    private final Map<String, List<String>> mapVariableProduction = new LinkedHashMap<>();

    public void setResponse(StringBuilder response) {
        this.response = response;
    }

    public void setInputAndLineCount(String input, int lineCount) {
        this.input = input;
        this.lineCount = lineCount;
        convertStringtoMap();
    }

    public void convertCFGtoCNF() {

        insertNewStartSymbol();
        convertStringtoMap();
        eliminateEpsilon();
        eliminateAnyRemainings();
        eliminateSingleVariable();
        assignNewVariableForTwoNonTerminals();
        eliminateThreeTerminal();
    }

    private void eliminateSingleVariable() {

        System.out.println("Eliminate the non productive symbols ... ");
        response.append("Eliminate the non productive symbols ... \n");

        for (int i = 0; i < lineCount; i++) {
            removeSingleVariable();
        }

        printMap();
    }

    /**
     * Eliminate three terminal
     */
    private void eliminateThreeTerminal() {

        System.out.println("Replace two terminal variable with new variable ... ");
        response.append("Replace two terminal variable with new variable ... \n");

        for (int i = 0; i < lineCount; i++) {
            removeThreeTerminal();
        }

        printMap();
    }

    /**
     * Eliminate epsilon
     */
    private void eliminateEpsilon() {

        System.out.println("Eliminate Epsilon ...");
        response.append("Eliminate Epsilon ... \n");

        for (int i = 0; i < lineCount; i++) {
            removeEpsilon();
        }
        printMap();
    }

    /**
     * Print the map
     */
    private void printMap() {
        mapVariableProduction.forEach((key, value) -> System.out.println(key + " -> " + value));
        mapVariableProduction.forEach((key, value) -> response.append(key).append(" -> ").append(value).append("\n"));
        System.out.println(" ");
        response.append("\n");
    }


    /**
     * Convert the input string to a map
     */
    private void convertStringtoMap() {
        String[] lines = input.split("\\n");
        Arrays.stream(lines)
                .forEach(
                        line -> {
                            String[] parts = line.split(" → ");
                            String variable = parts[0].trim();
                            List<String> productions =
                                    Arrays.stream(parts[1].split("\\|"))
                                            .map(String::trim)
                                            .collect(Collectors.toList());
                            mapVariableProduction.put(variable, productions);
                        });
    }

    private void insertNewStartSymbol() {

        String newStart = "S0";
        ArrayList<String> newProduction = new ArrayList<>();
        newProduction.add("S");

        mapVariableProduction.put(newStart, newProduction);
    }

    /**
     * Remove epsilon
     */
    private void removeEpsilon() {
        mapVariableProduction.forEach(
                (key, productionRow) -> {
                    if (productionRow.contains("e")) {
                        if (productionRow.size() > 1) {
                            productionRow.remove("e");
                            epsilonFound = key;
                        } else {
                            epsilonFound = key;
                            mapVariableProduction.remove(epsilonFound);
                        }
                    }
                });

        mapVariableProduction.forEach(
                (key, productionRow) -> {
                    ArrayList<String> productionList = new ArrayList<>(productionRow);
                    productionList.stream()
                            .filter(production -> production.contains(epsilonFound))
                            .forEach(
                                    production -> {
                                        String temp = production;
                                        for (int j = 0; j < temp.length(); j++) {
                                            if (epsilonFound.equals(Character.toString(production.charAt(j)))) {
                                                if (temp.length() == 2) {
                                                    temp = temp.replace(epsilonFound, "");
                                                    if (!mapVariableProduction.get(key).contains(temp)) {
                                                        mapVariableProduction.get(key).add(temp);
                                                    }
                                                } else if (temp.length() == 3) {
                                                    String deletedTemp = new StringBuilder(temp).deleteCharAt(j).toString();
                                                    if (!mapVariableProduction.get(key).contains(deletedTemp)) {
                                                        mapVariableProduction.get(key).add(deletedTemp);
                                                    }
                                                } else if (temp.length() == 4) {
                                                    String deletedTemp = new StringBuilder(temp).deleteCharAt(j).toString();
                                                    if (!mapVariableProduction.get(key).contains(deletedTemp)) {
                                                        mapVariableProduction.get(key).add(deletedTemp);
                                                    }
                                                } else {
                                                    if (!mapVariableProduction.get(key).contains("e")) {
                                                        mapVariableProduction.get(key).add("e");
                                                    }
                                                }
                                            }
                                        }
                                    });
                });
    }

    /**
     * Remove any remainings
     */
    private void eliminateAnyRemainings() {
        System.out.println("Remove any remainings ... ");
        response.append("Remove any remainings ... \n");

        mapVariableProduction.forEach(
                (key, productionRow) -> {
                    List<String> itemsToRemove =
                            productionRow.stream().filter(production -> production.equals(key)).collect(Collectors.toList());

                    productionRow.removeAll(itemsToRemove);
                });

        printMap();
    }

    /**
     * Remove single variable from the production list
     *
     * <p>For example, if we have A -> B and B -> C, we can remove B and replace A -> C
     */
    private void removeSingleVariable() {
        Map<String, List<String>> copyOfMap = new LinkedHashMap<>(mapVariableProduction);

        Map<String, List<String>> updates = new LinkedHashMap<>();

        copyOfMap.forEach(
                (key, productionList) -> {
                    List<String> toReplace =
                            productionList.stream()
                                    .filter(
                                            production -> production.length() == 1 && copyOfMap.containsKey(production))
                                    .collect(Collectors.toList());

                    if (!toReplace.isEmpty()) {
                        List<String> newProductions = new ArrayList<>(productionList);
                        toReplace.forEach(
                                production -> {
                                    newProductions.remove(production);
                                    newProductions.addAll(
                                            copyOfMap.get(production).stream()
                                                    .filter(prod -> !newProductions.contains(prod))
                                                    .collect(Collectors.toList()));
                                });
                        updates.put(key, newProductions);
                    }
                });

        mapVariableProduction.putAll(updates);
    }

    /**
     * Check if the key is not present in the production list
     *
     * @param map the map to check
     * @param key the key to check
     * @return true if the key is not present in the production list, false otherwise
     */
    private Boolean checkDuplicateInProductionList(Map<String, List<String>> map, String key) {
        return map.values().stream()
                .filter(productionList -> productionList.size() < 2)
                .noneMatch(productionList -> productionList.contains(key));
    }

    /**
     * Assign new variable for two non-terminal or one terminal
     */
    private void assignNewVariableForTwoNonTerminals() {
        System.out.println("Assign new variable for two non-terminal or one terminal ... ");
        response.append("Assign new variable for two non-terminal or one terminal ... \n");

        asciiBegin = 71; // G
        Map<String, List<String>> tempList = new LinkedHashMap<>();
        Set<String> set = mapVariableProduction.keySet();
        mapVariableProduction.forEach(
                (key, value) -> {
                    ArrayList<String> keySet = new ArrayList<String>(set);
                    boolean found1 = false;
                    boolean found2 = false;
                    boolean found = false;

                    for (String temp : value) {
                        for (int j = 0; j < temp.length(); j++) {

                            if (temp.length() == 3) {

                                String newProduction = temp.substring(1, 3); // SA

                                found =
                                        checkDuplicateInProductionList(tempList, newProduction)
                                                && checkDuplicateInProductionList(mapVariableProduction, newProduction);

                                if (found) {

                                    ArrayList<String> newVariable = new ArrayList<>();
                                    newVariable.add(newProduction);
                                    key = Character.toString((char) asciiBegin);

                                    tempList.put(key, newVariable);
                                    asciiBegin++;
                                }

                            } else if (temp.length() == 2) { // if only two substring

                                for (String s : keySet) {

                                    if (!s.equals(
                                            Character.toString(temp.charAt(j)))) { // if substring not equals to keySet
                                        found = false;

                                    } else {
                                        found = true;
                                        break;
                                    }
                                }

                                if (!found) {
                                    String newProduction = Character.toString(temp.charAt(j));

                                    if (checkDuplicateInProductionList(tempList, newProduction)
                                            && checkDuplicateInProductionList(mapVariableProduction, newProduction)) {

                                        ArrayList<String> newVariable = new ArrayList<>();
                                        newVariable.add(newProduction);
                                        key = Character.toString((char) asciiBegin);

                                        tempList.put(key, newVariable);

                                        asciiBegin++;
                                    }
                                }
                            } else if (temp.length() == 4) {

                                String newProduction1 = temp.substring(0, 2); // SA
                                String newProduction2 = temp.substring(2, 4); // SA

                                found1 =
                                        checkDuplicateInProductionList(tempList, newProduction1)
                                                && checkDuplicateInProductionList(mapVariableProduction, newProduction1);

                                found2 =
                                        checkDuplicateInProductionList(tempList, newProduction2)
                                                && checkDuplicateInProductionList(mapVariableProduction, newProduction2);

                                if (found1) {

                                    ArrayList<String> newVariable = new ArrayList<>();
                                    newVariable.add(newProduction1);
                                    key = Character.toString((char) asciiBegin);

                                    tempList.put(key, newVariable);
                                    asciiBegin++;
                                }

                                if (found2) {
                                    ArrayList<String> newVariable = new ArrayList<>();
                                    newVariable.add(newProduction2);
                                    key = Character.toString((char) asciiBegin);

                                    tempList.put(key, newVariable);
                                    asciiBegin++;
                                }
                            }
                        }
                    }
                });
        mapVariableProduction.putAll(tempList);
        printMap();
    }

    /**
     * Eliminate two terminal variable
     */
    private void processProduction(
            int asciiBegin, Map<String, List<String>> tempList, String production) {
        if (production.length() == 3) {
            handleThreeCharacterProduction(production, tempList, asciiBegin);
        } else if (production.length() == 2) {
            handleTwoCharacterProduction(production, tempList, asciiBegin);
        } else if (production.length() == 4) {
            handleFourCharacterProduction(production, tempList, asciiBegin);
        }
    }

    /**
     * Eliminate two terminal variable
     */
    private void handleThreeCharacterProduction(
            String production, Map<String, List<String>> tempList, int asciiBegin) {
        String newProduction = production.substring(1, 3); // SA
        if (checkDuplicateInProductionList(tempList, newProduction)
                && checkDuplicateInProductionList(mapVariableProduction, newProduction)) {
            tempList.put(Character.toString((char) asciiBegin), new ArrayList<>(Collections.singletonList(newProduction)));
            this.asciiBegin++;
        }
    }

    /**
     * Eliminate two terminal variable
     */
    private void handleTwoCharacterProduction(
            String production, Map<String, List<String>> tempList, int asciiBegin) {
        for (int j = 0; j < production.length(); j++) {
            String newProduction = Character.toString(production.charAt(j));

            // Check if this character is not a key in the original production map
            if (!mapVariableProduction.containsKey(newProduction)) {
                boolean isDuplicate =
                        checkDuplicateInProductionList(tempList, newProduction)
                                && checkDuplicateInProductionList(mapVariableProduction, newProduction);

                if (!isDuplicate) {
                    if (!tempList.values().stream()
                            .flatMap(List::stream)
                            .anyMatch(s -> s.equals(newProduction))) {
                        List<String> newVariable = new ArrayList<>();
                        newVariable.add(newProduction);

                        // Generate a new variable name from asciiBegin and increment it for the next use
                        String key = Character.toString((char) asciiBegin);
                        tempList.put(key, newVariable);
                        asciiBegin++;
                        this.asciiBegin = asciiBegin;
                    }
                }
            }
        }
    }

    /**
     * Eliminate two terminal variable
     */
    private void handleFourCharacterProduction(
            String production, Map<String, List<String>> tempList, int asciiBegin) {
        String newProduction1 = production.substring(0, 2); // SA
        String newProduction2 = production.substring(2, 4); // SA
        if (checkDuplicateInProductionList(tempList, newProduction1)
                && checkDuplicateInProductionList(mapVariableProduction, newProduction1)) {
            tempList.putIfAbsent(Character.toString((char) asciiBegin), new ArrayList<>(Collections.singletonList(newProduction1)));
            this.asciiBegin++;
        }
        if (checkDuplicateInProductionList(tempList, newProduction2)
                && checkDuplicateInProductionList(mapVariableProduction, newProduction2)) {
            tempList.putIfAbsent(Character.toString((char) asciiBegin), new ArrayList<>(Collections.singletonList(newProduction2)));
            this.asciiBegin++;
        }
    }

    /**
     * Eliminate two terminal variable
     */
    private void removeThreeTerminal() {
        List<String> keyList = new ArrayList<>();
        mapVariableProduction.forEach(
                (key, value) -> {
                    if (value.size() < 2) {
                        keyList.add(key);
                    }
                });

        Map<String, List<String>> modifiedProductions = new LinkedHashMap<>();

        mapVariableProduction.forEach(
                (k, productions) -> {
                    if (productions.size() > 1) {
                        for (int i = 0; i < productions.size(); i++) {
                            String temp = productions.get(i);

                            for (int j = 0; j < temp.length(); j++) {

                                if (temp.length() > 2) {
                                    String stringToBeReplaced1 = temp.substring(j, temp.length());
                                    String stringToBeReplaced2 = temp.substring(0, temp.length() - j);

                                    for (String key : keyList) {

                                        List<String> keyValues = mapVariableProduction.get(key);
                                        String[] values = keyValues.toArray(new String[0]);
                                        String value = values[0];

                                        if (stringToBeReplaced1.equals(value)) {

                                            mapVariableProduction.get(k).remove(temp);
                                            temp = temp.replace(stringToBeReplaced1, key);

                                            if (!mapVariableProduction.get(k).contains(temp)) {
                                                mapVariableProduction.get(k).add(i, temp);
                                            }
                                        } else if (stringToBeReplaced2.equals(value)) {

                                            mapVariableProduction.get(k).remove(temp);
                                            temp = temp.replace(stringToBeReplaced2, key);

                                            if (!mapVariableProduction.get(k).contains(temp)) {
                                                mapVariableProduction.get(k).add(i, temp);
                                            }
                                        }
                                    }
                                } else if (temp.length() == 2) {

                                    for (String key : keyList) {

                                        List<String> keyValues = mapVariableProduction.get(key);
                                        String[] values = keyValues.toArray(new String[0]);
                                        String value = values[0];

                                        temp = getString(k, i, temp, key, value);
                                    }
                                }
                            }
                        }
                    } else if (productions.size() == 1) {

                        for (int i = 0; i < productions.size(); i++) {
                            String temp = productions.get(i);

                            if (temp.length() == 2) {
                                for (String key : keyList) {
                                    List<String> keyValues = mapVariableProduction.get(key);
                                    String[] values = keyValues.toArray(new String[0]);
                                    String value = values[0];

                                    temp = getString(k, i, temp, key, value);
                                }
                            }
                        }
                    }
                });
    }

    /**
     * Eliminate two terminal variable
     */
    private String getString(String k, int i, String temp, String key, String value) {
        for (int pos = 0; pos < temp.length(); pos++) {
            String tempChar = Character.toString(temp.charAt(pos));

            if (value.equals(tempChar)) {

                mapVariableProduction.get(k).remove(temp);
                temp = temp.replace(tempChar, key);

                if (!mapVariableProduction.get(k).contains(temp)) {
                    mapVariableProduction.get(k).add(i, temp);
                }
            }
        }
        return temp;
    }
}

