package lesson19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class SearchLogic {
    public void startSearch(ArrayList<String> list, String stateNumber) {
        HashSet<String> set = new HashSet<>(list);
        TreeSet<String> set1 = new TreeSet<>(list);
        long startTime = System.nanoTime();
        if (list.contains(stateNumber)) {
            System.out.println("Поиск перебором: номер найден, поиск занял: " + (System.nanoTime() - startTime) + "нс");
        } else {
            System.out.println("Поиск перебором: номер не найден, поиск занял: " + (System.nanoTime() - startTime) + "нс");
        }
        long startBinaryTime = System.nanoTime();
        if (Collections.binarySearch(list, stateNumber) >= 0) {
            System.out.println("Бинарный поиск: номер найден, поиск занял: " + (System.nanoTime() - startBinaryTime) + "нс");
        } else {
            System.out.println("Бинарный поиск: номер не найден, поиск занял: " + (System.nanoTime() - startBinaryTime) + "нс");
        }
        long startHashTime = System.nanoTime();
        if (set.contains(stateNumber)) {
            System.out.println("Поиск в HashSet: номер найден, поиск занял: " + (System.nanoTime() - startHashTime) + "нс");
        } else {
            System.out.println("Поиск в HashSet: номер не найден, поиск занял: " + (System.nanoTime() - startHashTime) + "нс");
        }
        long startTreeTime = System.nanoTime();
        if (set1.contains(stateNumber)) {
            System.out.println("Поиск в TreeSet: номер найден, поиск занял: " + (System.nanoTime() - startTreeTime) + "нс");
        } else {
            System.out.println("Поиск в TreeSet: номер не найден, поиск занял: " + (System.nanoTime() - startTreeTime) + "нс");
        }
    }

}
