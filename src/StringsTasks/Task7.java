/*Напишете програма, която трансформира дадена матрица от
реални числа в символен низ, така че при отпечатване на
екрана на символния низ числата от матрицата да бъдат в
четим табличен вид с точност 2 цифри след десетичната точка.
*/

package StringsTasks;

public class Task7 {

    public static void main(String[] args) {

//        float[][] matrix =  new float[4][4];
//        matrix[0][0] = 3.33874f;
//        matrix[0][1] = 3.33874f;
//        matrix[0][2] = 3.33874f;
//        matrix[0][3] = 3.33874f;
//
//        matrix[1][0] = 3.33874f;
//        matrix[1][1] = 3.33874f;
//        matrix[1][2] = 3.33874f;
//        matrix[1][3] = 3.33874f;
//
//        matrix[2][0] = 3.33874f;
//        matrix[2][1] = 3.33874f;
//        matrix[2][2] = 3.33874f;
//        matrix[2][3] = 3.33874f;
//
//        matrix[3][0] = 3.33874f;
//        matrix[3][1] = 3.33874f;
//        matrix[3][2] = 3.33874f;
//        matrix[3][3] = 3.33874f;
//

    }


        public static String[] getMatrixToString (float[][] a)
        {
            String[] result = new String[a.length];

            for (int i = 0; i<a.length;i++)
            {
                String r = "";
                for (int j = 0;j<a.length;j++)
                {

                    r = r +  String.format("%.2f", a[i][j])+" ";

                }
                result[i] = r;
            }

            return result;
        }

    }

