package A6_Edit;

public class Person6 {

 String name;
 int age;
    Person6 (String name, int age){
        this.name = name;
        this.age = age;
    }
    public void printIntroduction() {
        if (this.age > 1)
            System.out.println("Hi, I am " + this.name + ", and I am " + this.age + " years old");
        else
            System.out.println("Hi, I am " + this.name + ", and I am " + this.age + " year old");
    }
}
