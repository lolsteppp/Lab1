package com.example.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

   String helloWorld="Hello mmedikosh!";

   @GetMapping("/")
   public String hello(@RequestParam(required = false) String q) {
      return helloWorld + q;
   }


}