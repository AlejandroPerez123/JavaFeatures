package Collections;

import General.Car;

import java.util.*;

public class MapsMain {

    public static void main (String[] args){

        Car car1 = new Car("red", "mercedes-benz", 2022);
        Car car2 = new Car("black", "audi", 2022);
        Car car3 = new Car("white", "toyota", 2020);
        Car car4 = new Car("white", "bmw", 2021);
        Car car5 = new Car("black", "audi", 2022);


        Map<String, List<Car>> carHashTable = new Hashtable<>();
        List<Car> value1 = new LinkedList<>();
        value1.add(car1);
        //carHashTable.put(null,value1);


        List<Car> value2 = new LinkedList<>();

        Map<String,List<Car>> carHashMap = new HashMap<>();
        carHashMap.put(null,value1);
        carHashMap.put(null,value2);

        System.out.println("hashMap keys:");
        printSet(carHashMap.keySet());

    }

    static  <T> void printSet(Set<T> set){
        for (T elem:
             set) {
            System.out.println(elem);
        }
    }
}
