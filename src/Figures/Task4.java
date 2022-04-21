/*Въведете число N чрез конзолата и изкарайте
следните фигури, чиято големина да съответства на N.
Всяка подточка я решете в отделен файл*/

package Figures;

import java.util.Scanner;

public class Task4 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        //int cout = scanner.nextInt();
        int cout = 8;
        scanner.close();

        String a = "# ";
        System.out.println("figure1");
        for (int i = 0; i < cout; i++) {
            System.out.println(a);
            a += "# ";
        }

        System.out.println("figure2");
        a = "# ";
        for (int i = 0; i < cout; i++) {
            for (int j = cout - i; j > 0; j--) {
                System.out.print(a);
            }
            System.out.println();
        }

        System.out.println("figure 3");
        a = "# ";
        for (int i = 0; i < cout; i++) {
            for (int r = i; r > 0; r--) {
                System.out.print("  ");
            }
            for (int j = cout - i; j > 0; j--) {
                System.out.print(a);
            }
            System.out.println();
        }

        System.out.println("figure 4");
        a = "# ";
        for (int i = 0; i < cout; i++) {
            for (int j = cout - i; j > 1; j--) {
                System.out.print("  ");
            }
            System.out.print(a);
            a += "# ";
            System.out.println();
        }

        System.out.println("figure 5");
        a = "# ";
        for (int i = 0; i < cout; i++) {
            if (i == 0 || i == cout - 1) {
                for (int j = 0; j < cout; j++) {
                    System.out.print(a);
                }
                System.out.println();


            } else {
                System.out.print(a);
                for (int j = 0; j < cout - 2; j++) {
                    System.out.print("  ");
                }
                System.out.print(a);
                System.out.println();
            }


        }

        System.out.println("figure 6");
        for (int i = 0; i < cout; i++) {
            if (i == 0 || i == cout - 1) {
                for (int j = 0; j < cout; j++) {
                    System.out.print(a);
                }
                System.out.println();


            } else {
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                System.out.println(a);
                // System.out.println();


            }


        }

        System.out.println("figure 7");
        a = "# ";
        for (int i = 0; i < cout; i++) {
            if (i == 0 || i == cout - 1) {
                for (int j = 0; j < cout; j++) {
                    System.out.print(a);
                }
                System.out.println();


            } else {
                for (int j = cout - 1 - i; j > 0; j--) {
                    System.out.print("  ");
                }
                System.out.println(a);
            }


        }

        System.out.println("figure 8");
        a = "# ";
        int tmp = cout -2;

        for (int i = 0; i < cout; i++) {
            if (i == 0 || i == cout - 1) {
                for (int j = 0; j < cout; j++) {
                    System.out.print(a);
                }
                System.out.println();
            } else {
                for (int j = cout-2;j>0;j--)
                {
                    System.out.print("f");
                }
                System.out.println();
            }
        }


    }
}


