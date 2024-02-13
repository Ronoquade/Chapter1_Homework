public class Person {
    private int age;
    private String name;
    private String eyeColor;

    public Person() {
        age = 20;
        name = "Ronoquade Lawrence";
        eyeColor = "Brown";
    }
    public void talk() {
        System.out.println("Welcome, coders! I am " + name + ".");
    }
    public String toString() {
        return "Person Details \n\nName: " + name + "\nAge: " + age + "\nEye Color: " + eyeColor + "\n";
    }
    public Person( int newAge, String newName, String newEyeColor) {
        age = newAge;
        name = newName;
        eyeColor = newEyeColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}