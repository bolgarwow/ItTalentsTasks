/* Напишете програма, която брои колко пъти се среща всяка
английска буква в даден символен низ. Запазете резултатите в
масив.*/
package StringsTasks;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {


    public static void main(String[] args) {


        // check result of metod
        String[] sss = countCharInString("u.!+n Wn w n ");
        for (String s : sss) {
            System.out.println(s);
        }
    }




    public static String[] countCharInString(String a) {

        String b = a.toLowerCase();
        //create sample for compare
        String regex = "qwertyuiopasdfghjklzxcvbnm";
        Set<String> set = new TreeSet<>(Comparator.naturalOrder());

        // add to set with check only 'abc' e t c.
        for (int i = 0;i<b.length();i++)
        {
           if (regex.contains(String.valueOf(b.charAt(i))))
            {
                set.add(b.charAt(i)+"");
            }
        }
        int iter = 0;
        int cout = 0;
        String[] result = new String[set.size()];

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();

            for (int i = 0; i < b.length(); i++) {
                if (s.contains(b.charAt(i)+""))
                {
                    cout++;
                }
            }

            result[iter]=s+" = " +cout;
            cout = 0;
            iter++;

        }

        return result;
    }
}














