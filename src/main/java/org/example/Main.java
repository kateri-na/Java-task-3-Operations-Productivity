package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static int numberOfCalls = 1000;
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>(List.of(56, 48, 33));
        LinkedList<Integer> linkedList = new LinkedList<Integer>(List.of(56, 48,33));

        long startTime, endTime;

        System.out.printf("Время выполнения %d операций add (в наносекундах):\n", numberOfCalls);
        startTime = System.nanoTime();
        for (int i=0; i<numberOfCalls; ++i) {
            arrayList.add(88);
        }
        endTime = System.nanoTime();
        System.out.printf("Array List: %d \n", endTime - startTime);
        startTime = System.nanoTime();
        for (int i=0; i<numberOfCalls; ++i) {
            linkedList.add(88);
        }
        endTime = System.nanoTime();
        System.out.printf("Linked List:%d \n", endTime - startTime);

        System.out.printf("Время выполнения %d операций delete (в наносекундах):\n", numberOfCalls);
        startTime = System.nanoTime();
        for (int i=0; i<numberOfCalls; ++i) {
            arrayList.remove(0);
        }
        endTime = System.nanoTime();
        System.out.printf("Array List: %d \n", endTime - startTime);
        startTime = System.nanoTime();
        for (int i=0; i<numberOfCalls; ++i) {
            linkedList.remove(0);
        }
        endTime = System.nanoTime();
        System.out.printf("Linked List:%d \n", endTime - startTime);

        System.out.printf("Время выполнения %d операций get (в наносекундах):\n", numberOfCalls);
        startTime = System.nanoTime();
        for (int i=0; i<numberOfCalls; ++i) {
            arrayList.get(0);
        }
        endTime = System.nanoTime();
        System.out.printf("Array List: %d \n", endTime - startTime);
        startTime = System.nanoTime();
        for (int i=0; i<numberOfCalls; ++i) {
            linkedList.get(0);
        }
        endTime = System.nanoTime();
        System.out.printf("Linked List:%d \n", endTime - startTime);

        System.out.printf("Время выполнения %d операций contains (в наносекундах):\n", numberOfCalls);
        startTime = System.nanoTime();
        for (int i=0; i<numberOfCalls; ++i) {
            arrayList.contains(0);
        }
        endTime = System.nanoTime();
        System.out.printf("Array List: %d \n", endTime - startTime);
        startTime = System.nanoTime();
        for (int i=0; i<numberOfCalls; ++i) {
            linkedList.contains(0);
        }
        endTime = System.nanoTime();
        System.out.printf("Linked List:%d \n", endTime - startTime);
    }
}
