import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;

public class Clerk extends Employee{

    private int precent_chance_to_damage_item;
    
    public Clerk(String name) {
        super(name);
        if (name == "Shaggy") {
            precent_chance_to_damage_item = 20;
        } else if (name == "Velma") {
            precent_chance_to_damage_item = 5;
        }
        precent_chance_to_damage_item = 0;

    }
    
    public void checkRegister(CashRegister reg) {
        double currentAmount = reg.get_amount();
        System.out.println("The amount of money in the cash register is currently: $" + currentAmount);

        if (currentAmount < 75.0)
        {
            go_to_bank(reg);
        }

        do_inventory();
        
    }

    public void go_to_bank(CashRegister reg) {
        double amountWithdrawn = 1000;
        double currentBalance = reg.get_amount();

        reg.set_amount(currentBalance + amountWithdrawn);
        double newAmount = reg.get_amount();
        System.out.println("A bank withdrawal was made of $" + amountWithdrawn + " and the new balance in the register is $" + newAmount);

        double currentBankWithdrawals = reg.get_bank_withdrawals();
        reg.set_bank_withdrawal(currentBankWithdrawals + amountWithdrawn);
    } // Need to track how much is taken out in the future

    public void do_inventory() {
        ArrayList<Item> sold_items = super.get_store().get_sold_items();
        Map<String, Integer> sold_items_map = new HashMap<String, Integer>();
        
        // Check if the hashmap contains the type of item in its counters, increments it if so and adds it to the map if not
        for (Item item : sold_items) {
            String type = item.toString().split(":")[0];
            if (sold_items_map.containsKey(type)) {
                sold_items_map.put(type, sold_items_map.get(type) + 1);
            } else {
                sold_items_map.put(type, 1);
            }
        }

        // Iterate over entries in a map: https://www.geeksforgeeks.org/iterate-map-java/
        for (Map.Entry<String,Integer> entry : sold_items_map.entrySet()) {
            if (entry.getValue() == 3) {
                place_an_order(super.get_store().get_inventory(), super.get_store().get_register(), entry.getKey());
            }
        }
    }
    public void place_an_order(ArrayList<Item> inventory, CashRegister reg, String orderType) {
        // Depending on string orderType, we need to order 3 random items of that type.
    }

    public void clean_the_store() {
        if (precent_chance_to_damage_item != 0) { // Don't want to run this if the clerk has no chance to damage an item
            Random rand = new Random();
            int rand_num = rand.nextInt(100);
            if (rand_num <= precent_chance_to_damage_item) {
                int item_count = super.get_store().get_inventory().size();
                int rand_item_index = rand.nextInt(item_count);
                Item item = super.get_store().get_inventory().get(rand_item_index); // Random item from inventory gets damaged

                if (item.get_condition().get_condition() == "poor") {
                    super.get_store().remove_from_inventory(item);
                    System.out.println(super.get_name() + " broke a(n) " + item.get_name() + " and it was removed from inventory.");
                } else {
                    item.get_condition().decreaseCondition();
                    item.set_list_price(item.get_list_price() * 0.8);
                    System.out.println(super.get_name() + " damaged a(n) " + item.get_name() + " and its condition and price were lowered.");
                }
            }
        }
        System.out.println(super.get_name() + " finished cleaning the store.");
    }
}
