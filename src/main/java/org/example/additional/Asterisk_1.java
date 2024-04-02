package org.example.additional;

public class Asterisk_1 {
    public static void main(String[] args) {
        asterisk(5);
    }
    public static void asterisk(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            if(i == n) {
                System.out.print("");
            } else
                System.out.println();
        }
    }
}
