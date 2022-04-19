/* Напишете програма, която проверява дали даден символен низ
е палиндром (един и същ е отпред назад и отзад напред). */

package StringsTasks;

public class Task3 {


    public static boolean checkStartandEndOfString (String a )
    {
       StringBuilder stringBuilder = new StringBuilder(a).reverse();

       return a.contains(stringBuilder);
    }


}
