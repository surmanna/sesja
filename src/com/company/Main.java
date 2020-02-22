package com.company;

import javax.swing.plaf.basic.BasicTreeUI;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Locale;

public class Main implements Sprzedaj {
    static ArrayList<Prism> mPrism = new ArrayList<>();
    private static Object ArrayList;
    private static Object Prism;

    public static void main(String[] args) {


        Cube cube = new Cube(4);
        RectangularPrism rectangularPrism = new RectangularPrism(3, 4, 5);
        TriangularPrism triangularPrism = new TriangularPrism(6,9);

        mPrism.add(new Cube(4));
        mPrism.add(new RectangularPrism(3, 4, 5));
        mPrism.add(new TriangularPrism(6,9));

        for (Prism prism : mPrism)
            prism.print();
    }

    @Override
    public void pukladajpodwzgledempowierzchni() {

    }

    @Override
    public void poukladajpodwzgledemobjetosci() {

    }
}




