package rs.smoki.three.operatori;

import java.util.Scanner;

public class ComparasionDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvi broj: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj: ");
        int number2 = new Scanner(System.in).nextInt();
        boolean comparisonResoult = number1 == number2;

        if(comparisonResoult){
            System.out.println("Uneseni brojevi su jednaki");


        }

    }
}
