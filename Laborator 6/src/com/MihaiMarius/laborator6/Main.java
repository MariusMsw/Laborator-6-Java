package com.MihaiMarius.laborator6;

public class Main {
    public static void main(String[] args) {
        int[] vector = {5, 2, 1, 7, 52, 54, 12, 16, 48, 25, 7, 99, 7};

        ListaOrdonata listaOrdonata = new ListaOrdonata(vector);

        listaOrdonata.printArray();
        System.out.println(listaOrdonata.length());
        listaOrdonata.removeElement(54);
        System.out.println(listaOrdonata.length());
        listaOrdonata.printArray();
        listaOrdonata.addElement(300);
        listaOrdonata.printArray();
        listaOrdonata.removeAll(7);
        listaOrdonata.printArray();
        System.out.println(listaOrdonata.get(7));



    }
}
