package org.example;

import java.util.Arrays;

class E01MinMaxWeeklyTemps {
    public void solution() {
        // Bruntal 2024-08-12 .. 2024-08-18, every 6 hours
        double[] temps = {
                14.7, 12.7, 25.0, 23.5, 15.7, 15.3, 25.9, 24.5, 16.2, 14.6,
                29.3, 27.0, 16.2, 20.9, 25.7, 24.0, 16.0, 16.1, 28.0, 26.8,
                19.4, 18.5, 27.9, 19.3, 18.2, 19.0, 23.4, 25.0};
        double min, max;
        min = max = temps[0];

        for (double e : temps) {
            if (e < min) min = e;
            if (e > max) max = e;
        }

        System.out.println("The highest temperature of the week was " + max +
                "°C and the lowest " + min + "°C.");
    }
}

class E02SumOfElements {
    public void solution() {
        int[] arr = {
                -176, 37, 113, 243, 96, 249, 204, -259, -165, 257, 184, -198, 241,
                115, 30, 156, 243, -286, 159, 45, 289, -242, 248, 267, 144, 130,
                262, 5, 243, 67, 202, 228, 144, 124, 0, 171, 60, 169, 288};
        int sum = 0;

        for (int e : arr) sum += e;

        System.out.println("Sum of the array is " + sum + ".");
    }
}

class E03Array2DEvenElements {
    public void solution() {
        int[][] arr = {
                {141, 271, 47, -259, -217, -266, 67, 269, 116, 125},
                {214, 208, -112, -77, -126, 191, 256, 152, 181, 289},
                {-98, 135, 130, 86, -33, 26, 213, 202, 123, 155},
                {16, -264, 233, 293, 152, 40, -264, 241, 251, 75}
        };

        System.out.println("List of even elements of the array:");
        for (int[] r : arr) {
            for (int e : r) {
                if (e % 2 == 0) System.out.print(e + " ");
            }
        }
        System.out.println();
    }
}

class E04Array2DEvenElements {
    public void solution() {
        int[][] arr = {
                {141, 271, 47, -259, -217, -266, 67, 269, 116, 125},
                {214, 208, -112, -77, -126, 191, 256, 152, 181, 289},
                {-98, 135, 130, 86, -33, 26, 213, 202, 123, 155},
                {16, -264, 233, 293, 152, 40, -264, 241, 251, 75}
        };
        int sumEven = 0;
        int sumOdd = 0;

        for (int[] r : arr) {
            for (int e : r) {
                if (e % 2 == 0) sumEven += e;
                else sumOdd += e;
            }
        }
        System.out.println("Sum of even elements of the array = " + sumEven + ".");
        System.out.println("Sum of odd elements of the array = " + sumOdd + ".");
    }
}

class E05Swap2Numbers {
    public int[] solution(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }
}

class E06IsPrime {
    public boolean isPrime(int n) {
        boolean result = true;
        for (int i = 2; i < n; i++)
            if (n % i == 0) {       // if there is any divisor, nr is not prime
                result = false;
                break;
            }
        return result;
    }
}

class E07FibonacciSeries {
    public void solution(int n) {
        if (n == 0) {
            System.out.println("0");
            return;
        }
        if (n == 1) {
            System.out.println("0, 1");
            return;
        }
        int a, b, sum;
        a = 0;
        b = 1;
        System.out.print("0, 1");
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            System.out.print(", " + sum);
            a = b;
            b = sum;
        }
        System.out.println();
    }
}

class E08MinMaxOfArray {
    public void solution() {
        int[] arr = {
                -176, 37, 113, 243, 96, 249, 204, -259, -165, 257, 184, -198, 241,
                115, 30, 156, 243, -286, 159, 45, 289, -242, 248, 267, 144, 130,
                262, 5, 243, 67, 202, 228, 144, 124, 0, 171, 60, 169, 288};
        int min, max;
        min = max = arr[0];

        System.out.println("Array:");
        System.out.println(Arrays.toString(arr));

        for (int e : arr) {
            if (e < min) min = e;
            if (e > max) max = e;
        }
        System.out.println("The minimum element of an array is " + min
                + ", the maximum is " + max + ".");
    }
}

