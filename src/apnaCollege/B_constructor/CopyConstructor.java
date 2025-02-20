package apnaCollege.B_constructor;

class Student_{
    int age;
    String name;

    public void printInfo(){
        System.out.println(this.age);
        System.out.println(this.name);
    }

    Student_(){
        System.out.println("hii");
    }
    Student_(Student_ s2){
            this.name = s2.name;
            this.age =s2.age;
    }

}

public class CopyConstructor {
    public static void main(String[] args) {
        Student_ s1 = new Student_();
        s1.name ="adarsh";
        s1.age = 22;

        Student_ s2 = new Student_(s1);
        s2.printInfo();



    }
}
