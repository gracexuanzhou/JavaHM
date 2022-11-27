package Assignment6;

public class Person {
    /*
     String name;
     int age;
    public Person(){
        this.name = name;
        this.age = age;
    }*/
    public void printIntroduction(String name,int age) {
        if (age > 1)
            System.out.println("Hi, I am " + name + ", and I am " + age + " years old");
        else
            System.out.println("Hi, I am " + name + ", and I am " + age + " year old");
    }
}
