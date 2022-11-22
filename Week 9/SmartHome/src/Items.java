public class Items {
    public static void main(String[] args) {
        SmartHome item01 = new SmartHome("Lamp", "Living Room");
        SmartHome item02 = new SmartHome("Socket", "Living Room");
        SmartHome item03 = new SmartHome("Speaker", "Kitchen");

        System.out.println("Your item is: " + item01.getItem() + ", It is located in: " + item01.getRoom());
        System.out.println("Your item is: " + item02.getItem() + ", It is located in: " + item02.getRoom());
        System.out.println("Your item is: " + item03.getItem() + ", It is located in: " + item03.getRoom());

        item01.setState(true);
        item03.setState(true);

        if (item01.getState() == true) {
            System.out.println("You have turned " + item01.getItem() + " ON");
        }
        if (item02.getState() == true) {
            System.out.println("You have turned " + item02.getItem() + " ON");
        }
        if (item03.getState() == true) {
            System.out.println("You have turned " + item03.getItem() + " ON");
        }

    }
}
