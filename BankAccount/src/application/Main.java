package application;

import java.util.Locale;
import java.util.Scanner;
import model.entities.Account;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter account data");
        System.out.println("Number: ");
        int number = sc.nextInt();
        System.out.println("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Initial balance: ");
        Double balance = sc.nextDouble();
        System.out.println("Withdraw limit: ");
        Double withdraw = sc.nextDouble();

        System.out.println("Enter amount for withdraw: ");
        Double amount = sc.nextDouble();
        
        Account account = new Account(balance, holder, number, withdraw);
        System.out.println(account);
    }
}