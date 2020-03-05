package com.frog.Andrey;

import com.frog.Andrey.classes.SortInfo;

import java.util.Arrays;

import static com.frog.Andrey.utils.ArithmeticUtils.checksum;
import static com.frog.Andrey.utils.SortUtils.bubbleIterate;
import static com.frog.Andrey.utils.SortUtils.bubbleSort;
import static com.frog.Andrey.utils.SortUtils.selectionSort;

public class Main {

    public static void main(String[] args) {
        int[] ref = {3, 1, 4, 1, 5, 9, 2, 6};

        // checksum // Code Abbey checksum ✔
        int[] arr = ref.clone();
        System.out.println(checksum(arr));

        // bubble iterate // Code Abbey bubble iterate ✔
        arr = ref.clone();
        int swaps = bubbleIterate(arr);
        System.out.println(Arrays.toString(arr) + "\n" + swaps + " " + checksum(arr));

        // bubble sort // Code Abbey bubble sort ✔
        arr = ref.clone();
        SortInfo info = bubbleSort(arr);
        System.out.println(Arrays.toString(arr) + "\n" + info.getPasses() + " " + info.getSwaps());

        // selection sort // no Code Abbey
        arr = ref.clone();
        selectionSort(arr);
        System.out.println(Arrays.toString(ref));
        System.out.println(Arrays.toString(arr));
    }

}
