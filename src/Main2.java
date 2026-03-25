class Vehicle{
    String name;
    int miles;


    public void move(){
        System.out.println(name + " is moving");
    }
    public void state(){
        System.out.println(name + " is broken");
    }

}
class Bike extends Vehicle{
    String model;

    public void condition(){
        System.out.println(name + " is broken");
        System.out.println(model + " is from 2006");
        System.out.println(name + "has " + miles + " on it");
    }

}
class Train extends Vehicle{
    String feature;
    public void size(){
        System.out.println(name + " is humongous");
        System.out.println(name + "is a " + feature + "train");
    }
}
public class Main2 {
    public static void main(String[] args){
        Bike bike1 = new Bike();
        bike1.name ="Mountain";
        bike1.model = "mtb";
        bike1.miles = 200;

        Train train2 = new Train();
        train2.name = "Jameson";
        train2.miles = 2000;
        train2.feature = "Courier";



    }
}