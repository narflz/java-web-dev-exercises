package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());   // prints true
        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());   // prints 13

        //Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);
        System.out.println(cheshireCat.noise()); // prints "Hello, my name is Cheshire!" because isSatisfied returns true
        cheshireCat.eat(); // triggers isSatisfied to return false

        //System.out.println(plainCat.noise()); // prints "Meeeeeeooooowww!"
        System.out.println(cheshireCat.noise()); // prints "Meeeeeeooooowww!" because cheshireCat.eat() ran

        Cat suki = new HouseCat("Suki", 8); // variable of base class (Cat) holds child class (HouseCat) object
        System.out.println(suki.noise()); // as long as parent and child both contain the method, will correctly call child method
        //System.out.println(suki.isSatisfied()); // would result in error, as method is ONLY in child class
    }
}
