import java.util.Scanner;
public class Dog {
    private Scanner scoon = new Scanner(System.in);
    private String breed;
    private String size;
    private String color;
    private String dogName = "'This dog has not been named yet'";
    private int age;
    Dog (String b, String s, String c, int a){
        this.breed = b;
        this.size = s;
        this.color = c;
        this.age = a;

    }

    void eat(){
        System.out.println("The "+breed+" eats some food...");
        if (size == "large"){
            System.out.println("...\nBut it can't get any bigger!!!\n");
        } else if (size =="medium") {
            size = "large";
            System.out.println("And it is now a large dog!!!\n");
        } else if (size == "small") {
            size = "medium";
            System.out.println("And it is now a medium dog!!!\n");
        }
    }
    void run(){
        System.out.println("The "+breed+" goes for a run...");
        if (size == "large"){
            size = "medium";
            System.out.println("And it loses some weight!!!\nThe dog is now medium sized.\n");
        } else if (size =="medium") {
            size = "small";
            System.out.println("And it loses some weight!!!\nThe dog is now small sized.\n");
        } else if (size == "small") {
            System.out.println("It is too small to lose weight!!!\n");
        }
    }
    void Sleep(){
        //
    }
    void name(){
        System.out.println("What would you like to name your "+breed+"?");
        this.dogName = scoon.next();
        System.out.println("Great! The "+breed+"s name is now "+dogName+"!");
    }


    public static void main(String[] args) {
        Dog Dog1Object = new Dog("Bulldog", "large", "light gray", 5);
        Dog Dog2Object = new Dog("Beagle", "large", "orange", 6);
        Dog Dog3Object = new Dog("German Shepard", "large", "white and orange", 66);
        System.out.print("\n-----------------\n");
        Dog1Object.name();
        Dog2Object.name();
        Dog3Object.name();
        System.out.print("\n-----------------\n");
        Dog1Object.run();
        Dog1Object.run();
        Dog2Object.run();
        Dog3Object.run();
        System.out.print("\n-----------------\n");
        Dog1Object.eat();
        Dog3Object.eat();
    }

}
