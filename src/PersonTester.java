public class PersonTester {
    public static void main(String[] args) {
    // Creating an object of the Person Class
    Person person1 = new Person();
    // toString method to print details of the object
    System.out.println(person1);
    // Changing the name of person1 object
    person1.setName("Howard Roark");
    // Using the talk() instance method
    person1.talk();
    }
}
