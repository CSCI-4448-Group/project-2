public class CashRegister {
    private double amount_;
    private int num_sales_transaction_;
    private int bank_withdrawals_;

    public CashRegister() {
        amount_ = 0;
        num_sales_transaction_ = 0;
        bank_withdrawals_ = 0;
    }

    public double get_amount() {return amount_;}
    public int get_num_sales_transactions() {return num_sales_transaction_;}
    public int get_bank_withdrawals() {return bank_withdrawals_;}

    public void set_amount(double newAmount) {amount_ = newAmount;}
    public void set_num_sales_transactions(int newNumSalesTransactions) {num_sales_transaction_ = newNumSalesTransactions;}
    public void set_bank_withdrawal(int newBankWithdrawals) {bank_withdrawals_ = newBankWithdrawals;}
}
