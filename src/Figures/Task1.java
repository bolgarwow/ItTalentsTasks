/*
Въведете число N чрез конзолата и изкарайте като
резултат следната матрица с височина N и широчина N
# # # # #
# # # # #
# # # # #
# # # # #
# # # # #
*/

package Figures;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();


        for (int i = 0;i<a;i++)
        {
            String print = "";
            for (int j =0;j<a;j++)
            {
                print +="# ";
            }
            System.out.println(print);
        }
    }
}

