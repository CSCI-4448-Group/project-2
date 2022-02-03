public class CashRegister {
    private float amount_;
    private int num_sales_transactions;

    public CashRegister() {
        amount_ = 0;
        num_sales_transactions = 0;
    }

    protected float get_ammount() {return amount_;}
    protected int get_num_sales_transactions() {return num_sales_transactions;}
}
