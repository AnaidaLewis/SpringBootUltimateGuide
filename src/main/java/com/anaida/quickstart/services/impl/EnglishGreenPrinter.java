package com.anaida.quickstart.services.impl;

import com.anaida.quickstart.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreenPrinter implements GreenPrinter {
    @Override
    public String print(){
        return "green";
    }
}
