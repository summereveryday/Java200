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

        System.out.println("\n6.9: Feet to Meeter Conversions");
        System.out.println("Feet\tMeters\t|\tMeters\tFeet");
        int feet = 1;
        int meter = 20;
        while (feet <= 10){
            System.out.println(feet + "\t\t" + footToMeter(feet) + "\t|\t" + meter + "\t\t" + meterToFoot(meter));
            feet +=1;
            meter += 5;
        }


        System.out.println("\n6.15: Tax Table");
        int taxableIncome = 50000;
        System.out.println("Taxable\t\t\tSingle\t\t\tMarried Joint\tMarried\t\t\tHead of");
        System.out.println("Income\t\t\t\t\t\t\tor Widower\t\tSeperate\t\tHousehold");
        while (taxableIncome <= 60000){
            System.out.print(taxableIncome + "\t\t\t");
            for (int status = 0; status < 4; status ++){
                System.out.print(Math.round(computeTax(status, taxableIncome)) + "\t\t\t");
            }
            taxableIncome += 50;
            System.out.print("\n");
        }

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
        double tax = 0;

        if (status == 0) { // Compute tax for single filers
            if (taxableIncome <= 8350)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 33950)
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            else if (taxableIncome <= 82250)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                        + (taxableIncome - 33950) * 0.25;
            else if (taxableIncome <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950)
                        * 0.25 + (taxableIncome - 82250) * 0.28;
            else if (taxableIncome <= 372950)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950)
                        * 0.25 + (171550 - 82250) * 0.28
                        + (taxableIncome - 171550) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950)
                        * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550)
                        * 0.33 + (taxableIncome - 372950) * 0.35;
        } else if (status == 1) { // Compute tax for married file jointly
            if (taxableIncome <= 16700)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 67900)
                tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
            else if (taxableIncome <= 137050)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15
                        + (taxableIncome - 67900) * 0.25;
            else if (taxableIncome <= 208850)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900)
                        * 0.25 + (taxableIncome - 137050) * 0.28;
            else if (taxableIncome <= 372950)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900)
                        * 0.25 + (208850 - 137050) * 0.28
                        + (taxableIncome - 208850) * 0.33;
            else
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900)
                        * 0.25 + (208850 - 137050) * 0.28 + (372950 - 208850)
                        * 0.33 + (taxableIncome - 372950) * 0.35;
        } else if (status == 2) { // Compute tax for married separately
            if (taxableIncome <= 8350)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 33950)
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            else if (taxableIncome <= 68525)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15
                        + (taxableIncome - 33950) * 0.25;
            else if (taxableIncome <= 104425)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950)
                        * 0.25 + (taxableIncome - 68525) * 0.28;
            else if (taxableIncome <= 186475)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950)
                        * 0.25 + (104425 - 68525) * 0.28
                        + (taxableIncome - 104425) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950)
                        * 0.25 + (104425 - 68525) * 0.28 + (186475 - 104425)
                        * 0.33 + (taxableIncome - 186475) * 0.35;
        } else if (status == 3) { // Compute tax for head of household
            if (taxableIncome <= 11950)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 45500)
                tax = 11950 * 0.10 + (taxableIncome - 11950) * 0.15;
            else if (taxableIncome <= 117450)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15
                        + (taxableIncome - 45500) * 0.25;
            else if (taxableIncome <= 190200)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500)
                        * 0.25 + (taxableIncome - 117450) * 0.28;
            else if (taxableIncome <= 372950)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500)
                        * 0.25 + (190200 - 117450) * 0.28
                        + (taxableIncome - 190200) * 0.33;
            else
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500)
                        * 0.25 + (190200 - 117450) * 0.28 + (372950 - 190200)
                        * 0.33 + (taxableIncome - 372950) * 0.35;
        } else {
            System.out.println("Error: invalid status");
            return 0;
        }

        return tax;
    }
}

