package application;

import model.entities.Account;
import model.exceptions.TratamentoDeExcessoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Holder: ");
            String holder = scanner.nextLine();
            System.out.print("Initial balance: ");
            double balance = scanner.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = scanner.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = scanner.nextDouble();
            account.withdrawSaque(amount);
            System.out.println(account);

        } catch (InputMismatchException excessoes) {
            System.out.println("Invalid format");
        } catch (TratamentoDeExcessoes excessoes) {
            System.out.println("Withdraw error: " + excessoes.getMessage());
        }catch (Exception excepion){
            System.out.println("Fim De Programa por erro: ");
        }
        scanner.close();
    }
}
