

import java.util.Scanner;

public class ReadAndReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is " + name);
        char[] nameChar = new char[name.length()];
        for (int i = 0; i < name.length(); i++) {
            nameChar[i] = name.charAt(i);
            System.out.println(nameChar[i]);
        }
        for (int i = name.length() - 1; i >= 0; i--) {
            nameChar[i] = name.charAt(i);
            System.out.println(nameChar[i]);
        }
    }
}
