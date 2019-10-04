public class Main {
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
        for(int number: numbers){
            System.out.println(number);
        }
    }
}