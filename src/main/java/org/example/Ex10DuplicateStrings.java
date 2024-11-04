package org.example;

import java.util.Arrays;

public class Ex10DuplicateStrings {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "orange", "apple", "kiwi",
                "banana", "grape", "apple", "peach", "banana", "cherry",
                "orange", "pear", "grape", "apple", "mango"};
        System.out.println("Array of strings:");
        System.out.println(Arrays.toString(fruits));
        System.out.println();
        byte[] freq = new byte[fruits.length];
        int left = fruits.length;
        boolean found = false;

        for (int i = 0; (i < fruits.length - 1) && (left > 0); i++) {
            if (freq[i] < 0) continue;
            for (int j = i + 1; j < fruits.length; j++) {
                if (fruits[i].equals(fruits[j])) {
                    if (freq[i] >= 0) {
                        freq[i]++;
                        freq[j] = -1;
                        found = true;
                        left--;
                    }
                }
            }
            left--;
        }
        int i = 0;
        if (found) {
            System.out.println("Duplicate string(s):");
            for (byte e : freq) {
                if (e > 0)
                    System.out.print(fruits[i] + " ");
                i++;
            }
            System.out.println();
        } else
            System.out.println("No duplicates.");
    }
}

