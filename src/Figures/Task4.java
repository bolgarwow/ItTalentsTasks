/*Въведете число N чрез конзолата и изкарайте
следните фигури, чиято големина да съответства на N.
Всяка подточка я решете в отделен файл*/

package Figures;

import java.util.Scanner;

public class Task4 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        //int cout = scanner.nextInt();
        int cout = 6;
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

        for (int i = 1; i <= cout; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = i; k <= cout; k++) {
                if (i == 1 || k == i || k == cout)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        for (int i = cout - 1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = i; k <= cout; k++) {
                if (i == 1 || k == i || k == cout)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        /*: Въведете число N чрез конзолата и изкарайте
следните фигури, чиято височина да съответства на N.
Всяка подточка я решете в отделен файл.
*/

        //figure 9
        System.out.println("figure 9");
        {
            for (int i = cout; i > 0; i--) {

                for (int x = cout - i; x > 0; x--) {
                    System.out.print("  ");
                }
                for (int r = cout - i * 2; r < cout - 1; r++) {
                    System.out.print("# ");

                }

                System.out.println();
            }

            //figure 10
            System.out.println("figure 10");
            for (int i = cout; i > 0; i--) {

                for (int x = cout - i; x > 0; x--) {
                    System.out.print("  ");
                }
                for (int r = cout - i * 2; r < cout - 1; r++) {
                    System.out.print("# ");

                }

                System.out.println();
            }
        }

        //figure 11
        System.out.println("figure 11");
        for (int i = 0;i<cout;i++)
        {
            for (int j = cout-i-1;j>0;j--)
            {
                System.out.print("  ");
            }
            for (int x = cout - i*2;x<=cout;x++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        //figure 12
        System.out.println("figure 12");
        {
            for (int i = 0; i < cout; i++) {
                for (int j = cout - i - 1; j > 0; j--) {
                    System.out.print("  ");
                }
                for (int x = cout - i * 2; x <= cout; x++) {
                    System.out.print("# ");
                }
                System.out.println();
            }
            for (int i = cout - 1; i > 0; i--) {

                for (int x = cout - i; x > 0; x--) {
                    System.out.print("  ");
                }
                for (int r = cout - i * 2; r < cout - 1; r++) {
                    System.out.print("# ");

                }

                System.out.println();
            }
        }

    }
}




