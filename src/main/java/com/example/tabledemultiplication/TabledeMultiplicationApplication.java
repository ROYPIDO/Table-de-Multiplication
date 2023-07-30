package com.example.tabledemultiplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TabledeMultiplicationApplication {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("***********************************************");

            for (int j = 1; j <= 10; j++) {

                System.out.println(i + "x" + j + "=" + (i * j));

            }

        }


        System.out.println("********************************************");
    }


}
