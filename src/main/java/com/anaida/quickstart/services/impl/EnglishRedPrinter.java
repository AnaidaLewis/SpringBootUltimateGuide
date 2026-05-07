package com.anaida.quickstart.services.impl;

import com.anaida.quickstart.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter {
    @Override
    public String print(){
        return "red";
    }
}
