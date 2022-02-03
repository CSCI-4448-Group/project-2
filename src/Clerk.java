public class Clerk extends Employee{
    
    public Clerk(String name) {
        super(name);
    }
    
    public void checkRegister() {} // {return register}? We don't have a way to access Store through Person yet
    public int go_to_bank() {return 1000;} // Need to track how much is taken out in the future
    public void do_inventory() {} // Again, no way to access store yet, will return Item[] I think
    public void place_an_order() {}
    public void clean_the_store() {}
}
