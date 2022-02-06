abstract class Employee extends Person{
    private int days_worked_;
    private Store store_;

    public Employee(String name, Store s) {
        super(name);
        store_ = s;
    }
    public int get_days_worked() {return days_worked_;}
    public Store get_store() {return store_;}
}
