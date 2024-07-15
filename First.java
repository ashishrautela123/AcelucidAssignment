//Print triangle - and allow user to set height of it in. Like in the following case it’s 4

import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= (height - i); j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print("*");
            System.out.println();
        }
    }

}