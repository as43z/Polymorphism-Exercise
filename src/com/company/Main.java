package com.company;

import java.util.Arrays;

public class Main {

    public static double sumaAreas(Figura[] v){
        double s = 0.0;

        for(Figura fig : v){
            s += fig.area();
        }
        return s;
    }

    public static void printArray(Figura[] vec){
        for (Figura fig : vec){
            System.out.println(fig.toString());
        }
        System.out.println("-----------------------------------------------------------");
    }

    public static void main(String[] args) {
        Figura[] v = new Figura[3];
        v[0] = new Rectangulo(5.0, 2.0);
        v[1] = new Circulo(2.0);
        v[2] = new Cuadrado(3.0);

        printArray(v);

        Arrays.sort(v);

        printArray(v);

        System.out.println("Area Total: " + sumaAreas(v));
    }
}
