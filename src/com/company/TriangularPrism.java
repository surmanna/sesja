package com.company;

public class TriangularPrism extends Prism {
    double a, h;
    TriangularPrism(double a,double h){
        this.a=a;
        this.h=h;
        evaluateBottom();
        evaluatefield();
        evaluateside_field();
        evaluateVolume();
    }
    @Override
    double evaluateVolume() {
        this.Volume = a*a/3*4*h;

        return Volume;
    }

    @Override
    double evaluatefield() {
        this.field= a*h+2*a*a/3*4;
        return 0;
    }

    @Override
    double evaluateside_field() {
        this.side_field=3*a*a;
        return side_field;
    }

    @Override
    double evaluateBottom() {
        this.Bottom=a*a/3*4;
        return Bottom;
    }

    @Override
    String getFigureInfo(){
        return "TriangularPrism";

    }
    @Override
    protected String info(){
        return info();
    }

    @Override
    void print(){
        super.print();
    }
}

