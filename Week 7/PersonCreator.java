/**
 * PersonCreator
 */
public class PersonCreator {
    public static void main(String[] args) {
        Person Person01 = new Person(James, Paterson, 34, 180, 73.5);
        Person Person02 = new Person(Bob, Thornley, 25, 171, 68.2);
        
    }

}

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private double weight;

    public Person(String firstName, String lastName, int age, double height, double weight) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
