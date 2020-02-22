package com.company;

public class RectangularPrism extends Prism {
    double a,b,c;
    RectangularPrism(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
        evaluateside_field();
        evaluatefield();
        evaluateVolume();
        evaluateBottom();

    }
    @Override
    double evaluateVolume() {
        this.Volume=a*b*c;
        return Volume;
    }

    @Override
    double evaluatefield() {
        this.field=2*a*b+2*a*c+2*b*c;
        return field;
    }

    @Override
    double evaluateside_field() {
        this.side_field=2*a*c+2*b*c;
        return side_field;
    }

    @Override
    double evaluateBottom() {
        this.Bottom=a*b;

        return Bottom;
    }

    @Override
    String getFigureInfo(){
        return "RectangularPrism";

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


