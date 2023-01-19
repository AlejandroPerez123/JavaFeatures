package streams;

import General.Account;
import General.Car;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.java2d.loops.FillRect;

import java.util.*;
import java.util.stream.Collectors;


public class Streams {

    static List<Account> accounts = new LinkedList<>();
    ;

    static {

        Account acc1 = new Account("my savings", 2525, 520.0);
        Account acc2 = new Account("to save some money", 2122, 240.0);
        Account acc3 = new Account("checking", 2424, 7850.0);
        Account acc4 = new Account("shared", 2626, 10000.0);
        Account acc5 = new Account("business", 2727, 45000.50);

        accounts.add(acc1);
        accounts.add(acc2);
        accounts.add(acc3);
        accounts.add(acc4);
        accounts.add(acc5);

        System.out.println(accounts.toString());


    }

    public static void main(String[] args) {

        System.out.println("-------------Add 1 to each balance");
        accounts.stream().forEach(account -> account.setBalance(account.getBalance() + 1));
        System.out.println(accounts.toString());

        System.out.println("---------------Print accounts with balance higher than 5,000.0");
        accounts.stream().filter(account -> account.getBalance() > 5000.0).forEach(System.out::println);

        System.out.println("-------------Print total balance");
        double balanceSum = accounts.stream().map(Account::getBalance).reduce(0.0, Double::sum);
        System.out.println("Sum of balance from all accounts: " + balanceSum);

        System.out.println("-------------Remove 2424");
        accounts.removeIf(account -> account.getNumber() == 2424);
        System.out.println(accounts.toString());

        System.out.println("---------------print average account balance");
        double average = accounts.stream().mapToDouble(Account::getBalance).average().getAsDouble();
        System.out.println("Average Balance: " + average);

        System.out.println("-------------Max account balance");
        //Optional<Account> accountWithMaxBalance = accounts.stream().max(Comparator.comparing(Account::getBalance));
        //System.out.println(accountWithMaxBalance.orElseGet(null).getBalance());

        Account accountWithMaxBalance = accounts.stream().max(Comparator.comparing(Account::getBalance))
                .orElseThrow(NoSuchElementException::new);


        System.out.println("-----------CARS");
        Car car1 = new Car("red", "mercedes-benz", 2022);
        Car car2 = new Car("black", "audi", 2022);
        Car car3 = new Car("white", "toyota", 2020);
        Car car4 = new Car("white", "bmw", 2021);
        Car car5 = new Car("black", "audi", 2022);

        List<Car> allCars = new LinkedList<Car>();
        allCars.add(car1);
        allCars.add(car2);
        allCars.add(car3);
        allCars.add(car4);
        allCars.add(car5);


        System.out.println("---------White cars");
        List<Car> whiteCars = allCars.stream().filter(car -> car.getColor().equalsIgnoreCase("white")).collect(Collectors.toList());
        General.Utils.printCollection(whiteCars);


        System.out.println("------------ Add one year");
        List<Car> carsPlusOneYear = allCars.stream().peek(car -> car.setYear(car.getYear() + 1)).collect(Collectors.toList());
        General.Utils.printCollection(carsPlusOneYear);
    }
}

