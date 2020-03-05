package com.frog.Ivan;

import java.io.BufferedReader;
import java.io.FileReader;

public class ArrayCounters {



    public static void main(String[] args) throws Exception {

        try (BufferedReader br = new BufferedReader(new FileReader("resources/arraycounters.txt"))) {
            String line;
            int[] counters = new int[Integer.parseInt(br.readLine())];
            for (int i = 0; i < counters.length; i++) {
                counters[i] = 0;
            }
            while ((line = br.readLine()) != null) {
                String[] split = line.split(" ");
                for (int i = 0; i < split.length; i++) {
                    for (int j = 0; j <counters.length; j++) {
                        if (Integer.parseInt(split[i])==j+1){
                            counters[j]++;
                        }
                    }
                }
                for (int i = 0; i <counters.length ; i++) {
                    System.out.println(counters[i]);
                }
            }
        }
    }

}
