package Collections;

import General.Car;

import java.util.*;
import General.Utils;

public class CollectionsMain {


    public static void main(String[] args) {


        Car car1 = new Car("red", "mercedes-benz", 2022);
        Car car2 = new Car("black", "audi", 2022);
        Car car3 = new Car("white", "toyota", 2020);
        Car car4 = new Car("white", "bmw", 2021);
        Car car5 = new Car("black", "audi", 2022);


        List<Car> carArrayList = new ArrayList<>();
        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);
        carArrayList.add(car4);
        carArrayList.add(car5);
        carArrayList.add(null);
        carArrayList.add(null);

        System.out.println("ArrayList-----");
        General.Utils.printCollection(carArrayList);


        Set<Car> carSet = new HashSet<>();
        carSet.add(car1);
        carSet.add(car2);
        carSet.add(car3);
        carSet.add(car4);
        carSet.add(car5);
        carSet.add(null);
        carSet.add(null);
        carSet.add(null);


        System.out.println("HashSet-----");
        General.Utils.printCollection(carSet);



        String[] stringArray = {"car","bike","bus"};
        List<String> stringList = Arrays.asList(stringArray);
        General.Utils.printCollection(stringList);
        System.out.println("Sort collection");
        Collections.sort(stringList);
        General.Utils.printCollection(stringList);

        String[] stringArray2 = stringList.toArray(new String[stringList.size()]);
        General.Utils.printArray(stringArray2);



    }





}