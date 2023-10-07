import java.util.Arrays;
public class Main {
    public static void selectionSort(double[] myNumbers) {
        int a = myNumbers.length;
        for (int i = 0; i < a - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a; j++) {
                if (myNumbers[j] < myNumbers[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = myNumbers[i];
            myNumbers[i] = myNumbers[minIndex];
            myNumbers[minIndex] = temp;
            System.out.println(Arrays.toString(myNumbers));        }
    }
    public static void main(String[] args) {
        double[] myNums = {8, -2, -4, 2, 3, 6, -7, 1.5, -2.5, 3.5, -1.5, 2.5, -3.5, 4.5, -5.5};
        for (int i = 0; i < myNums.length; i++) {
            System.out.println(myNums[i] + "\n");
        }
        double result = 0;
        int s = 0;
        boolean negativeNumber = false;

        for (double forNow : myNums) {
            if (!negativeNumber) {
                if (forNow < 0) {
                    negativeNumber = true;
                }
            } else {
                if (forNow > 0) {
                    result += forNow;
                    s++;
                }
            }
        }
        System.out.print("sum = ");
        System.out.println(result / s);
        double[] myNumbers = {8, -2, -4, 2, 3, 6, -7, 1.5, -2.5, 3.5, -1.5, 2.5, -3.5, 4.5, -5.5};
        System.out.println(Arrays.toString(myNumbers));
        selectionSort(myNumbers);
        System.out.println(Arrays.toString(myNumbers));
    }
}