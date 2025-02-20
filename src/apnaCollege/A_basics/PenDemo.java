package apnaCollege.A_basics;

class Pen{
    String color;
    String type; // ballpoint gel

    static public void write(){
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }

}

public class PenDemo {

    public static void main(String[] args) {

        // Pen.color ❌❌
        Pen.write(); //✅✅


 // creating an object
        Pen p1 = new Pen();
        p1.color="blue";
        p1.type= "gel";
        p1.write();

        Pen p2= new Pen();
        p2.color= "black";
        p2.type= "ballPoint";

        p1.printColor();
        p2.printColor();
    }
}
