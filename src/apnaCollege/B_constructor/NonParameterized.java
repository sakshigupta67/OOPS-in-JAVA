package apnaCollege.B_constructor;

class Student{
    int age;
    String name;

    public void printInfo(){
        System.out.println(this.age);
        System.out.println(this.name);
    }
    Student(){
        System.out.println("constructor called");
    }

}
public class NonParameterized {
    public static void main(String[] args) {

        Student s1= new Student();
        s1.name ="Prateek";
        s1.age = 21;

        s1.printInfo();

    }
}
