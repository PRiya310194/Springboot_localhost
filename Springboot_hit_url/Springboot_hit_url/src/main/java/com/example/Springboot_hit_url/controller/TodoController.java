package com.example.Springboot_hit_url.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    @RequestMapping("/api/username/{username}")
    public String helloUser(@PathVariable String username){  // http://localhost:8080/api/username/priya output=hello priya
        return "hello "+username;
    }
}

    // --------------------------------------------------------
    //@RequestMapping("/api")
    //public String helloUser(@RequestParam String username){  // http://localhost:8080/api?username=priya   output=Hello priya
        // return "Hello "+username;
    // ---------------------------------------------------------------


    // ----------------------------------------------------------------------------
   /* @RequestMapping("/Message")           // http://localhost:8080/Message   output=Hello priya
    public String msg(){
       return "Hello priya";

    */
    // -------------------------------------------------




