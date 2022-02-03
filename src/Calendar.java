import java.time.LocalDate;

public class Calendar {
    private LocalDate begin_date_;
    private LocalDate current_date_;

    public Calendar() {
        begin_date_ = LocalDate.now();
        current_date_ = LocalDate.now();
    }
}
