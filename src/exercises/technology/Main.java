package exercises.technology;

public class Main {
    public static void main(String[] args) {
        Computer crappyDell = new Computer(1,50, 256, true);
        crappyDell.adjustRam(-128);
        System.out.println(crappyDell.getRam());

        Laptop alienWare = new Laptop(2,500, 2048, true, 11.5);
        System.out.println(alienWare.isTooHeavy());

        SmartPhone iPhone = new SmartPhone(3,50, 64, false, true);
        System.out.println(iPhone.getHasCamera());
        iPhone.smashCamera();
        System.out.println(iPhone.getHasCamera());

        System.out.println(iPhone.getId());
    }
}
