package javaD.abstractfactorypattern;

import java.util.Scanner;

/*
 * The factory’s goal is to deliver a ready-to-use object to its client.
 * The factory hides the complexity of creating and selecting the right object for the job.
 */
public class MainFactory {

    public static void main(String[] args) {
        String cardNumber, bankCode;
        Scanner reader = new Scanner(System.in);
        BankFactory bankFactory = new BankFactory();
        System.out.println("Enter Card Number: ");
        cardNumber = reader.nextLine();
        bankCode = cardNumber.substring(0, 6);
        IBank bank = bankFactory.getBank(bankCode);
        IPaymentCard paymentCard = bankFactory.getPaymentCard("12");
        System.out.println(bank.withDraw());
        System.out.println(paymentCard.GetName());
    }
}
