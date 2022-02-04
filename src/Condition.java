public class Condition{
    private String cond_;

    Condition(String condition){
        if(condition != "poor" && condition != "fair" && condition != "good" && condition != "very good" && condition != "excellent"){
            throw new IllegalArgumentException("Condition must be valid type");
        }
        cond_ = condition;
    }

    public String get_condition(){return cond_;}
    public void set_condition(String condition){
        if(condition != "poor" && condition != "fair" && condition != "good" && condition != "very good" && condition != "excellent"){
            throw new IllegalArgumentException("Condition must be valid type");
        }
        cond_ = condition;
    }

    public void increaseCondition(){
        if(cond_ == "poor"){cond_ = "fair";}
        else if(cond_ == "fair"){cond_ = "good";}
        else if(cond_ == "good"){cond_ = "very good";}
        else if(cond_ == "very good"){cond_ = "excellent";}
        else{System.out.println("condition is maximum");}
    }

    public void decreaseCondition(){
        if(cond_ == "poor"){System.out.println("condition is minimum");}
        else if(cond_ == "fair"){cond_ = "poor";}
        else if(cond_ == "good"){cond_ = "fair";}
        else if(cond_ == "very good"){cond_ = "good";}
        else if(cond_ == "excellent"){cond_ = "very good";}
    }
}