package org.example.additional;

public class Asterisk_2 {
    public static void main(String[] args) {
        asterisk(5);
    }
    public static void asterisk(int n) {
        int asteriskSum = 1;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < asteriskSum; j++) {
                System.out.print('*');
            }
            asteriskSum++;
            if (i == 1) {
                System.out.print("");
            } else {
                System.out.println();
            }
        }
    }
}
