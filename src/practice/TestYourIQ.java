package practice;

import java.util.Scanner;

public class TestYourIQ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(!input.equalsIgnoreCase("exit")){
            System.out.println("Enter Your Name here");
            input = scanner.nextLine();
            double iq = Math.random();
            System.out.println("Hi "+ input + ", your IQ is : " + iq);
        }
    }
}
