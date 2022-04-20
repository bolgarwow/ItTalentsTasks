/*Въведете неотрицателно цяло число n от клавиатурата и
конструирайте низа, който се получава от слепването на
числата 0, 1, 2, 3, … n*/

package StringsTasks;

import java.util.*;

public class Taks9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();


        while (true) {

            String tmp = scanner.next();
            int x;
            try {
                x = Integer.parseInt(tmp);
                if (x >= 0) {
                    list.add(x);
                    list.sort(Comparator.naturalOrder());
                    System.out.println(list.toString());
                }
            }
            catch(NumberFormatException e){

                if (tmp.equalsIgnoreCase("break"))
                {
                    System.out.println(list.toString());
                    break;
                }
                System.out.println("Please write integer");
            }

        }
    }
}

