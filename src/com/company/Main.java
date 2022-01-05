package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        rekurencja silnia = new rekurencja();
        System.out.println("Liczymy silnię z podanego n");
        System.out.println("Podaj n");
        n = Integer.parseInt(br.readLine());

        System.out.println(n + "! = " + silnia.silnia(n));
    }
}
