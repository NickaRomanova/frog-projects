package com.frog.Ivan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("resources/bubblesort.txt");
        BufferedReader br = new BufferedReader(in);
        String s;
        while ((s = br.readLine()) != null) {
            int pass = 0;
            int change = 0;
            boolean isChanged;
            String[] init = s.split(" ");
            int[] mass = Arrays.stream(init).mapToInt(Integer::parseInt).toArray();
            for (int i = 0; i < mass.length; i++) {
                isChanged = false;
                for (int j = i; j < mass.length; j++) {
                    if(mass[i] > mass[j]) {
                        int temp = mass[i];
                        mass[i] = mass[j];
                        mass[j] = temp;
                        change++;
                        isChanged = true;
                    }
                }
                if(!isChanged) {
                    pass--;
                    break;
                }
                pass++;
            }
                System.out.println(pass + " " + change);
        }
    }

}
