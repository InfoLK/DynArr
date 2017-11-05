package com.hgo;

public class DynArray {
    Inhaltstyp[] array = new Inhaltstyp[0];

    // Eine leere dynamische Reihung wird angelegt
    DynArray() {

    }

    // Wenn die Reihung kein Element enthält, wird der Wert wahr zurückgegeben, sonst der Wert falsch
    boolean isEmpty () {
        if(array.length < 1) {
            return true;
        } else {
            return false;
        }
    }

    // Der Inhaltswer des Elements an Position index wird zurückgegeben
    Inhaltstyp getItem(int index) {
        return array[index - 1];
    }

    // Die Anzahl der Elemente der dynamischen Reihung wird zurückgegeben
    int getLength () {
        return array.length;
    }

    // Ein neues Element mit dem angegebenen Inhaltswert wird am Ende der dynamischen Reihung eingefügt
    void append(Inhaltstyp inhalt) {
        Inhaltstyp[] temp = new Inhaltstyp[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        temp[array.length] = inhalt;
        array = temp;
    }

    // Ein neues Element mit dem angegebenen Inhaltswert wird an der Position index in die dynamische Reihung
    // eingefügt, falls an dieser Position  schon ein Element in der Reihung vorhanden ist. Das sich vorher ab dieser
    // Position befindende Element und alle weiteren werden nach hinten verschoben.
    void insertAt(int index, Inhaltstyp inhalt) {
        Inhaltstyp[] temp = new Inhaltstyp[array.length + 1];


    }

    // Der Inhaltswert des Elements an der Position index wird durch inhalt ersetzt. Falls die angegebene
    // Position nicht existiert, hat die Operation keine Wirkung
    void setItem(int index, Inhaltstyp inhalt) {
        array[index - 1] = inhalt;
    }

    void delete(int index) {

    }

    // TODO: setItem(), delete()
}