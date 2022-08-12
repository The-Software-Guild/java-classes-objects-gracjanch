package basic.programing.assessment;

public class SummativeSums {
    public static void main(String[] args) {
        int [] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int [] array2 = { 999, -60, -77, 14, 160, 301 };
        int [] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99 };

        System.out.printf("#1 Array Sum: %1$d \n", sumOfArray(array1));
        System.out.printf("#2 Array Sum: %1$d \n", sumOfArray(array2));
        System.out.printf("#3 Array Sum: %1$d \n", sumOfArray(array3));
    }

    private static int sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
