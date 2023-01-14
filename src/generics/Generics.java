package generics;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Generics {


    public static void main(String[] args) {


    Integer[] intArray = {5, 8, 65, 24, 1, 3, 47};
    String[] stringArray = {"car", "cow", "bird", "screen"};
    Double[] doubleArray = {5.2, 68.3, 2.2, 5.5, 10.2};

    print(intArray);
    print(stringArray);
    print(doubleArray);


    printNumber(intArray);
    printNumber(doubleArray);

        System.out.println("first number "+returnFirstNumber(intArray));
        System.out.println("first number "+returnFirstNumber(doubleArray));

       // System.out.println(add(intArray, (a, b) -> a + b));

}


public static <T> void print(T[] array){

        for(T item:array){
            System.out.println(item.getClass().getName()+" "+item);
        }
}

public static <T extends Number> void printNumber(T[] array){
    for(T item:array){
        System.out.println(item.getClass().getName()+" "+item);
    }
}

public static <T extends Number> T returnFirstNumber(T[] array){
        return array[0];
}
//    public static <T> T add(T[] arr, BinaryOperator<T> op) {
//        return Arrays.stream(arr).reduce(op).get();
//    }

}

