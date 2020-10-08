package com.company;

import java.util.Arrays;
import java.util.Scanner;

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
        Scanner scan = new Scanner(System.in);
        Figura[] v = new Figura[4];

        System.out.print("Dame un radio: ");
        double rad = scan.nextDouble();

        System.out.print("Dame los lados de un rectangulo: ");
        double l1 = scan.nextDouble();
        double l2 = scan.nextDouble();

        System.out.print("Dame el lado de un cuadrado: ");
        double l = scan.nextDouble();

        System.out.print("Dame la diagonal mayor y la diagonal menor de un rombo: ");
        double dMayor = scan.nextDouble();
        double dMenor = scan.nextDouble();

        v[0] = new Rectangulo(l1, l2);
        v[1] = new Circulo(rad);
        v[2] = new Cuadrado(l);
        v[3] = new Rombo(dMayor, dMenor);

        printArray(v);

        Arrays.sort(v);

        printArray(v);

        System.out.println("Area Total: " + sumaAreas(v));
    }
}
