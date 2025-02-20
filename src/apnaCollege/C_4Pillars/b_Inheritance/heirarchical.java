package apnaCollege.C_4Pillars.b_Inheritance;

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class heirarchical {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.area();
        c1.area(4);

    }
}