class E09SecondLargestOfArray {
    public void solution() {
        int[] arr = {
                -176, 37, 113, 243, 96, 249, 204, -259, -165, 257, 184, -198, 241,
                115, 30, 156, 243, -286, 159, 45, 289, -242, 248, 267, 144, 130,
                262, 5, 243, 67, 202, 228, 144, 124, 289, 0, 171, 60, 169, 288};
        int premax, max;
        premax = max = arr[0];

        System.out.println("Array:");
        System.out.println(Arrays.toString(arr));

        for (int e : arr) {
            if (e > max)
                max = e;
            if (e > premax && e < max)
                premax = e;

        }
        System.out.println("The second largest number in the array is " + premax + ".");

    }
}

class E10DuplicateString {
    public void find(String[] s) {
        byte[] freq = new byte[s.length];
        int left = s.length;
        boolean found = false;

        for (int i = 0; (i < s.length - 1) && (left > 0); i++) {
            if (freq[i] < 0) continue;
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].equals(s[j])) {
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
                    System.out.print(s[i] + " ");
                i++;
            }
            System.out.println();
        } else
            System.out.println("No duplicates.");
    }
}

public class BAT21G6JavaBasicsPart1 {

    public static void main(String[] args) {
        String msg = "\n\n******** JAVA PROJECT (JAVA BASICS) PART 1 - task ";
        System.out.println(msg + "1:\n");
        E01MinMaxWeeklyTemps e01 = new E01MinMaxWeeklyTemps();
        e01.solution();

        System.out.println();
        System.out.println(msg + "2:\n");
        E02SumOfElements e02 = new E02SumOfElements();
        e02.solution();

        System.out.println();
        System.out.println(msg + "3:\n");
        E03Array2DEvenElements e03 = new E03Array2DEvenElements();
        e03.solution();

        System.out.println();
        System.out.println(msg + "4:\n");
        E04Array2DEvenElements e04 = new E04Array2DEvenElements();
        e04.solution();

        System.out.println();
        System.out.println(msg + "5:\n\nSwap two numbers:");
        E05Swap2Numbers e05 = new E05Swap2Numbers();
        int a, b;
        a = 3;
        b = 2;
        int[] swapped = {0, 0};
        swapped = e05.solution(a, b);
        System.out.println("(" + a + ", " + b + ") -> ("
                + swapped[0] + ", " + swapped[1] + ")");
        a = -11;
        b = 2;
        swapped = e05.solution(a, b);
        System.out.println("(" + a + ", " + b + ") -> ("
                + swapped[0] + ", " + swapped[1] + ")");
        a = 0;
        b = 89;
        swapped = e05.solution(a, b);
        System.out.println("(" + a + ", " + b + ") -> ("
                + swapped[0] + ", " + swapped[1] + ")");
        a = 0;
        b = 0;
        swapped = e05.solution(a, b);
        System.out.println("(" + a + ", " + b + ") -> ("
                + swapped[0] + ", " + swapped[1] + ")");

        System.out.println();
        System.out.println(msg + "6:\n");
        E06IsPrime e06 = new E06IsPrime();
        a = 16;
        System.out.println("Number " + a + ((e06.isPrime(a)) ? " is prime." : " is not prime."));
        a = 257;
        System.out.println("Number " + a + ((e06.isPrime(a)) ? " is prime." : "is not prime."));
        a = 9973;
        System.out.println("Number " + a + ((e06.isPrime(a)) ? " is prime." : "is not prime."));

        System.out.println();
        System.out.println(msg + "7:\n\nFibonacci series of 10:");
        E07FibonacciSeries e07 = new E07FibonacciSeries();
        e07.solution(10);

        System.out.println();
        System.out.println(msg + "8:\n");
        E08MinMaxOfArray e08 = new E08MinMaxOfArray();
        e08.solution();

        System.out.println();
        System.out.println(msg + "9:\n");
        E09SecondLargestOfArray e09 = new E09SecondLargestOfArray();
        e09.solution();

        System.out.println();
        System.out.println(msg + "10:\n\nFind duplicate strings in the array");
        String[] fruits = {"apple", "banana", "orange", "apple", "kiwi",
                "banana", "grape", "apple", "peach", "banana", "cherry",
                "orange", "pear", "grape", "apple", "mango"};
        System.out.println(Arrays.toString(fruits));
        System.out.println();
        E10DuplicateString e10 = new E10DuplicateString();
        e10.find(fruits);

    }
}
