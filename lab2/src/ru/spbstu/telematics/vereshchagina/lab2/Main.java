package ru.spbstu.telematics.vereshchagina.lab2;

import java.util.Scanner;
public class Main {

    public static class ArrayList<T> {
        private final int SIZE = 16;
        private final int CUTRATE = 4;
        private Object[] array = new Object[SIZE];
        private int pointer = 0;
        private T value;
        // resize
        private void resize(int NewLength) {
            Object[] newArray = new Object[NewLength];
            System.arraycopy(array, 0, newArray, 0, pointer);
            array = newArray;
        }

        // add
        void add(T a) {
            resize(array.length + 1);
            array[pointer++] = a;
        }

        // get
        public T get(int index) {
            return (T) array[index];
        }

        // size
        public int size() {
            return pointer;
        }


        // remove
        void removeByIndex(int index) {
            for (int i = index; i < pointer; i++)
                array[i] = array[i + 1];
            array[pointer] = null;
            pointer--;
            if (array.length > SIZE && pointer < array.length / CUTRATE)
                resize(array.length / 2);

        }
        // out / contains
        void out() {
            for (int i = 0; i < array.length; i++) {
                if (array[i]!= null)
                    System.out.println(array[i]);

            }
        }
    }


    public static void main(String[] args) {
        System.out.println("Lab #2 - Array List");

        System.out.println("\n1. Make list");
        ArrayList <String> listFirst = new ArrayList<>();
        listFirst.add("aaa");
        listFirst.add("bbb");
        listFirst.add("ccc");
        listFirst.out();

        System.out.println("\n2. Remove by index - 1");
        listFirst.removeByIndex(1);
        listFirst.out();

        System.out.println("\n3. Get by index - 1");
        String str1 = listFirst.get(1);
        System.out.print(str1);

        System.out.println("\n4. Add string - Hello");
        listFirst.add("Hello");
        listFirst.out();

        System.out.println("\n5. Print size");
        int size = listFirst.size();
        System.out.println(size);

    }
}

