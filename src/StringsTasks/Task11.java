package StringsTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
       String hidWord = "jumbo";

        Scanner scanner = new Scanner(System.in);
        int countSteps = 10;
        String inLetters ="";
        String[] result = new String[hidWord.length()];
        for (int i = 0;i<result.length;i++)
        {
            result[i]="*";
        }



            while (countSteps!=0){

                //check finish game
                String checkFinal ="";
                for (String s : result) {
                    checkFinal+=s;
                }
                if (!checkFinal.contains("*"))
                {
                    System.out.println("winner");
                    break;
                }




            System.out.println("Write letter");
            String letter = scanner.next();

            if (hidWord.contains(letter)) {
                if (!inLetters.contains(letter)){
                    inLetters=inLetters+letter;

                    for (int i = 0;i<hidWord.length();i++)
                    {
                        if (letter.equals(String.valueOf(hidWord.charAt(i))))
                        {
                            result[i] = letter;
                        }
                    }
                        // print result
                    for (String s : result) {
                        System.out.print(s+" ");
                    }
                    System.out.println();

                }
                else {
                    System.out.println(letter+" already used");
                }
            }
            else
            {
                countSteps--;
                if (countSteps==0)
                {
                    break;
                }
                for (String s : result) {
                    System.out.print(s+" ");
                }
                System.out.println();
                System.out.println("Remaining "+countSteps+" steps");
            }

        }

           //finish game without win
            if (countSteps==0)
            {
                System.out.println("Game Over");
            }

    }


}
