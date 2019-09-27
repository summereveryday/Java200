import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("5.9: Display two highest grades \n");

        int count;
        int high_score = 0;
        String high_name = null;
        int second_high_score = 0;
        String second_high_name = null;
        int new_score;
        String new_name;

        System.out.print("Enter the number of students: ");
        count = in.nextInt();
        for (int i = 0; i < count; i++){
            System.out.print("Enter student's first name: ");
            new_name = in.next();
            System.out.print("Enter score: ");
            new_score = in.nextInt();
            if (new_score >= second_high_score){
                if (new_score >= high_score){
                    second_high_score = high_score;
                    second_high_name = high_name;
                    high_score = new_score;
                    high_name = new_name;
                }
                else {
                    second_high_score = new_score;
                    second_high_name = new_name;
                }
            }
        }
        System.out.println("Highest Score: " + high_name + ", " + high_score);
        System.out.println("Next Highest : " + second_high_name + ", " + second_high_score);

        System.out.println("6.9: Feet to Meeter Conversions");
        System.out.println("Feet\tMeters\t|\tMeters\tFeet");
        System.out.println("1\t\t" + footToMeter(1) + "\t|\t" + "20\t\t" + meterToFoot(20));
        System.out.println("2\t\t" + footToMeter(2) + "\t|\t" + "25\t\t" + meterToFoot(25));
        System.out.println("9\t\t" + footToMeter(9) + "\t|\t" + "60\t\t" + meterToFoot(60));
        System.out.println("10\t\t" + footToMeter(10) + "\t|\t" + "65\t\t" + meterToFoot(65));


        System.out.println("6.15: Tax Table");

    }

    public static double footToMeter(double foot){
        double meter = 0.305*foot;
        return meter;
    }

    public static double meterToFoot(double meter){
        double foot = 3.279*meter;
        return foot;
    }

    public static double computeTax(int status, double taxableIncome){
        
    }
}

