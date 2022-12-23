package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public int num(int firstNum, int secondNum){
        return firstNum * secondNum;
    }
}
