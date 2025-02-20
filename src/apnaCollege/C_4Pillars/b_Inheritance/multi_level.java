package apnaCollege.C_4Pillars.b_Inheritance;

class EquilateralTriangle extends Triangle{
    public void area (int l , int b){
        System.out.println(1/2*l*b);
    }
}

public class multi_level {
    public static void main(String[] args) {

        EquilateralTriangle e1 = new EquilateralTriangle();
        e1.area(2,2);

    }
}
