// import Animal class

public class Main {

    public static void main(String[] args) {

        //Instantiate new Animal
        Animal animal = new Animal(4,30,true,"lion");

        String name;
        int topSpeed;

        //get name and speed values using getters
        name = animal.getName();
        topSpeed = animal.getTopSpeed();

        //Print some output
        System.out.println(name);
        System.out.println(topSpeed);
        //Set new name, speed, and endangered properties values using setters
        animal.setName("tiger");
        animal.setTopSpeed(20);
        //get new values using getters
        name = animal.getName();
        topSpeed = animal.getTopSpeed();

        //Print some output
        System.out.println(name);
        System.out.println(topSpeed);
    }
}
