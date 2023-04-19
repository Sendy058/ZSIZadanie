package vesmirnetelesa;

public class Hviezda  extends Vesmirne_teleso{
    private String meno;
    private double weight;
    private double tempeture;
    public boolean svietim;

    public Hviezda(String meno, double weight, double tempeture) {
        this.meno = meno;
        this.weight = weight;
        this.tempeture = tempeture;
    }

    public Hviezda() {
        meno = "noname Star";
        weight = 1000^35;
        tempeture = 1000;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTempeture() {
        return tempeture;
    }

    public void setTempeture(double tempeture) {
        this.tempeture = tempeture;
    }
    public void sviet(){
        svietim=true;
        tempeture = this.tempeture;
    }
    public void zhasni(){

        svietim=false;
    }
}
