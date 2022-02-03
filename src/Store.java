import java.util.ArrayList;

public class Store{
    private ArrayList<Item> inventory_;
    private ArrayList<Item> soldItems_;
    private ArrayList<Employee> employees_;
    private CashRegister register_;
    private Calendar calendar_;

    public Store() {
        // Initialize everything based on the instructions
    }

    //Initialize based on presed variables
    public Store(ArrayList<Item> inventory, ArrayList<Item> soldItems, ArrayList<Employee> employees, CashRegister register, Calendar calendar) {
        inventory_ = inventory;
        soldItems_ = soldItems;
        employees_ = employees;
        register_ = register;
        calendar_ = calendar;
    }

    public void add_to_inventory(Item item) {inventory_.add(item);}
    public void remove_from_inventory(Item item) {inventory_.remove(item);}
    public void set_sold_items(ArrayList<Item> items) {soldItems_ = items;}
    public void set_employees(ArrayList<Employee> employees) {employees_ = employees;}
    public void set_register(CashRegister register) {register_ = register;}
    public void set_calendar(Calendar calendar) {calendar_ = calendar;}
    
    public ArrayList<Item> get_inventory() {return inventory_;}
    public ArrayList<Item> get_sold_itens() {return soldItems_;}
    public ArrayList<Employee> get_employees() {return employees_;}
    public CashRegister get_register() {return register_;}
    public Calendar get_calendar() {return calendar_;}

    public static void main(String args[])
    {
        System.out.println("Store");
    }
}