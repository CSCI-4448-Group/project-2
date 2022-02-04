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
        Store FNMS = new Store(); // Initialize store, change to proper constructor later

        // Main program loop

        for (int i = 0; i <= 30; i++)
        {
            FNMS.day();
            System.out.println();
        }
        FNMS.simulationPrint();
    }
}