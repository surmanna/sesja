package com.company;

abstract public class Prism {
    double Volume;
    double field;
    double side_field;
    double Bottom;

    abstract double evaluateVolume();
    abstract double evaluatefield();
    abstract double evaluateside_field();
    abstract double evaluateBottom();

    abstract String getFigureInfo();
    protected String info(){
        return "Prism - funkcja z klasy bazowej";

    }
    void print (){
        System.out.println(getFigureInfo());
        System.out.println("Wyswietl objetosc figury" + Volume);
        System.out.println("Wyswietl pole figury " + field);
        System.out.println("Wyswietl pole boczne figury " + side_field);
        System.out.println("Wyswietl objetosc figury " + Bottom);

    }

}
