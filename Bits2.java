package com.company;

import java.util.Scanner;
public class Bits2 {


    public static void main(String[] args) {

        // Задание 2. Вывести на консоль 2 в степени n. Для вычислений использовать только побитовыке операции

        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите степень числа 2 :");
        int n= scanner.nextInt();
        double m = 2 << (n - 1);
        System.out.println("Результат :" + m);
        }

}
















