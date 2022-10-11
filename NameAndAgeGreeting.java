import java.util.Scanner;

public class NameAndAgeGreeting {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Hay who are you: ");
        String name = reader.nextLine();

        //Reads a line from the user keyboard
        System.out.print("You look like an old fart! how old even are you: ");
        int age = Integer.parseInt(reader.nextLine());
        //Reads a string var from keyboard and transfers it to an integer

        System.out.print("Your name is: " + name);
        System.out.print(", and you are " + age);
        System.out.print(" years old, you're looking much older!");


        reader.close();
    }
    
}
