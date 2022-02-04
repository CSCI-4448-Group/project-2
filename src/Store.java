import java.util.ArrayList;

public class Store{
    private ArrayList<Item> inventory_;
    private ArrayList<Item> soldItems_;

    Clerk Shaggy = new Clerk("Shaggy");
    Clerk Velma = new Clerk("Vemla");
    Clerk currentEmp = new Clerk("");

    CashRegister register = new CashRegister();
    Calendar calendar = new Calendar();

    public Store() {
        // Initialize everything based on the instructions
        //Initialize inventory. 3 of every bottom subclass, 51 items total
        add_to_inventory(new CD("Led Zepplin CD",5,10,true,0,new Condition("very good"),0,"Led Zepplin","Led Zepplin 4"));
        add_to_inventory(new CD("Post Malone CD",3,6,false,0,new Condition("poor"),0,"Post Malone","Stoney"));
        add_to_inventory(new CD("Metallica CD",10,20,true,0,new Condition("excellent"),0,"Metallica","Ride the Lightning"));
        add_to_inventory(new Vinyl("Judas Priest Vinyl",8,16,true,0,new Condition("very good"),0,"Judas Priest","British Steel"));
        add_to_inventory(new Vinyl("Eminem Vinyl",5,10,false,0,new Condition("poor"),0,"Eminem","Marshal Mathers LP"));
        add_to_inventory(new Vinyl("Daft Punk Vinyl",15,30,false,0,new Condition("poor"),0,"Daft Punk","Random Access Memories"));
        add_to_inventory(new PaperScore("Moonlight Sonata PaperScore",1,2,true,0,new Condition("excellent"),0,"Beethoven","Piano Sanata 14"));
        add_to_inventory(new PaperScore("Christmas Oratorio PaperScore",1,2,true,0,new Condition("very good"),0,"Bach","Oratorio"));
        add_to_inventory(new PaperScore("Fur Elise PaperScore",1,2,false,0,new Condition("excellent"),0,"Beethoven","Bagatelle 25"));
        add_to_inventory(new CD_Player("Sony CDPlayer",30,60,true,0,new Condition("excellent"),0,"Sony"));
        add_to_inventory(new CD_Player("LG CDPlayer",30,60,true,0,new Condition("excellent"),0,"LG"));
        add_to_inventory(new CD_Player("Logitech CDPlayer",30,60,true,0,new Condition("excellent"),0,"Logitech"));
        add_to_inventory(new RecordPlayer("Logitech RecordPlayer",20,40,true,0,new Condition("very good"),0,"Logitech"));
        add_to_inventory(new RecordPlayer("LG RecordPlayer",20,40,true,0,new Condition("fair"),0,"LG"));
        add_to_inventory(new RecordPlayer("Sony RecordPlayer",20,40,true,0,new Condition("good"),0,"Sony"));
        add_to_inventory(new Guitar("Gibson SG Guitar",45,90,true,0,new Condition("excellent"),0,"Gibson",true));
        add_to_inventory(new Guitar("Fender Stratocaster Guitar",40,80,false,0,new Condition("good"),0,"Fender",true));
        add_to_inventory(new Guitar("Ibanez Guitar",40,80,true,0,new Condition("very good"),0,"Ibanez",true));
        add_to_inventory(new Bass("Fender Precision Bass",35,70,true,0,new Condition("excellent"),0,"Fender",true));
        add_to_inventory(new Bass("Gibson Thunderbird Bass",30,60,true,0,new Condition("fair"),0,"Gibson",true));
        add_to_inventory(new Bass("Modulus Bass",40,80,true,0,new Condition("excellent"),0,"Modulus",true));
        add_to_inventory(new Mandolin("Kentucky Mandolin",25,50,false,0,new Condition("excellent"),0,"Kentucky",false));
        add_to_inventory(new Mandolin("Gibson Mandolin",25,50,false,0,new Condition("fair"),0,"Gibson",false));
        add_to_inventory(new Mandolin("Goldtone Mandolin",25,50,true,0,new Condition("excellent"),0,"Goldtone",false));
        add_to_inventory(new Flute("Etude Flute",20,40,true,0,new Condition("good"),0,"Etude","Alto"));
        add_to_inventory(new Flute("Yamaha Flute",20,40,true,0,new Condition("good"),0,"Yamaha","C"));
        add_to_inventory(new Flute("Azumi Flute",20,40,false,0,new Condition("good"),0,"Azume","Wooden"));
        add_to_inventory(new Harmonica("Hohner Harmonica",10,20,false,0,new Condition("very good"),0,"Hohner","C"));
        add_to_inventory(new Harmonica("Lee Oskar Harmonica",10,20,false,0,new Condition("very good"),0,"Lee Oskar","C"));
        add_to_inventory(new Harmonica("SEYDEL Blues Harmonica",10,20,false,0,new Condition("very good"),0,"SEYDEL","C"));
        add_to_inventory(new Hat("Post Malone Hat",25,50,true,0,new Condition("good"),0,"Gucci",3));
        add_to_inventory(new Hat("Slash's Top Hat",50,100,true,0,new Condition("good"),0,"Slash",7));
        add_to_inventory(new Hat("Carhartt Hat",10,20,true,0,new Condition("good"),0,"Carhartt",5));
        add_to_inventory(new Bandana("Red Bandana",4,8,true,0,new Condition("excellent"),0,"Bexar Goods"));
        add_to_inventory(new Bandana("Blue Bandana",4,8,true,0,new Condition("excellent"),0,"Topo Designs"));
        add_to_inventory(new Bandana("White Bandana",4,8,true,0,new Condition("excellent"),0,"Buck Mason"));
        add_to_inventory(new Shirt("Carhartt Shirt",15,30,true,0,new Condition("good"),0,"Carhartt",5));
        add_to_inventory(new Shirt("Gildan Shirt",15,30,true,0,new Condition("excellent"),0,"Gildan",6));
        add_to_inventory(new Shirt("Hanes Shirt",15,30,true,0,new Condition("good"),0,"Hanes",9));
        add_to_inventory(new PracticeAmp("Marshall DSL PracticeAmp",50,100,true,0,new Condition("good"),0,"Marshall",500));
        add_to_inventory(new PracticeAmp("Mesa California Tweed PracticeAmp",50,100,true,0,new Condition("good"),0,"Mesa",200));
        add_to_inventory(new PracticeAmp("Rogue G10 PracticeAmp",50,100,true,0,new Condition("good"),0,"Rogue",10));
        add_to_inventory(new Cable("Rogue Cable",10,20,true,0,new Condition("excellent"),0,"Rogue",10));
        add_to_inventory(new Cable("Marshall Cable",10,20,true,0,new Condition("excellent"),0,"Marshall",20));
        add_to_inventory(new Cable("Gibson Cable",10,20,true,0,new Condition("excellent"),0,"Gibson",50));
        add_to_inventory(new Strings("Ernie Ball Strings",10,20,true,0,new Condition("excellent"),0,"Ernie Ball","9 gauge"));
        add_to_inventory(new Strings("Dunlop Strings",10,20,true,0,new Condition("excellent"),0,"Dunlop","10 gauge"));
        add_to_inventory(new Strings("Elixir Strings",10,20,true,0,new Condition("excellent"),0,"Elixir","11 gauge"));
    }

