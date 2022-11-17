/**
 * PersonCreator
 */
public class PersonCreator {
    public static void main(String[] args) {
        Person Person01 = new Person("James", "Paterson", 34, 180, 73.5);
        Person Person02 = new Person("Bob", "Thornley", 25, 171, 68.2);
        
        System.out.println("Name: " + Person01.getFirstName() + " " + Person01.getLastName() + " Age: " + Person01.getAge() + " Height: " + Person01.getHeight() + "cm Weight: " + Person01.getWeight() + "lbs.");
        System.out.println("Name: " + Person02.getFirstName() + " " + Person02.getLastName() + " Age: " + Person02.getAge() + " Height: " + Person02.getHeight() + "cm Weight: " + Person02.getWeight() + "lbs.");

        Person01.growOlder();

        System.out.println("Name: " + Person01.getFirstName() + " " + Person01.getLastName() + " Age: " + Person01.getAge() + " Height: " + Person01.getHeight() + "cm Weight: " + Person01.getWeight() + "lbs.");

    }

}