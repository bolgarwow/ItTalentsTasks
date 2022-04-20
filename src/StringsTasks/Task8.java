/*На някои мобилни телефони английската азбука се получава от
натискане на клавишите по следния начин: ABC(2), DEF(3),
GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9).
Напишете програма, която приема последователност от
натискания на клавиши (цифри) и конвертира
последователността към символен низ от английски букви. */
package StringsTasks;

public class Task8 {

    public static void main(String[] args) {


        //Hello world
        System.out.println(printMessages(44,33,555,555,666,0,9,666,777,555,3));



    }


    public static String printMessages (int...a){
       String result ="";
       String[] allSymvols = {" ","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WVYZ"};

        for (int i=0;i<a.length;i++)
        {
            String tmp = String.valueOf(a[i]);
            if (tmp.contains("0"))
            {
                result += " ";
            }
            if (tmp.startsWith("2"))
            {
                result+=allSymvols[2].charAt(tmp.length()-1);
            }
            if (tmp.startsWith("3"))
            {
                result+=allSymvols[3].charAt(tmp.length()-1);
            }
            if (tmp.startsWith("4"))
            {
                result+=allSymvols[4].charAt(tmp.length()-1);
            }
            if (tmp.startsWith("5"))
            {
                result+=allSymvols[5].charAt(tmp.length()-1);
            }
            if (tmp.startsWith("6"))
            {
                result+=allSymvols[6].charAt(tmp.length()-1);
            }
            if (tmp.startsWith("7"))
            {
                result+=allSymvols[7].charAt(tmp.length()-1);
            }
            if (tmp.startsWith("8"))
            {
                result+=allSymvols[8].charAt(tmp.length()-1);
            }
            if (tmp.startsWith("9"))
            {
                result+=allSymvols[9].charAt(tmp.length()-1);
            }
        }
        return result;
    }
}
