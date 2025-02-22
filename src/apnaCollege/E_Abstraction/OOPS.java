package apnaCollege.E_Abstraction;

 abstract class Animal{
     Animal(){
         System.out.println("you are creating a new animal");

     }
    abstract void walk();

    public void eat(){
        System.out.println("eats");
    }
}

class Horse extends Animal{

     Horse(){
         System.out.println("created a horse");
     }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}


public class OOPS {
    public static void main(String[] args) {
        Horse h1= new Horse();


        h1.walk();
         h1.eat();


//         Animal a1 = new Animal();
//         a1.walk();
         // 'Animal' is abstract; cannot be instantiated
    }
}
