package com.MihaiMarius.laborator6;

import java.util.Arrays;

public class ListaOrdonata implements List {

    private int[] vector;

    ListaOrdonata(int[] vector) {
        this.vector = vector;
        sort();
    }

    private void sort() {
        Arrays.sort(vector);
    }

    @Override
    public void addElement(Integer integer) {
        int[] vectorNou = new int[vector.length + 1];
        System.arraycopy(vector, 0, vectorNou, 0, vector.length);
        vectorNou[vector.length] = integer;
        vector = vectorNou;
        sort();
    }

    @Override
    public boolean removeElement(Integer integer) {
        int index = -1;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == integer) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return false;
        }

        int[] anotherArray = new int[vector.length - 1];

        for (int i = 0, k = 0; i < vector.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = vector[i];
        }

        vector = anotherArray;
        sort();
        return true;
    }

    @Override
    public int removeAll(Integer integer) {
        int counter = 0;
        for (int i1 : vector) {
            if (i1 == integer) {
                counter++;
            }
        }

        if (counter != vector.length) {
            int[] anotherArray = new int[vector.length - counter];

            int j = 0;
            for (int i1 : vector) {
                if (i1 != integer) {
                    anotherArray[j++] = i1;
                }
            }
            vector = anotherArray;
        } else {
            vector = null;
        }
        return counter;
    }


    @Override
    public Integer get(int index) {
        if (vector == null || index < 0 || index > vector.length) {
            return null;
        }

        return vector[index];
    }

    @Override
    public int length() {
        return vector.length;
    }

    @Override
    public void printArray() {
        for (Integer integer : vector) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
