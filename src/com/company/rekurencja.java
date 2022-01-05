package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rekurencja {
    public long silnia(int liczba){
        long zwrot = 1;
        if(liczba >= 2){
            zwrot = liczba*silnia(liczba-1);
        }
        return zwrot;
    }
}


