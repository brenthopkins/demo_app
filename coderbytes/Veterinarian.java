package coderbytes;

import java.util.LinkedList;
import java.util.Queue;

public class Veterinarian {
	Queue<String> line = new LinkedList<String>();
    public void accept(String petName) {
        line.add(petName);
    }

    public String heal() {
        try {
            String returnedPet = line.remove();
        } catch (Exception e) {
            return null;
        }
        return null;
    }
    
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.accept("Barkley");
        veterinarian.accept("Mittens");
        System.out.println(veterinarian.heal());
        System.out.println(veterinarian.heal());
    }
}