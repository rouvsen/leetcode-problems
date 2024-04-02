package org.example.additional;

public class Asterisk_3 {
    public static void main(String[] args) {
        asterisk(5);
    }
    public static void asterisk(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
