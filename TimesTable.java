import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("What times table would youb like? :");
        int timesTable = Integer.parseInt(reader.nextLine());

        
        for (int i = 1; i < 13; i++) {
        System.out.println(i + " times "+ timesTable + " is " + (timesTable * i));
        };
         

        reader.close();
    }

}
