package rs.smoki.three.operatori;

import javax.swing.*;

public class AritmeticDemo {

    public static void main(String[] args) {
        String number1 = JOptionPane.showInputDialog("Unesi prvi broj");
        int intNumber1 = Integer.parseInt(number1);

        String number2 = JOptionPane.showInputDialog("Unesi drugi broj");
        int intNumber2 = Integer.parseInt(number2);
        int suma = intNumber1 + intNumber2;
        JOptionPane.showMessageDialog(null, "Suma = " + suma);
        int division = intNumber1/intNumber2;
        JOptionPane.showMessageDialog(null,"Division = " + division);

    }
}
