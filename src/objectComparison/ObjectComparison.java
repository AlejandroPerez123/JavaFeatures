package objectComparison;

import General.Car;

public class ObjectComparison {

    public static void main(String[] args){

        Car car1 = new Car("black","bmw",2022);
        Car car2 = new Car("black","bmw",2022);
        System.out.println("Equal:");

        System.out.println(car1 == car2);//false
        System.out.println(car1.equals(car2));//false (true if overridden)


        Integer int1= 5;
        Integer int3= 5;
        int int2 =5;

        System.out.println("Integer 5 == int 5? "+(int1==int2));
        System.out.println("Integer 5 == Integer 5? "+(int1==int3));

    }
}
