package rs.smoki.three.operatori;

import javax.swing.*;

public class StringDemo {
    public static void main(String[] args) {
        String ime = JOptionPane.showInputDialog("Unesi svoje ime: ");
        String prezime = JOptionPane.showInputDialog("Unesite svoje prezime: ");
        String resoult = ime +prezime;
        String formattedResoult = ime + " " + prezime;
        JOptionPane.showMessageDialog(null, formattedResoult);
    }
}
