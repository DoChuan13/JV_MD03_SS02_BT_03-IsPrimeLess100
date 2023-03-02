package IsPrime100;

import java.util.Scanner;

public class IsPrime100 {
    public static void main(String[] args) {
        boolean flagCheck;
        System.out.print("Prime List less than 100: ");
        for (int i = 2; i <= 100; i++) {
            flagCheck = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flagCheck = false;
                    break;
                }
            }
            if (flagCheck) {
                System.out.print(i + ", ");
            }
        }
    }
}
