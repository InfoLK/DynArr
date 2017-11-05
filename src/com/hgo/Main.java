package com.hgo;

public class Main {

    public static void main(String[] args) {
        Inhaltstyp inhalt = new Inhaltstyp(123);
        DynArray arr = new DynArray();
        System.out.println(arr.isEmpty());
        arr.append(inhalt);
        System.out.println(arr.isEmpty());
        System.out.println(arr.getItem(1)._int);

        //System.out.println(arr.getLength());

    }
}
