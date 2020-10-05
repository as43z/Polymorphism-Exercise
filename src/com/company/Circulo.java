package com.company;

public class Circulo extends Figura{
    private double rad;

    public Circulo(){
        //
    }

    public Circulo(double rad){
        this.rad = rad;
    }

    @Override
    public double area(){
        return Math.PI*this.rad*this.rad;
    }
}