    public void initialize() {

        //  CD(String name, double purchPrice, double listPrice, boolean isNew, int dayArriv, char condition, double salePrice, String band, String album)
//        {
//            super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, band, album);
//        }
    }

    public void day()
    {
        // https://stackoverflow.com/questions/28401093/problems-generating-a-math-random-number-either-0-or-1. Picks either 0 or 1 for the clerk who shows up
        Random rand = new Random();
        int randomValue = rand.nextInt() % 2;
        int currentDate = calendar.get_current_date();
        calendar.set_current_date(currentDate + 1);

        if (randomValue == 0)
        {
            currentEmp = Shaggy;
        }
        else
        {
            currentEmp = Velma;
        }
        currentEmp.ArriveAtStore();
        currentEmp.checkRegister(register);
        currentEmp.place_an_order(inventory_, register);
        currentEmp.open_the_store();
        currentEmp.clean_the_store();
        currentEmp.close_the_store();
    }

    public void add_to_inventory(Item item) {inventory_.add(item);}
    public void remove_from_inventory(Item item) {inventory_.remove(item);}
    public void add_to_sold(Item item) {soldItems_.add(item);}
    public void remove_from_sold(Item item) {soldItems_.remove(item);} //Idk if we will actually ever need this
    public void add_to_ordered(Item item) {orderedItems_.add(item);}
    public void remove_from_ordered(Item item) {orderedItems_.remove(item);}
    public void set_employees(ArrayList<Employee> employees) {employees_ = employees;} //Does this just create a copy or just assign a reference to the original
    public void set_register(CashRegister register) {register_ = register;}
    public void set_calendar(Calendar calendar) {calendar_ = calendar;}
    
    public ArrayList<Item> get_inventory() {return inventory_;}
    public ArrayList<Item> get_sold_itens() {return soldItems_;}
    public ArrayList<Employee> get_employees() {return employees_;}
    public CashRegister get_register() {return register_;}
    public Calendar get_calendar() {return calendar_;}
}