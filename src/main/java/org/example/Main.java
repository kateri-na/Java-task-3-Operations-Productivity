package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(List.of(56, 48, 33));
        LinkedList<Integer> linkedList = new LinkedList<Integer>(List.of(56, 48,33));

        long startTime, endTime;

        System.out.println("Время выполнения операции добавления (в наносекундах):");
        startTime = System.nanoTime();
        arrayList.add(88);
        endTime = System.nanoTime();
        System.out.printf("Array List: %d \n", endTime - startTime);
        startTime = System.nanoTime();
        linkedList.add(88);
        endTime = System.nanoTime();
        System.out.printf("Linked List: %d \n", endTime - startTime);

        System.out.println("Время выполнения операции удаления (в наносекундах):");
        startTime = System.nanoTime();
        arrayList.remove(3);
        endTime = System.nanoTime();
        System.out.printf("Array List: %d \n", endTime - startTime);
        startTime = System.nanoTime();
        linkedList.remove(3);
        endTime = System.nanoTime();
        System.out.printf("Linked List: %d \n", endTime - startTime);
    }
}
