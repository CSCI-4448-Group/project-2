import java.util.Date;

public abstract class Music extends Item{
    private String band_;
    private String album_;

    Music(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String band, String album)
    {
        super(name,purchPrice,listPrice,isNew,dayArriv,condition,salePrice);
        band_ = band;
        album = album_;
    }
    public void set_band(String band){band_ = band;}
    public void set_album(String album){album_ = album;}

    public String get_band(){return band_;}
    public String get_album(){return album_;}
}

class CD extends Music{
    CD(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String band, String album)
    {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, band, album);
    }
    public String toString(){
        return "CD: " + get_band() + get_album();
    }
}

class Vinyl extends Music {
    Vinyl(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String band, String album) {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, band, album);
    }
    public String toString() {
        return "Vinyl: " + get_name();
    }
}

class PaperScore extends Music {
    PaperScore(String name, float purchPrice, float listPrice, boolean isNew, Date dayArriv, char condition, float salePrice, String band, String album) {
        super(name, purchPrice, listPrice, isNew, dayArriv, condition, salePrice, band, album);
    }
    public String toString() {
        return "PaperScore: " + get_name();
    }
}
