
import java.util.Random;
public class tester{
    public static void main(String args[]) throws Exception{
        Store s = new Store();
        Clerk clerk1 = s.get_clerks().get(0);
        Clerk clerk2 = s.get_clerks().get(1);
        Random rand = new Random();
        int rand_num = rand.nextInt(2);

        Clerk current_clerk = null;
        if (rand_num == 0) {
            current_clerk = clerk1; // Arguments need to be set, these are wrong
        } else {
            current_clerk = clerk2; // Arguments need to be set, these are wrong
        }
        // Clerk arrives at store
        current_clerk.arrive_at_store();

        // Clerk checks the register, goes to bank as necessary
        current_clerk.check_register();

        // Clerk checks inventory, places orders for new items if none are present in the store
        current_clerk.do_inventory();

        // Clerk opens the store, handles all customer interactions
        current_clerk.open_store();

        // Clerk cleans the store, possibly damages items in the process
        current_clerk.clean_store();

        // Clerk announces he leaves the store
        current_clerk.leave_store();

//        Item myCD = Item.generate_item("cd");
//        Item myVinyl = Item.generate_item("vinyl");
//        System.out.println(myCD);
//
//        Store mystore = new Store();
//        sellingCustomer myCust = new sellingCustomer("BPB");
//        System.out.println(myCust.get_item());
    }

}