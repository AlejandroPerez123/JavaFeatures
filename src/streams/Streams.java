package streams;

import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;





public class Streams {

    static List<Account> accounts = new LinkedList<>();;
    static {

        Account acc1 = new Account("my savings",2525,520.0);
        Account acc2 = new Account("to save some money", 2122,240.0);
        Account acc3 = new Account("checking",2424,7850.0);
        Account acc4 = new Account("shared",2626,10000.0);
        Account acc5 = new Account("business", 2727,45000.50);

        accounts.add(acc1);
        accounts.add(acc2);
        accounts.add(acc3);
        accounts.add(acc4);
        accounts.add(acc5);

        System.out.println(accounts.toString());



    }

    public static void main(String[] args) {

        // Add 1 to each balance
        accounts.stream().forEach( account -> account.setBalance(account.getBalance()+1));
        System.out.println(accounts.toString());

        // Print accounts with balance higher than 5,000.0
        accounts.stream().filter(account -> account.getBalance()>5000.0).forEach(System.out::println);

        // Print total balance
        double balanceSum =  accounts.stream().map(Account::getBalance).reduce(0.0,Double::sum);
        System.out.println("Sum of balance from all accounts: "+balanceSum);

        // remove 2424
        accounts.removeIf(account -> account.getNumber()== 2424);
        System.out.println(accounts.toString());

        // print average account balance
        double average = accounts.stream().mapToDouble(Account::getBalance).average().getAsDouble();
        System.out.println("Average Balance: "+average);
    }

}


