package com.nagarro.io;

import com.opencsv.CSVReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Input {
    public static void main(String[] args){
        try{
        String file="D:\\Java Training\\Java Week 2- Advanced Java\\Assignment Links\\AirIndia.csv";
            FileReader filereader = new FileReader(file);

            // create csvReader object passing
            // file reader as a parameter
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;

            // we are going to read data line by line
            while ((nextRecord = csvReader.readNext()) != null) {

                for (String cell : nextRecord) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
    }catch(Exception e){
            System.out.println(e);
        }
    }
}
