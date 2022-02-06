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
        if(currentAmount >= 75) {
            return;
        }
        go_to_bank();
    }

    //Go to the bank, withdrawal 1000 dollars, add it to the register, tally the withdrawal
    public void go_to_bank(){
        CashRegister reg = get_store().get_register();
        reg.set_amount(reg.get_amount() + 1000);
        reg.set_bank_withdrawal(reg.get_bank_withdrawals() + 1000);
        System.out.println(get_name() + " withdrew 1000 dollars from the bank and the new balance in the register is " + reg.get_amount() + " dollars");
    }

    public void do_inventory(){
        HashMap<String, ArrayList<Item>> inv = get_store().get_inventory().get_mapping();
        for(Map.Entry<String, ArrayList<Item>> entry : inv.entrySet()){
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }

    //If we do it this way, we will need to override clone method for each concrete class
    //because we wont know what kind of object is being passed through here
    //Also, this can be where we use polymorphism.
    //Otherwise, we can have a long if-else chain of if(isInstanceOf[Type]) then...
    public void place_order(Item item){
    }

    public void open_store(){

    }

    public void clean_store(){
        Random rand = new Random();
        String name = get_name();
        Store s = get_store();
        double damage_chance = (name == "Shaggy") ? 20 : 5; //If its shaggy, its 20% damage chance, else 5% for velma

        //If the roll for a damaging an item fails, finish cleaning the store and return from fxn
        if(rand.nextInt(100) > damage_chance) {
            System.out.println(name + " finished cleaning the store.");
            return;
        }
//
//        //Otherwise proceed with damaging an item
//        Item damagedItem = s.get_inventory().get_mapping().values();//Get a random item from the stores inventory to damage
//        if(damagedItem.get_condition().get_condition() == "poor"){ //If the item breaks
//            System.out.println(name + " damaged " + damagedItem.toString() + " and broke it.");
//            s.remove_from_inventory(damagedItem);
//        }
//        else{ //Reducde the items condition by one level, reduce the items listPrice by 20%
//            System.out.println(name + " damaged " + damagedItem.toString() + " and its condition is now " + damagedItem.get_condition().get_condition());
//            System.out.println("The price of the item will be reduced from " + damagedItem.get_list_price() + " to " + damagedItem.get_list_price() * .8);
//            damagedItem.get_condition().decreaseCondition();
//            damagedItem.set_list_price(damagedItem.get_list_price() * .2);
//        }
//        System.out.println(name + " finished cleaning the store.");
    }
}