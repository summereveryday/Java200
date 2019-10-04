import java.util.Arrays;


class Main {
    public static void main(String[] args) {
        int [] myFirstArray = new int[10];

        for (int i = 0; i < 10; i++){
            myFirstArray[i] = i+1;
        }
        for (int i = 0; i < myFirstArray.length; i++){
            System.out.println(myFirstArray[i]);
        }
        System.out.println("Number of entries: " + myFirstArray.length);

        int[] numbers = {1, 2, 3, 4, 5};

        //For-Each Loop
        for(int number: numbers){
            System.out.println(number);
        }

        linearSearch(numbers, 5);

        int[] outOfOrder = {5, 2, 0, 56, 83, 12, 2, 54};
        Arrays.sort(outOfOrder);
        System.out.println(Arrays.toString(outOfOrder));
    }

    // How to pass an array as an argument
    public static void linearSearch(int[] array, int key){
        for (int i = 0; i < array.length; i++){
        if (key == array[i]) {
            System.out.println("Key: " + key + "\nFound at index #" + i);
        }
        }
    }
}