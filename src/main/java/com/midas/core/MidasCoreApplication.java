package com.midas.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// idi main file, ikkada nunchi project start avuthundi
@SpringBootApplication
public class MidasCoreApplication {

    public static void main(String[] args) {
        // project ni ikkada run chesthunna
        SpringApplication.run(MidasCoreApplication.class, args);
        System.out.println("Midas Core started...!!");
    }
}