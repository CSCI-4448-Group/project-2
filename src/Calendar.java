public class Calendar {
    private int begin_date_;
    private int current_date_;

    public Calendar() {
        begin_date_ = 0;
        current_date_ = 0;
    }

    public int get_current_date() {return current_date_;}
    public void set_current_date(int newDate) {current_date_ = newDate;}
    public int get_begin_date() {return begin_date_;}
}
