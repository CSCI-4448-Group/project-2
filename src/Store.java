import java.util.ArrayList;

public class Store{
    private ArrayList<Item> inventory_;
    private ArrayList<Item> soldItems_;
    private ArrayList<Item> orderedItems_;
    private ArrayList<Employee> employees_;
    private CashRegister register_;
    private Calendar calendar_;

    public Store() {
        // Initialize everything based on the instructions
    }

    //Initialize based on presed variables
    //I dont think we should use this parm'd constructor. Using this implies that these lists
    //will be initialized and passed through by some other thing, which would lead to coupling
    //between the store and the thing passing the store its initialized lists.
    //Imo, these lists should just be initialized in the store and not outside of it.
    public Store(ArrayList<Item> inventory, ArrayList<Item> soldItems, ArrayList<Employee> employees, CashRegister register, Calendar calendar) {
        inventory_ = inventory;
        soldItems_ = soldItems;
        employees_ = employees;
        register_ = register;
        calendar_ = calendar;
    }

    public void initialize(){
        //Initialize inventory. 3 of every bottom subclass, 51 items total
        inventory_.add(new CD("Led Zepplin CD",5,10,true,0,new Condition("very good"),0,"Led Zepplin","Led Zepplin 4"));
        inventory_.add(new CD("Post Malone CD",3,6,false,0,new Condition("poor"),0,"Post Malone","Stoney"));
        inventory_.add(new CD("Metallica CD",10,20,true,0,new Condition("excellent"),0,"Metallica","Ride the Lightning"));
        inventory_.add(new Vinyl("Judas Priest Vinyl",8,16,true,0,new Condition("very good"),0,"Judas Priest","British Steel"));
        inventory_.add(new Vinyl("Eminem Vinyl",5,10,false,0,new Condition("poor"),0,"Eminem","Marshal Mathers LP"));
        inventory_.add(new Vinyl("Daft Punk Vinyl",15,30,false,0,new Condition("poor"),0,"Daft Punk","Random Access Memories"));
        inventory_.add(new PaperScore("Moonlight Sonata PaperScore",1,2,true,0,new Condition("excellent"),0,"Beethoven","Piano Sanata 14"));
        inventory_.add(new PaperScore("Christmas Oratorio PaperScore",1,2,true,0,new Condition("very good"),0,"Bach","Oratorio"));
        inventory_.add(new PaperScore("Fur Elise PaperScore",1,2,false,0,new Condition("excellent"),0,"Beethoven","Bagatelle 25"));
        inventory_.add(new CD_Player("Sony CDPlayer",30,60,true,0,new Condition("excellent"),0,"Sony"));
        inventory_.add(new CD_Player("LG CDPlayer",30,60,true,0,new Condition("excellent"),0,"LG"));
        inventory_.add(new CD_Player("Logitech CDPlayer",30,60,true,0,new Condition("excellent"),0,"Logitech"));
        inventory_.add(new RecordPlayer("Logitech RecordPlayer",20,40,true,0,new Condition("very good"),0,"Logitech"));
        inventory_.add(new RecordPlayer("LG RecordPlayer",20,40,true,0,new Condition("fair"),0,"LG"));
        inventory_.add(new RecordPlayer("Sony RecordPlayer",20,40,true,0,new Condition("good"),0,"Sony"));
        inventory_.add(new Guitar("Gibson SG Guitar",45,90,true,0,new Condition("excellent"),0,"Gibson",true));
        inventory_.add(new Guitar("Fender Stratocaster Guitar",40,80,false,0,new Condition("good"),0,"Fender",true));
        inventory_.add(new Guitar("Ibanez Guitar",40,80,true,0,new Condition("very good"),0,"Ibanez",true));
        inventory_.add(new Bass("Fender Precision Bass",35,70,true,0,new Condition("excellent"),0,"Fender",true));
        inventory_.add(new Bass("Gibson Thunderbird Bass",30,60,true,0,new Condition("fair"),0,"Gibson",true));
        inventory_.add(new Bass("Modulus Bass",40,80,true,0,new Condition("excellent"),0,"Modulus",true));
        inventory_.add(new Mandolin("Kentucky Mandolin",25,50,false,0,new Condition("excellent"),0,"Kentucky",false));
        inventory_.add(new Mandolin("Gibson Mandolin",25,50,false,0,new Condition("fair"),0,"Gibson",false));
        inventory_.add(new Mandolin("Goldtone Mandolin",25,50,true,0,new Condition("excellent"),0,"Goldtone",false));
        inventory_.add(new Flute("Etude Flute",20,40,true,0,new Condition("good"),0,"Etude","Alto"));
        inventory_.add(new Flute("Yamaha Flute",20,40,true,0,new Condition("good"),0,"Yamaha","C"));
        inventory_.add(new Flute("Azumi Flute",20,40,false,0,new Condition("good"),0,"Azume","Wooden"));
        inventory_.add(new Harmonica("Hohner Harmonica",10,20,false,0,new Condition("very good"),0,"Hohner","C"));
        inventory_.add(new Harmonica("Lee Oskar Harmonica",10,20,false,0,new Condition("very good"),0,"Lee Oskar","C"));
        inventory_.add(new Harmonica("SEYDEL Blues Harmonica",10,20,false,0,new Condition("very good"),0,"SEYDEL","C"));
        inventory_.add(new Hat("Post Malone Hat",25,50,true,0,new Condition("good"),0,"Gucci",3));
        inventory_.add(new Hat("Slash's Top Hat",50,100,true,0,new Condition("good"),0,"Slash",7));
        inventory_.add(new Hat("Carhartt Hat",10,20,true,0,new Condition("good"),0,"Carhartt",5));
        inventory_.add(new Bandana("Red Bandana",4,8,true,0,new Condition("excellent"),0,"Bexar Goods"));
        inventory_.add(new Bandana("Blue Bandana",4,8,true,0,new Condition("excellent"),0,"Topo Designs"));
        inventory_.add(new Bandana("White Bandana",4,8,true,0,new Condition("excellent"),0,"Buck Mason"));
        inventory_.add(new Shirt("Carhartt Shirt",15,30,true,0,new Condition("good"),0,"Carhartt",5));
        inventory_.add(new Shirt("Gildan Shirt",15,30,true,0,new Condition("excellent"),0,"Gildan",6));
        inventory_.add(new Shirt("Hanes Shirt",15,30,true,0,new Condition("good"),0,"Hanes",9));
        inventory_.add(new PracticeAmp("Marshall DSL PracticeAmp",50,100,true,0,new Condition("good"),0,"Marshall",500));
        inventory_.add(new PracticeAmp("Mesa California Tweed PracticeAmp",50,100,true,0,new Condition("good"),0,"Mesa",200));
        inventory_.add(new PracticeAmp("Rogue G10 PracticeAmp",50,100,true,0,new Condition("good"),0,"Rogue",10));
        inventory_.add(new Cable("Rogue Cable",10,20,true,0,new Condition("excellent"),0,"Rogue",10));
        inventory_.add(new Cable("Marshall Cable",10,20,true,0,new Condition("excellent"),0,"Marshall",20));
        inventory_.add(new Cable("Gibson Cable",10,20,true,0,new Condition("excellent"),0,"Gibson",50));
        inventory_.add(new Strings("Ernie Ball Strings",10,20,true,0,new Condition("excellent"),0,"Ernie Ball","9 gauge"));
        inventory_.add(new Strings("Dunlop Strings",10,20,true,0,new Condition("excellent"),0,"Dunlop","10 gauge"));
        inventory_.add(new Strings("Elixir Strings",10,20,true,0,new Condition("excellent"),0,"Elixir","11 gauge"));
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