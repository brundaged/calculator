package com.brundage.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CalculatorController {
     @Autowired
     private Calculator calculator;
     @RequestMapping("/sum")
     String sum(@RequestParam("a") Integer a, 
                @RequestParam("b") Integer b) {
          return String.valueOf(calculator.sum(a, b));
     }
     @RequestMapping("/product")
     String product(@RequestParam("a") Integer a, 
                    @RequestParam("b") Integer b) {
          return String.valueOf(calculator.product(a, b));
     }
     @RequestMapping("/difference")
     String difference(@RequestParam("a") Integer a, 
                    @RequestParam("b") Integer b) {
          return String.valueOf(calculator.difference(a, b));
     }
}