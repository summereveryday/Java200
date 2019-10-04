import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] array = new double[10];

        System.out.print("Enter 10 numbers (with spaces in between): ");
        for (int i = 0; i < 10; i++){
            array[i] = in.nextDouble();
        }
        System.out.println("Average: " + average(array));
    }

    // How to pass an array as an argument
    public static int average(int[] array){
        int sum = 0;
        int i = 0;
        while (i < array.length){
           sum += array[i];
           i++;
        }
        return sum/i;
        }

    public static double average(double[] array){
        int sum = 0;
        int i = 0;
        while (i < array.length){
            sum += array[i];
            i++;
        }
        return sum/i;
    }
}