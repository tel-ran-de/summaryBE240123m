package summary1;

import java.util.Arrays;



public class Example2 {
    public static void main(String[] args) {
        Ananas ananas = new Ananas(10);
        ananas.setCellulose(20);
        //ananas.setSugar(10);
        ananas.setVitamins(new String[]{"A", "B"});
        System.out.println(ananas);
    }
}


class Fruit {
    public String[] vitamins;
    public int sugar;

    public Fruit(int sugar) {
        // Print statement
        this.sugar = sugar;
        System.out.println("Super class constructor");

        // Displaying object hashcode of super class
    }

    @Override
    public String toString() {
        return "vitamins = " + Arrays.toString(vitamins) + ", sugar = " + sugar;
    }

    public void setVitamins(String[] vitamins) {
        this.vitamins = vitamins;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }
}

class Ananas extends Fruit {
    private int cellulose;

    public Ananas(int sugar) {
        super(sugar);
        // Print statement
        System.out.println("Subclass constructor invoked");

        // Displaying object hashcode of subclass
    }

    @Override
    public String toString() {
        return "Ananas {cellulose = " + cellulose + ", " + super.toString()+"}";
    }

    public void setCellulose(int cellulose) {
        this.cellulose = cellulose;
    }
}