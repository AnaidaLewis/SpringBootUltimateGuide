/*package com.anaida.quickstart.testsampleconfig;

import com.anaida.quickstart.services.BluePrinter;
import com.anaida.quickstart.services.ColourPrinter;
import com.anaida.quickstart.services.GreenPrinter;
import com.anaida.quickstart.services.RedPrinter;
import com.anaida.quickstart.services.impl.ColourPrinterImpl;
import com.anaida.quickstart.services.impl.EnglishBluePrinter;
import com.anaida.quickstart.services.impl.EnglishGreenPrinter;
import com.anaida.quickstart.services.impl.EnglishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {
    @Bean
    public BluePrinter bluePrinter(){
        return new EnglishBluePrinter();
    }

    @Bean
    public GreenPrinter greenPrinter(){
        return new EnglishGreenPrinter();
    }

    @Bean
    public RedPrinter redPrinter(){
        return new EnglishRedPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter){
        return new ColourPrinterImpl(redPrinter,bluePrinter,greenPrinter);
    }
}
*/