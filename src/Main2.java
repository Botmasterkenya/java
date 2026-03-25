class Vehicle{
    String name;
    int miles;


    public void move(){
        System.out.println(name + " is moving");
    }
    public void state(){
        System.out.println(name + " is broken");
    }
    public void size(){
        System.out.println(name + " is humongous");

    }

}
class Bike extends Vehicle{
    String model;

    public void condition(){

        System.out.println(model + " is from 2006");
        System.out.println(name + " has " + miles + " miles on it");
    }

}
class Train extends Vehicle{
    String feature;
    String speed;
    public void type(){
        System.out.println(name + "is a " + feature + "train");
        System.out.println(name + " is also a " + speed + " train");
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
        train2.speed = "slow";

        System.out.println("---Bike---");
        bike1.move();
        bike1.state();
        bike1.size();
        bike1.condition();


        System.out.println("--Train--");
        train2.size();
        train2.move();
        train2.type();



    }

}
