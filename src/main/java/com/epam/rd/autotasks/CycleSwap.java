package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int lastElement = array[array.length-1];
        for (int i = array.length-1; i > 0; i--) {
            array[i] = array[i-1];
        }
        array[0] = lastElement;

    }

    static void cycleSwap(int[] array, int shift) {
        if (array == null || array.length == 0 || shift == 0) {
            return;
        }
        int length = array.length;
        shift = shift % length;
        for (int i = 0; i < shift; i++) {
            int lastElement = array[length-1];
            for (int j = length-1; j > 0; j--) {
                array[j] = array[j-1];
            }
            array[0] = lastElement;
            
        }
    }
}

