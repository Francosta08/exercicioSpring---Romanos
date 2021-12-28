package com.romano.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class romanoController {
    public int [] valores = {10, 5, 1};
    public String [] letras = {"X", "V", "I"};
    @GetMapping("numero/{numero}")
    public String roman(@PathVariable int numero){
        String vrRom="";
        for(int i=0; i<valores.length;i++){
            while(numero>=valores[i]){
                numero-=valores[i];
                vrRom+=letras[i];
            }
        }
        return vrRom;
    }


}
