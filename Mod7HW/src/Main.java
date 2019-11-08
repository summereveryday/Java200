import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //11.11 Sort Array List
        System.out.println("11.11 Sort Array List");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            list.add(in.nextInt());
        }
        sort(list);

        //13.1
    }

    public static void sort(ArrayList<Integer> list){
        Collections.sort(list);
        System.out.println(list);
    }

}
