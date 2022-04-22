package Figures;

public class Task5 {

    public static void main(String[] args) {


        /*  : Напишете програма която да изпринтва следната
фигура при въведено естествено число N чрез конзолата.
Големина на фигурата съответства на N.
Всяка подточка я решете в отделен файл.  */

        int count = 8;
        int tmp=1;


//        figure 1
        System.out.print("figure 1");
        for (int i = 0;i<count+1;i++)
        {
            for (int j = 0;j<i;j++){
                System.out.print(tmp+" ");
                tmp++;
            }
            tmp=1;
            System.out.println();
        }
        //        figure 2
        tmp=1;
        System.out.println("figure 2");
        for (int i = 0; i<count;i++)
        {

            for (int x = 0;x<i;x++)
            {
                System.out.print("  ");
            }
            for (int j = count-i;j>0;j--)
            {
                System.out.print(tmp+" ");
                tmp++;
            }
            tmp=1;
            System.out.println();
        }

        //        figure 3
        System.out.print("figure 3");
        for (int i = 0; i<=count;i++)
        {
            for (int j = count-i;j>0;j--)
            {
                System.out.print("  ");
            }
            for (int x = i;x>0;x--)
            {
                System.out.print(x+" ");
            }
            System.out.println();
        }

        //        figure 4
        System.out.println("figure 4");
        tmp = count;
        for (int i = count;i>0;i--) {
            for (int j = 0;j<i;j++){
                System.out.print(tmp+" ");
                tmp--;
            }
            tmp=i-1;
            System.out.println();
        }

        //        figure 5
        System.out.println("figure 5");
        tmp=1;
        for (int i = 0; i<count;i++){
            for (int f = count-i-1;f>0;f--){
                System.out.print("  ");
            }

            for (int j = i;j>0;j--){
                System.out.print(tmp+" ");
                tmp++;
            }
            for (int j = i+1;j>0;j--){
                System.out.print(tmp+" ");
                tmp--;
            }
            tmp=1;

            System.out.println();
        }

        //figure 6
        System.out.println("figure 6");
        tmp=1;
        for (int i = 0; i <count;i++){

            for (int r = i;r>0;r--){
                System.out.print("  ");
            }
            for (int j = i+1;j<count+1;j++)
            {
                System.out.print(tmp+" ");
                tmp++;
            }
            for (int x = count-i-1;x>0;x--)
            {
                System.out.print(x+" ");
            }

            for (int r = count-tmp;r>0;r--){
                System.out.print(" ");
            }

            tmp=1;
            System.out.println();
        }

        //figure 7
        System.out.println("figure 7");
        tmp=1;
        for (int i = 0; i<count+1;i++){
           for (int j = 0;j<i;j++){
               System.out.print(j+1+" ");
           }

           for (int h = count*2-i*2-1;h>0;h--){
               System.out.print("  ");
           }

            for (int r = i;r>+0;r--) {
                if (r!=8) {
                    System.out.print(r + " ");
                }
            }
           System.out.println();
        }

        //figure 8
        System.out.println("figure 8");
        tmp=1;
        for (int i = 0;i<count;i++){

           //left side

            for (int x = i;x<count;x++){
                System.out.print(tmp+" ");
                tmp++;
            }

            for (int s = 0;s<i*2-1;s++)
            {
                System.out.print("  ");
            }

           //right side
            for (int j = count-i;j>0;j--){
                if (j!=8) {
                    System.out.print(j + " ");
                }
            }
            tmp=1;
            System.out.println();
        }

    }
}
