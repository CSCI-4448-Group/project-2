import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;
public class Clerk extends Employee{

    public Clerk(String name, Store s) {
        super(name,s);
    }

    //Set all items arriving today to have currDay arrival date, add all items to inventory
    private void process_incoming_items(int currDay){
        Store s = get_store();
        ArrayList<Item> incoming = s.get_ordered().get(currDay); //Get all the items from the map
        incoming.forEach((item)->item.set_day_arrived(currDay));  //Set all their arrival dates to current day
        s.get_inventory().put_items(incoming); //Add all the items to the inventory
        s.get_ordered().remove(currDay); //Remove items from orderedItems_
    }

    //Arrive at store and check if items need to be processed
    public void arrive_at_store(){
        int currDay = get_store().get_calendar().get_current_day();
        System.out.println(get_name() + " arrives at the store on Day " + currDay);
        if(get_store().get_ordered().containsKey(currDay)){ //If there are ordered items that arrive today
            process_incoming_items(currDay);
        }
    }


    //Check amount in register, go_to_bank if less than 75 (REMOVE MAGIC NUMBERS)
    public void check_register(){
        double currentAmount = get_store().get_register().get_amount();
        System.out.println(get_name() + " is checking the register\n" + "There is " + currentAmount);
        if(currentAmount < 75) {
            go_to_bank();
        }
    }

    //Go to the bank, withdrawal 1000 dollars, add it to the register, tally the withdrawal (REMOVE MAGIC NUMBERS)
    public void go_to_bank(){
        CashRegister reg = get_store().get_register();
        reg.set_amount(reg.get_amount() + 1000);
        reg.set_bank_withdrawal(reg.get_bank_withdrawals() + 1000);
        System.out.println(get_name() + " withdrew 1000 dollars from the bank and the new balance in the register is " + reg.get_amount() + " dollars");
    }

    //Scan the current inventory, if we have 0 count of any type of item, order 3 of them
    public void do_inventory() throws Exception{
        Inventory inv = get_store().get_inventory();
        for(Map.Entry<String, ArrayList<Item>> entry : inv.get_mapping().entrySet()){ //For each entry in our inventory map
            if(entry.getValue().isEmpty()){ //If we have 0 count of any items
                place_order(entry.getKey()); //Order that item
            }
        }
        System.out.println("The sum of todays inventory is " + inv.get_list_price_sum()); //Display the list price sum of all items in inventory
    }

    //Adds 3 items of type passed to orderedItems_ map in form of <Day Arriving, List Of Items>
    public void place_order(String type) throws Exception{
        Random rand = new Random();
        Store s = get_store();
        ArrayList<Item> items = generate_items(type.toLowerCase(), 3); //Generate 3 of the type of items asked for
        s.get_ordered().put(s.get_calendar().get_current_day() + rand.nextInt(3) + 1 ,items); //map the ordered items from (day Arriving) -> (the items created)
        System.out.println(get_name() + " placed an order for 3 " + type);
    }

    //Generate numItems items of type provided, return generated ArrayList
    private ArrayList<Item> generate_items(String type, int numItems) throws Exception{
        ArrayList<Item> items = new ArrayList<Item>();
        for(int i = 0; i < numItems; i++){ //For the number of items we need
            items.add(Item.generate_item(type)); //Call the item generator for the type of item we need
        }
        return items;
    }

    public void open_store(){

    }

    public void clean_store(){ //The size of this function needs to be reduced!
        Random rand = new Random();
        String name = get_name();
        Inventory inv = get_store().get_inventory();
        double damage_chance = (name == "Shaggy") ? 20 : 5; //If its shaggy, its 20% damage chance, else 5% for velma (friggin shaggy)
         //Increment calendar day

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
            damagedItem.get_condition().decreaseCondition(); //Decrease the items condition
            System.out.println(name + " damaged " + damagedItem.toString() + " and its condition is now " + damagedItem.get_condition().get_condition());
            System.out.println("The price of the item will be reduced from " + damagedItem.get_list_price() + " to " + damagedItem.get_list_price() * .8);
            damagedItem.set_list_price(damagedItem.get_list_price() * .8);
            System.out.println("The new price of the item is: " + damagedItem.get_list_price());
        }
        System.out.println(name + " finished cleaning the store.");
    }

    public void leave_store(){
        get_store().get_calendar().incr_current_day();
        incr_days_worked();
        System.out.println(get_name() + " locked up the store and went home for the day");
    }
}