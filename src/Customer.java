import java.util.Random;
abstract class Customer extends Person {
    
    public Customer(String name) {
        super(name);
    }

    public boolean haggle_roll(int percentChance){
        Random rand = new Random();
        return rand.nextInt(100) < percentChance;
    }
}

