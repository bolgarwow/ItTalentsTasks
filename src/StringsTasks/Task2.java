/*Напишете програма, която отпечатва на екрана инициалите на
името ви. Въведете името си от клавиатурата.*/
package StringsTasks;

import java.util.Scanner;

public class Task2
{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       System.out.println("Please write your name");
        String name = scanner.next();
        System.out.println("Please write your Family name");
        String firstName = scanner.next();

        scanner.close();


        System.out.println("Your full name is " + firstName + " "+ name);
    }

}
