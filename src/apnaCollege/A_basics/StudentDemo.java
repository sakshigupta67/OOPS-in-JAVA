package apnaCollege.A_basics;

import javax.swing.plaf.synth.SynthTableUI;

class Student{
    int age;
    String name;

    public void printInfo(){
        System.out.println(this.age);
        System.out.println(this.name);
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name ="Sakshi";
        s1.age = 19;

        s1.printInfo();


    }
}
