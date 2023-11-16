package rs.smoki.three.operatori;

public class UnaryDemo {
    public static void main(String[] args) {
        int number = 23;
        System.out.println(number);
        number = -23;
        System.out.println(number);
        number++;//POST incremment
        System.out.println(number);
        number = 23;
        ++number;//PRE incerement
        System.out.println(number);
        number = 23;
        System.out.println(number++ + " <<");

        boolean success = false;
        System.out.println(!success);


    }
}
