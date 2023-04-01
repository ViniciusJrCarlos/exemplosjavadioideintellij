package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
   @GetMapping
    public String welcome(){

       //System.out.println("Welcome to My Spring Boot Web API");
       return  "Welcome to My Spring Boot Web API";
   }


}


