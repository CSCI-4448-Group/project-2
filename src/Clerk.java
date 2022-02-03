public class Clerk extends Employee{
    
    public Clerk(String name) {
        super(name);
    }
    
    public void checkRegister(CashRegister reg) {
        double currentAmount = reg.get_amount();
        System.out.println("The amount of money in the cash register is currently: $" + currentAmount);

        if (currentAmount < 75.0)
        {
            go_to_bank(reg);
            do_inventory();
        }
        else
        {
            do_inventory();
        }
    } // {return register}? We don't have a way to access Store through Person yet

    public void go_to_bank(CashRegister reg) {
        double amountWithdrawn = 1000;
        double currentBalance = reg.get_amount();

        reg.set_amount(currentBalance + amountWithdrawn);
        double newAmount = reg.get_amount();
        System.out.println("A bank withdrawal was made of $" + amountWithdrawn + " and the new balance in the register is $" + newAmount);

        double currentBankWithdrawals = reg.get_bank_withdrawals();
        reg.set_bank_withdrawal(currentBankWithdrawals + amountWithdrawn);
    } // Need to track how much is taken out in the future

    public void do_inventory() {} // Again, no way to access store yet, will return Item[] I think
    public void place_an_order(Item[] inventory, CashRegister reg) {}
    public void clean_the_store() {}
}
