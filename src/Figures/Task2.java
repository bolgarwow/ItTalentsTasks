package Figures;

/*
Въведете число N чрез конзолата и изкарайте като
резултат следната фигура с височина N и широчина N
# # # # # # #
 # # # # # # #
# # # # # # #
 # # # # # # #
# # # # # # #
 # # # # # # #
# # # # # # #

*/


import java.util.Scanner;

public class Task2 {

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
            if(i%2==0){
                print +=" ";
                System.out.println(" "+print);
            }
            else {
                System.out.println(print);
            }

        }
    }
}
