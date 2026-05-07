package com.anaida.quickstart.services.impl;

import com.anaida.quickstart.services.BluePrinter;
import com.anaida.quickstart.services.ColourPrinter;
import com.anaida.quickstart.services.GreenPrinter;
import com.anaida.quickstart.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColourPrinterImpl implements ColourPrinter {

    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinter;

    public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter){
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
        this.redPrinter = redPrinter;
    }

    @Override
    public String print(){
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
