import java.util.Random;

class main_class {

    // Possible way to handle announcements, may make it easier?

    // public static String announcement(String clerk_name, String type_of_announcement) {
    //     if (type_of_announcement == "Arrival") {
    //         return clerk_name + " arrived at store.";
    //     } else {
    //         return "Other."; // Can place each type of store announcement here so we don't need to type them out each time.
    //     }
    // }

    public static void main(String[] args) {
        Store store_object = new Store(); // Initialize store, change to proper constructor later
        Clerk Shaggy = new Clerk("Shaggy");
        Clerk Velma = new Clerk("Vemla");

        Random rand = new Random();
        Calendar cal = new Calendar();

        // Main program loop

        while (cal.get_current_day() < 30) {
            int rand_num = rand.nextInt(2);
            Clerk current_clerk = null;
            if (rand_num == 0) {
                current_clerk = Shaggy; // Arguments need to be set, these are wrong
            } else {
                current_clerk = Velma; // Arguments need to be set, these are wrong
            }

            current_clerk.arrive_at_store(3, null);

            // System.out.println(announcement(current_clerk.get_name(), "Arrive"));

            current_clerk.checkRegister(store_object.get_register()); // Clerk checks register

            for (Item item : store_object.get_inventory()) {
                // Check if item quantity is 0, and order more if so.
            }
            
            // Main logic per day at the store


            if (rand_num == 0) {
                current_clerk.leave_the_store();
            } else {
                current_clerk.leave_the_store();
            }
        }
    }
}