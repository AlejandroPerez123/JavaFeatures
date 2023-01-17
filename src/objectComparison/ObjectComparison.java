package objectComparison;

import General.Car;

public class ObjectComparison{

    public static void main(String[] args) throws CloneNotSupportedException {

        Car car1 = new Car("black","bmw",2022);
        Car car2 = new Car("black","bmw",2022);
        System.out.println("Equal:");

        System.out.println("car1 "+car1.hashCode());
        System.out.println("car2 "+car2.hashCode());
        Car car3 = car1;
        System.out.println("car3 "+ car3.hashCode());
        Car car4 = (Car) car1.clone();
        System.out.println("car4 "+car4.hashCode());


        System.out.println("car1 == car2?");
        System.out.println(car1 == car2);//false
        System.out.println("car1.equals(car2)?");
        System.out.println(car1.equals(car2));//false (true if overridden)
        System.out.println("car1 == car3?");
        System.out.println(car1==car3);
        System.out.println("car4 == car1");
        System.out.println(car4==car1);



        Integer int1= 5;
        Integer int3= 5;
        int int2 =5;

        System.out.println("Integer 5 == int 5? "+(int1==int2));
        System.out.println("Integer 5 == Integer 5? "+(int1==int3));


        String a = "hello";
        String b= "hello";
        System.out.println(a==b);
        System.out.println(a.equals(b));

    }
}
