abstract class Employee extends Person{
    private int days_worked_;
    private Store store_;

    public Employee(String name, Store s) {
        super(name);
        store_ = s;
    }
    public int get_days_worked() {return days_worked_;}
    public void set_days_worked(int days) {days_worked_ = days;}
    public void incr_days_worked() {days_worked_+=1;}
    public Store get_store() {return store_;}
}
