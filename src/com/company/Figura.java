package com.company;

public abstract class Figura implements Comparable<Figura>{
    //funcion de area abstracta.
    public abstract double area();

    public int compareTo(Figura figCompare){
        return (int)(figCompare.area() - this.area());
    }
}
