package com.company;

public class Cube extends Prism{
    double a;
    Cube (double a){
        this.a=a;
        evaluatefield();
        evaluateBottom();
        evaluateside_field();
        evaluateVolume();

    }
    @Override
    double evaluateBottom() {
        this.Bottom = a*a;

        return Bottom;
    }

    @Override
    double evaluateVolume() {
        this.Volume = a *a *a;
        return Volume;
    }

    @Override
    double evaluatefield() {
        this.field=6*a*a;

        return field;
    }

    @Override
    double evaluateside_field() {
        this.side_field=4*a*a;
        return side_field;
    }

    @Override
    String getFigureInfo(){
        return "Cube";

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
