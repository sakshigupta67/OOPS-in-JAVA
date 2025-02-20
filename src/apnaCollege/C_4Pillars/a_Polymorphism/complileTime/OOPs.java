package apnaCollege.C_4Pillars.a_Polymorphism.complileTime;

class Students {
    int age;
    String name;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);


    }
}

public class OOPs {
    public static void main(String[] args) {

        Students s1 = new Students();
        s1.name = "khushi";
        s1.age = 23;

        s1.printInfo("abhi");
        s1.printInfo(s1.age);
        s1.printInfo(s1.name , s1.age);

    }
}