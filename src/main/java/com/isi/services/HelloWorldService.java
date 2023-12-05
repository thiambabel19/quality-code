package com.isi.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class HelloWorldService {

    public String helloWorld(){
        return "Hello world !!!";
    }

    public int somme(int a, int b){
        return a+b;
    }

    public int produit(int a, int b){
        return a * b;
    }

    public int soustraction(int a, int b){
        return a - b;
    }
}
