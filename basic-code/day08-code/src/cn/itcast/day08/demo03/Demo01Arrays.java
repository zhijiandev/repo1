package cn.itcast.day08.demo03;

import java.util.Arrays;

public class Demo01Arrays {

    public static void main(String[] args) {

        int[] intArray = {10,20,30};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        int[] array1 = {2,1,3,6,10};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2 = {"bbb","aaa","ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
