abstract class Employee extends Person{
    private int days_worked_;
    private Store store_;

    public Employee(String name) {
        super(name);
    }

    public void arrive_at_store(int num, Item[] items) {} // Not sure what these will do yet
    public void leave_the_store() {}
    public void open_the_store() {}

    public int get_days_worked() {return days_worked_;}
    public Store get_store() {return store_;}
}
