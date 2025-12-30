package Application;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int[] totalFreights = new int[freights];

        System.out.println("Enter the number of freights:");
        int freights = sc.nextInt();

        for(int i = 0; i < freights; i++){
            System.out.print("Freight #" + (i+1) + " data:");
            System.out.println("Standard or express (s/e)?");
            String type = sc.nextLine();
            
            if(type.equals("s")){
                System.out.print("Distance: ");
                double distance = sc.nextDouble();
                System.out.print("Weight:");
                double weight = sc.nextDouble();

                StandardFreight StandardFreight = new StandardFreight(distance, weight);
            } else if(type.equals("e")) {
                System.out.print("Distance: ");
                double distance = sc.nextDouble();
                System.out.print("Insurance Value: ");
                double insuranceValue = sc.nextDouble;

                ExpressFreight ExpressFreight = new ExpressFreight(distance, insuranceValue);
            } else {
                System.out.println("Invalid type. Please enter 's' or 'e'.")
                i--;
                continue;
            }

            System.out.println()
            
        }
    }
}