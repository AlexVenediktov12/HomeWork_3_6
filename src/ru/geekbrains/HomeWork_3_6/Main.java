package ru.geekbrains.HomeWork_3_6;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array3 = {1, 1, 1, 1, 4, 4, 4, 4, 4, 1}; // заметил, что если 4 будет последней, то ничего не будет напечатано
        int[] array4 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int[] k;

        k = task2(array1);
        for (int i = 0; i < k.length; i++) {
            System.out.print(k[i]);
        }
        System.out.println();

        k = task2(array2);
        for (int i = 0; i < k.length; i++) {
            System.out.print(k[i]);
        }
        System.out.println();

        k = task2(array3);
        for (int i = 0; i < k.length; i++) {
            System.out.print(k[i]);
        }
        System.out.println();

//        k = task2(array4);
//        for (int i = 0; i < k.length; i++) {
//            System.out.print(k[i]);
//        }
//        System.out.println();


        System.out.println(task3(array1));
        System.out.println(task3(array2));
        System.out.println(task3(array3));
        System.out.println(task3(array4));

    }

    public static int[] task2(int[] arr) throws RuntimeException {
        int[] result = null;
        int i = arr.length - 1;
        int j = 0;
        boolean flag = false;
        while (i >= 0 && !flag) {
            flag = arr[i] == 4;
            j = i;
            i--;
        }
        if(flag) {
            result = new int[arr.length - j - 1];
            for (i = j + 1; i < arr.length; i++) {
                result[i - j - 1] = arr[i];
            }
        } else {
            throw new RuntimeException("Нет ни одного числа 4");
        }
        return result;
    }

    public static boolean task3(int[] arr) {

        boolean result = true;

        int count1 = 0;
        int count4 = 0;
        int i = 0;

        while (i < arr.length && result) {
            if(arr[i] == 1) {
                result = true;
                count1++;
            } else {
                if(arr[i] == 4) {
                    result = true;
                    count4++;
                } else {
                    result = false;
                }
            }
            i++;
        }
        return result && count1 > 0 && count4 > 0;
    }
}
