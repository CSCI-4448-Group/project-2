import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;
public class Clerk extends Employee{

    public Clerk(String name, Store s) {
        super(name,s);
    }

    //Handle stocking available orderedItems_ in store into inventory_
    public void arrive_at_store(){
        Store s = this.get_store();
        System.out.println(this.get_name() + " arrives at the store on Day " + s.get_calendar().get_current_day());

        //If there are no items to stock, end arrive_at_store
        if(s.get_ordered().isEmpty()){
            return;
        }
    }

    //Check amount in register, go_to_bank if less than 75
    public void check_register(){
        double currentAmount = get_store().get_register().get_amount();
        System.out.println(get_name() + " is checking the register\n" + "There is " + currentAmount);
        if(currentAmount < 75) {
            go_to_bank();
        }

    }

    //Go to the bank, withdrawal 1000 dollars, add it to the register, tally the withdrawal
    public void go_to_bank(){
        CashRegister reg = get_store().get_register();
        reg.set_amount(reg.get_amount() + 1000);
        reg.set_bank_withdrawal(reg.get_bank_withdrawals() + 1000);
        System.out.println(get_name() + " withdrew 1000 dollars from the bank and the new balance in the register is " + reg.get_amount() + " dollars");
    }

    //Scan the current inventory, if we have 0 count of any type of item, order 3 of them
    public void do_inventory(){
        Inventory inv = get_store().get_inventory();
        for(Map.Entry<String, ArrayList<Item>> entry : inv.get_mapping().entrySet()){ //For each entry in our inventory map
            if(entry.getValue().isEmpty()){ //If we have 0 count of any items
                place_order(entry.getKey()); //Order that item
            }
        }
        System.out.println("The sum of todays inventory is " + inv.get_purch_price_sum());
    }


    public void place_order(String type){
        System.out.println(get_name() + " placed an order for 3 " + type);
    }

    public void open_store(){

    }

    public void clean_store(){ //The size of this function needs to be reduced!
        Random rand = new Random();
        String name = get_name();
        Inventory inv = get_store().get_inventory();
        double damage_chance = (name == "Shaggy") ? 20 : 5; //If its shaggy, its 20% damage chance, else 5% for velma

        //If the roll for a damaging an item fails, finish cleaning the store and return from fxn
        if(rand.nextInt(100) > damage_chance) {
            System.out.println(name + " finished cleaning the store.");
            return;
        }

        //Otherwise proceed with damaging an item
        Item damagedItem = inv.flatten_inventory().get(rand.nextInt(inv.flatten_inventory().size()));//Flatten the inventory into a list of items and pick a random item to damage
        if(damagedItem.get_condition().get_condition() == "poor"){ //If the item breaks
            System.out.println(name + " damaged " + damagedItem.toString() + " and broke it.");
            inv.remove_item(damagedItem);
        }
        else{ //Reducde the items condition by one level, reduce the items listPrice by 20%
            System.out.println(name + " damaged " + damagedItem.toString() + " and its condition is now " + damagedItem.get_condition().get_condition());
            System.out.println("The price of the item will be reduced from " + damagedItem.get_list_price() + " to " + damagedItem.get_list_price() * .8);
            damagedItem.get_condition().decreaseCondition();
            damagedItem.set_list_price(damagedItem.get_list_price() * .8);
        }
        System.out.println(name + " finished cleaning the store.");
    }
}