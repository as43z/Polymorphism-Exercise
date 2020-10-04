package com.company;

public class Rectangulo extends Figura {
    private double l1, l2;

    public Rectangulo(double l1, double l2){
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    public double area(){
        return this.l1*this.l2;
    }
}
