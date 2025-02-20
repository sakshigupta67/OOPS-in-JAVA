package apnaCollege.B_constructor;

class Students{
    int age;
    String name;

    public void printInfo(){
        System.out.println(this.age);
        System.out.println(this.name);
    }

    Students(String name, int age){
        System.out.println("constructor call");
        this.age=age;
        this.name = name;
    }

}

public class Paramerterized {
    public static void main(String[] args) {
        Student s1 = new Student(); //constructor called
        Students s2= new Students("ayush", 18);

        s1.printInfo(); // previous file
        s2.printInfo();
    }
}
