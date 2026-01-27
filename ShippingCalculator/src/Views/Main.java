package Views;

import Entities.ExpressFreight;
import Entities.Freight;
import Entities.StandardFreight;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Freight> list = new ArrayList<>();
        int i = 0;

        System.out.println("Enter the number of freights: ");
        int freight = sc.nextInt();

        do {
            System.out.println("Freight #" + (i+1) + " data");
            System.out.println("Standard or Express (s/e)? ");
            char type = sc.next().charAt(0);

            if (type == 's') {
                System.out.println("Distance: ");
                double distance = sc.nextDouble();
                System.out.println("Weight: ");
                double weight = sc.nextDouble();
                StandardFreight standardFreight = new StandardFreight(distance, weight);
                list.add(standardFreight);
            }
            if (type == 'e') {
                System.out.println("Distance: ");
                double distance = sc.nextDouble();
                System.out.println("Insurance value: ");
                double insuranceValue = sc.nextDouble();
                ExpressFreight expressFreight = new ExpressFreight(distance, insuranceValue);
                list.add(expressFreight);
            }
            i++;
        }
        while (i < freight);

        System.out.println();
        System.out.println("FREIGHT PAYMENTS: ");

        for (Freight f : list){
            System.out.println("Freight payment: $ " + String.format("%.2f", f.calculateFreight()));
        }
    }
}