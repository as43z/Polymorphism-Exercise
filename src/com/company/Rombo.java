package com.company;

public class Rombo extends Figura{
    private double dMenor, dMayor;

    public Rombo(double dMenor, double dMayor){
        this.dMayor = dMayor;
        this.dMenor = dMenor;
    }

    @Override
    public double area(){
        return dMenor*dMayor/2;
    }

    @Override
    public String toString(){
        return "Rombo con diagonal mayor: " + this.dMayor + " y diagonal menor: " + this.dMenor + ", con Area: " + this.area();
    }
}
