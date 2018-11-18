package ru.eskendarov.hw;

import org.junit.Test;

import java.util.Arrays;

public class HomeWorkTest extends HomeWork {
    
    @Test
    public void goTest() {
        
        int array1[] = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int array2[] = {1, 1, 1, 1, 4, 1, 4, 1, 1};
        int array3[] = {1, 3, 1, 1, 4, 1, 6, 6, 1};
        int array4[] = {1, 4, 1, 1, 87, 1, 3, 0, 1};
        int array5[] = {0, 0, 1, 0, 1, 1, 0, 1, 1};
        
        System.out.println(Arrays.toString(new HomeWork().returnAfterLastNumber(array1, 4)));
        System.out.println(Arrays.toString(new HomeWork().returnAfterLastNumber(array2, 4)));
        System.out.println(Arrays.toString(new HomeWork().returnAfterLastNumber(array3, 4)));
        System.out.println(Arrays.toString(new HomeWork().returnAfterLastNumber(array4, 4)));
        System.out.println(new HomeWork().testArrayContent(array1, 3, 6));
        System.out.println(new HomeWork().testArrayContent(array2, 4, 1));
        System.out.println(new HomeWork().testArrayContent(array3, 2, 3));
        System.out.println(new HomeWork().testArrayContent(array5, 0, 1));
    }
}

/*
*
[1, 7]
[1, 1]
[1, 6, 6, 1]
[1, 1, 87, 1, 3, 0, 1]
false
true
false
true
*
* */