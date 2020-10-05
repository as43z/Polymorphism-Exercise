package com.company;

public class Cuadrado extends Rectangulo{

    public Cuadrado(double l){
        super(l, l);
    }

    @Override
    public String toString(){
        return "Cuadrado de lado: " + this.getL1() + ", con Area: " + this.area();
    }
}
