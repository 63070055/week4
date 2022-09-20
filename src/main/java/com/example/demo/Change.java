package com.example.demo;

import java.io.Serializable;

public class Change implements Serializable {
    private double b1000, b500, b100, b20, b10, b5, b1;

    public Change(){
        this.b1000 = 0;
        this.b500 = 0;
        this.b100 = 0;
        this.b20 = 0;
        this.b10 = 0;
        this.b5 = 0;
        this.b1 = 0;
    }
    public Change(double a1000,  double a500, double a100, double a20, double a10, double a5, double a1){
        this.b1000 = a1000;
        this.b500 = a500;
        this.b100 = a100;
        this.b20 = a20;
        this.b10 = a10;
        this.b5 = a5;
        this.b1 = a1;
    }
    public void setB1000(double b1000){
        this.b1000 = b1000;
    }
    public double getB1000(){
        return b1000;
    }
    public void setB500(double b500){
        this.b500 = b500;
    }
    public double getB500(){
        return b500;
    }
    public void setB100(double b100){
        this.b100 = b100;
    }
    public double getB100(){
        return b100;
    }
    public void setB20(double b20){
        this.b20 = b20;
    }
    public double getB20(){
        return b20;
    }
    public void setB10(double b10){
        this.b10 = b10;
    }
    public double getB10(){
        return b10;
    }
    public void setB5(double b5){
        this.b5 = b5;
    }
    public double getB5(){
        return b5;
    }
    public void setB1(double b1){
        this.b1 = b1;
    }
    public double getB1(){
        return b1;
    }
}
