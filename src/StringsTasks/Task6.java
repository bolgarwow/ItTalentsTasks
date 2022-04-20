/*Напишете програма, която конкатенира елементите на масив от
символни низове в един символен низ.*/
package StringsTasks;

public class Task6 {


    public static void main(String[] args) {

        System.out.print(massiveToString(new String[]{"sssfe","rfv ","32344 "}));
    }




    public static String massiveToString (String[] a)
    {
        String result="";

        for (String s : a) {

            result = result.concat(s);
        }

        return result;
    }
}
