package com.anaida.quickstart.services.impl;

import com.anaida.quickstart.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishBluePrinter implements BluePrinter {
    @Override
    public String print(){
        return "blue";
    }
}
