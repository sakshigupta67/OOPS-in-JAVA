package apnaCollege.C_4Pillars.b_Inheritance;

// parent class

class Shape{
    String color;
    public void area(){
        System.out.println("displays area");
    }
}

//child class
class Triangle extends Shape{
    String type;
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
            }

public class Single_level{
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "green";
        t1.type  ="equilateral";

        t1.area();
        t1.area(2,2);


    }


}
