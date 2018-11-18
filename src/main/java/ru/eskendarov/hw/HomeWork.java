package ru.eskendarov.hw;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class HomeWork {
   
    /**
     * 1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив, метод должен
     * вернуть новый массив, который получен путем вытаскивания элементов из исходного массива, идущих после последней
     * четверки. Входной массив должен содержать хотя бы одну четверку, в противном случае в методе необходимо выбросить RuntimeException.
     * Написать набор тестов для этого метода (варианта 3-4 входных данных)
     * вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ]
     */
    
    int[] returnAfterLastNumber(int[] ar, int number) {
        if (!contains(ar, number)) {
            throw new RuntimeException("Массив не содержит " + number);
        }
        int index = 0;
        for (int i = ar.length - 1; i >= 0; i--) {
            if (ar[i] == number) {
                index = i + 1;
                break;
            }
        }
        
        return Arrays.copyOfRange(ar, index, ar.length);
    }
   
    /**
     * 2. Написать метод, который проверяет что массив состоит только из чисел 1 и 4. Если в массиве нет хоть одной 4 или 1,
     * то метод вернет false;
     * Написать набор тестов для этого метода (варианта 3-4 входных данных)
     */
    
    boolean testArrayContent(int[] array, int... testNumbers) {
        // Проверка на то что элементы массива входят в диапазон тестовых
        Set<Integer> collect1 = Arrays.stream(testNumbers).boxed().collect(Collectors.toSet());
        for (int testedNumber : array) {
            if (!collect1.contains(testedNumber)) return false;
        }
        // Проверка на то что тестовые числа точно в массиве
        Set<Integer> collect2 = Arrays.stream(array).boxed().collect(Collectors.toSet());
        for (int testNumber : testNumbers) {
            if (!collect2.contains(testNumber)) return false;
        }
        return true;
    }
    private static boolean contains(int[] ar, int num) {
        return Arrays.stream(ar).parallel().anyMatch(value -> value == num);
    }
    
}