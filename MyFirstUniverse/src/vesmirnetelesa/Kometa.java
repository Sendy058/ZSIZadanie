package vesmirnetelesa;

public class Kometa extends Vesmirne_teleso{
    private String menoKomety;

    public Kometa(String menoKomety) {
        this.menoKomety = menoKomety;
    }

    public String getMenoKomety() {
        return menoKomety;
    }

    public void setMenoKomety(String menoKomety) {
        this.menoKomety = menoKomety;
    }
}
