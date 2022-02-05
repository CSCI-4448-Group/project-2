abstract class Employee extends Person{
    private int days_worked_;
    private Store store_;

    public Employee(String name) {
        super(name);
    }

    public void arrive_at_store(int days, Item[] items) {
        String employeeName = get_name();
        System.out.println(employeeName + " arrives at the store on Day " + days);

        for (int i = 0; i < items.length; i++)
        {
            System.out.println("Hello");
            //if (items[i].)
        }

    } // Not sure what these will do yet

    public void open_the_store() {}

    public void leave_the_store() {
        String employeeName = get_name();
        System.out.println(employeeName + " is locking up and the FNMS is now closed.");
    }

    public int get_days_worked() {return days_worked_;}
    public Store get_store() {return store_;}
}
