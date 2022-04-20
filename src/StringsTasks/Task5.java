/*. Напишете програма, която проверява дали даден символен низ
е анаграма (съдържа същите символи, но не задължително в
същия ред) на друг символен низ. Проверявайте само
английските букви.*/

package StringsTasks;

public class Task5 {

    public static void main(String[] args) {

        //check results
        System.out.println(isAnagramma("anna","David"));
        System.out.println(isAnagramma("anna","nano"));
        System.out.println(isAnagramma("nina","ianni"));
    }


    public static boolean isAnagramma (String a, String b)
    {
        boolean result= false;
        if (a.length()==b.length()) {
            for (int i = 0; i < a.length(); i++) {

                if (b.contains(String.valueOf(a.charAt(i)))){

                    result = true;
                }
                else {
                    result = true;
                    break;
                }

            }
        }


        return result;
    }



}
