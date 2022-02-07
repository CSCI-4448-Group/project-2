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
        Store s = get_store();
        Integer currDay = s.get_calendar().get_current_day();
        System.out.println(get_name() + " arrives at the store on Day " + currDay);
        if(s.get_ordered().containsKey(currDay)){ //If there are ordered items that arrive today
            s.get_inventory().put_items(s.get_ordered().get(currDay)); //Add all the items to the inventory
            s.get_ordered().remove(currDay); //Remove items from orderedItems_
        } //Maybe put the two above lines into their own private function
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
    public void do_inventory(){
        Inventory inv = get_store().get_inventory();
        for(Map.Entry<String, ArrayList<Item>> entry : inv.get_mapping().entrySet()){ //For each entry in our inventory map
            if(entry.getValue().isEmpty()){ //If we have 0 count of any items
                place_order(entry.getKey()); //Order that item
            }
        }
        System.out.println("The sum of todays inventory is " + inv.get_purch_price_sum());
    }

    //Adds 3 items of type passed to orderedItems_ map in form of <Day Arriving, List Of Items>
    public void place_order(String type){
        Store s = get_store();
        ArrayList<Item> items = generate_items(type, numItems);
        s.get_ordered().put(currDay,ListOfItems);
        System.out.println(get_name() + " placed an order for 3 " + type);
    }

    private ArrayList<Item> generate_items(String type, int numItems){
        switch(type.toLowerCase()){

            case "cd":

                break;

            case "vinyl":

                break;

            case "paperscore":

                break;
            case "cdplayer":

                break;

            case "recordplayer":
                break;


            case "mp3player":

                break;

            case "guitar":

                break;

            case "bass":

                break;

            case "mandolin":

                break;

            case "flute":
                break;

            case "harmonica":

                break;

            case "practice amp":
                break;

            case "cable":
                break;

            case "strings":
                break;

            default:
                throw new IllegalArgumentException("Error, invalid type passed to generate_items() fxn: " ,type);
        }
    }

    public void open_store(){

    }

    public void clean_store(){ //The size of this function needs to be reduced!
        Random rand = new Random();
        String name = get_name();
        Inventory inv = get_store().get_inventory();
        double damage_chance = (name == "Shaggy") ? 20 : 5; //If its shaggy, its 20% damage chance, else 5% for velma (friggin shaggy)
        get_store().get_calendar().incr_current_day(); //Increment calendar day

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