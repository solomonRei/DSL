package org.dsl.geometry.exceptions;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(value = {IllegalArgumentException.class})
  public ModelAndView handleIllegalArgumentException(IllegalArgumentException ex, Model model) {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("errorMessage", ex.getMessage());
    modelAndView.setViewName("error");
    return modelAndView;
  }

  @ExceptionHandler(value = {Exception.class})
  public ModelAndView handleOtherExceptions(Exception ex, Model model) {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("errorMessage", "An error occurred: " + ex.getMessage());
    modelAndView.setViewName("error");
    return modelAndView;
  }

}
