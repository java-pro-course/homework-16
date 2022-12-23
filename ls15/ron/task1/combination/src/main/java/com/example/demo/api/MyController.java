package com.example.demo.api;

import com.example.demo.service.MyService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController{
    private MyService service;

    public MyController(MyService service) {
        this.service = service;
    }
    @PutMapping("multiply/2/4")
        public int Composition(@PathVariable int firstNum,
    @PathVariable int secondNum){
        return service.num(firstNum, secondNum);
    }



}
