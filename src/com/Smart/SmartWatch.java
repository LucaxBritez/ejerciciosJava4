package com.Smart;

public class SmartWatch extends SmartDivice {
    String marca;
    boolean accesorios;

    public SmartWatch(String marca, boolean accesorios) {
        this.marca = marca;
        this.accesorios = accesorios;
    }

    public String toString(){
        return this.marca + " " +this.accesorios;
    }
}

