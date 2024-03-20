# Geometric Figures DSL

This DSL allows for easy creation and manipulation of geometric figures, such as points, lines, and triangles. Below are
examples of using the DSL to create various geometric objects and operations on them.

## Features

- Parse and compile custom Geometry DSL code.
- Generate images of geometric shapes defined in the DSL.
- Support for various geometric entities like points, lines, triangles, and circles.

## Implementation Details

### Frontend Development
The frontend interface was crafted with attention to user engagement and ease of use. The combination of **HTML**, **CSS**, and **JavaScript** resulted in an intuitive and responsive design that adjusts fluidly across different devices and screen sizes, ensuring a consistent user experience.

### Integration of AJAX
AJAX technology was employed to enhance the application's interactivity. It enabled the development of a dynamic image generation process that operates based on user interactions, without requiring full page reloads. This not only made the application more responsive but also optimized bandwidth and performance.

### Spring Framework for Online Compiler
The backend, built on the **Spring framework**, supports the online compiler with robust Java application infrastructure. A specialized API was engineered to handle real-time code compilation and execution, focusing on security, efficiency, and scalability.

### Image Generation Feature
A crucial component was the image generation functionality, realized through AJAX for asynchronous communication. The server, integrated with Spring, processed image generation requests, ensuring dynamic visual feedback for the user's compiled code.

### Dynamic Content Updates
Utilizing AJAX, the web application was designed to dynamically update content without page reloads. This capability allows users to see the results of their code compilation in image form in real time, enhancing the interactive experience of the application.

The end product is a contemporary and interactive tool that combines AJAX's dynamic capabilities with the Spring framework's robustness, offering not just visual appeal but also a feature-rich, user-focused experience.


## Usage
To compile a Geometry DSL script, use the CompilerController to handle HTTP POST requests with DSL code as input. The service returns a path to the generated image.

Example of a DSL script input:
```plaintext
{
  "dslCode": "Point A(1, 2); Line AB(A, B);"
}
```

### Compiler Service
The CompilerService class is responsible for parsing the DSL code and generating the image. It uses ANTLR for parsing the DSL script and processes the parsed data to create geometric shapes.

Example:
```java
    @Service
    public class CompilerService {
    
        public String compile(String input) {
            // Parsing and image generation logic
        }
    }
```

### Geometry DSL Syntax
The DSL syntax is defined in ANTLR grammar format. It supports basic geometric shapes and operations.

## Tokens and Types

- **Basic Tokens**: 
  - The DSL defines basic tokens such as `POINT`, `LINE`, `TRIANGLE`, etc., to represent geometric figures.
  - Numerical values are represented by the `NUM` token, and identifiers for figures or points are captured by the `ID` token.

- **Operation Tokens**: 
  - Tokens like `PLUS`, `MINUS`, `MUL`, and `DIV` are used for arithmetic operations.
  - The `ARROW` token is used for method calls on geometric entities.

## Statements and Declarations

- **Figure Declarations**: 
  - Figures like points, lines, triangles, and circles are declared using their respective tokens followed by an identifier and parameters. 
  - Example: `Point A(1, 2);` declares a point, and `Line AB(A, B);` declares a line between points A and B.

- **Complex Figures**: 
  - The grammar supports declarations of more complex figures like `SQUARE`, `RECTANGLE`, `ELLIPSE`, etc., with the necessary parameters for their construction.

## Functionality and Operations

- **Geometric Operations**: 
  - The DSL supports operations like `bisector`, `angle`, and `height` for figures like triangles. 
  - These operations are specified using an arrow notation, e.g., `Triangle t1(A, B, C)->bisector(A)`.

- **Arithmetic and Logical Expressions**: 
  - The grammar allows for arithmetic and logical expressions to facilitate more complex calculations and conditions within the DSL.

## Control Structures

- **Loops and Conditional Statements**: 
  - For control flow, the DSL includes `for` and `while` loops, as well as `if-else` conditional statements, allowing users to create dynamic and conditional geometric constructions.

## Comments and Whitespace

- **Comments**: 
  - Both single-line (`//`) and multi-line (`/* */`) comments are supported, allowing users to annotate their code for better readability.

- **Whitespace**: 
  - Whitespace characters are ignored in the parsing process, ensuring that the layout of the DSL code does not affect its execution.

## Extensibility and Flexibility

The grammar is designed to be extensible, allowing for the addition of new geometric entities and operations as needed. This design supports a wide range of geometric constructions and analyses, making the DSL a powerful tool for educational and professional purposes in the field of geometry.

By integrating these elements, your Geometry DSL provides a comprehensive and user-friendly platform for geometric figure creation and manipulation, supported by a robust and flexible ANTLR grammar.

## Creating Points and Lines

```plaintext
Point A(100, 100);
Point B(200, 200);
Line L(A, B);
```

## Creating Triangles
You can create a triangle using the coordinates of three points:
```plaintext
Point A(0, 0);
Point B(400, 0);
Point C(0, 300);
Triangle t1(A, B, C);
```
Specialized types of triangles are also supported:

```plaintext
EquilateralTriangle t1(500); // Equilateral triangle
IsoscelesTriangle t2(400, 600); // Isosceles triangle
Triangle t2(200, 300, 400); // Arbitrary triangle by the lengths of sides
```

## Advanced Operations with Triangles
You can apply operations such as constructing bisectors to triangles using the following syntax:

```plaintext
Triangle t1(S : 200, D : 300, E : 400)->bisector(S)->bisector(D);
Triangle t1(A, B, C)->bisector(A)
```

## Loop Operations
You can use loops to create multiple geometric shapes:

This example creates a series of Point objects in a loop, with each point's coordinates increasing in a linear pattern.

```plaintext
for (int i = 0; i < 10; i++) {
    Point p(i * 10, i * 10);
}
```

### While Loop Example:
In this example, a series of Circle objects are created in a loop, with the radius increasing incrementally.
```plaintext
num i = 0;
while (i < 10) {
    Circle C(i, i + 5);
    i = i + 1;
    // Additional operations
}
```

## Extending the Grammar for if-else Constructs

An if-else statement allows conditional execution of code blocks. It consists of a condition, a true branch (executed when the condition is true), and an optional false branch (executed when the condition is false).

### If-Else Example:
```plaintext
if (a > b) {
    Point P1(10, 20);
    // Other operations if a is greater than b
} else {
    Point P2(30, 40);
    // Other operations if a is not greater than b
}
```

### Nested If-Else Example:
```plaintext
if (x > 0) {
    // Operations for x > 0
    if (y > 0) {
        Line L1(Point(0, 0), Point(x, y));
        // Other operations for y > 0
    } else {
        Line L2(Point(0, 0), Point(x, -y));
        // Other operations for y <= 0
    }
} else {
    // Operations for x <= 0
}
```
