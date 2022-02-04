import java.util.Date;

public abstract class Music extends Item{
    private String band_;
    private String album_;

    Music(String name, double purchPrice, double listPrice, boolean isNew, int dayArriv, Condition condition, double salePrice, String band, String album)
    {
        super(name,purchPrice,listPrice,isNew,dayArriv,condition,salePrice);
        band_ = band;
        album_ = album;
    }
    public void set_band(String band){band_ = band;}
    public void set_album(String album){album_ = album;}

    public String get_band(){return band_;}
    public String get_album(){return album_;}
}

class CD extends Music{
    CD(String name, double purchPrice, double listPrice, boolean isNew, int dayArriv, Condition condition, double salePrice, String band, String album)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, band, album);
    }
    public String toString(){
        return "CD: " + get_band() + get_album();
    }
}

class Vinyl extends Music {
    Vinyl(String name, double purchPrice, double listPrice, boolean isNew, int dayArriv, Condition condition, double salePrice, String band, String album) {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, band, album);
    }
    public String toString() {
        return "Vinyl: " + get_band() + get_album();
    }
}

class PaperScore extends Music {
    PaperScore(String name, double purchPrice, double listPrice, boolean isNew, int dayArriv, Condition condition, double salePrice, String band, String album) {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, band, album);
    }
    public String toString() {
        return "PaperScore: " + get_band() + get_album();
    }
}
