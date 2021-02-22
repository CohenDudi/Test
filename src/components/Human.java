package components;

import java.net.StandardSocketOptions;

 //This is an update
 //22
 //This is the master
public class Human {

    static long idCounter = 0;

    long id;
    String name;
    double age;


    public Human(String name,double age){
        this.name = name;
        if (age >= 0 && age <= 120)
            this.age = age;
        this.age = age;
        this.id = ++idCounter;
        System.out.println("print");
    }

    public double getAge(){
        return this.age;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Human alex = new Human("alex jones",60.5);
        Human dorit = new Human("dorit",33);

        System.out.println(Human.idCounter);

    }

}


