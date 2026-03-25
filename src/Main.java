
/*Creating a class with attributes
 */
class Pupils{
    String name;
    String subject;
    int age;
    String hobby;

    public void introduce(){
        System.out.println("I am " + name +",i am studying " + subject +", i am " + age + " years and my hobby is " + hobby);
    }
}
public class Main {
    public static void main(String[] args){
        Pupils student1 = new Pupils();
        student1.age = 12;
        student1.name = "james";
        student1.subject = "English";

        student1.introduce();

        Pupils pupil2 = new Pupils();
        pupil2.age = 16;
        pupil2.name = "tee";
        pupil2.subject = "Math";
        pupil2.hobby = "praying";
        pupil2.introduce();



    }

}