package com.java.eratosthenessieve;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public  void primes(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj zakres, do którego chcesz wyświetlić liczby pierwsze: ");
        int n = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        int a = 1;
        for (int i = 2; i <= Math.floor(Math.sqrt(n)) ; i++ ) {
            for (int j = 2; j <= n; j++) {
                if (i * j <= n) {
                    a = i * j;
                    list.add(a);
                }
            }
        }
        System.out.println(list);

        int k = 2;
        while (k <= n ) {
            if (list.contains(k)) {
            } else {
                System.out.println("Liczba pierwsza: " + k);
            }
            k++;
        }
    }

    public static void main(String[] args) {
        Main primeNumbers = new Main();
        primeNumbers.primes();
    }
}
