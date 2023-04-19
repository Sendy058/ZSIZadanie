package vesmirnetelesa;

import zive_tvory.Tvory;

import java.util.ArrayList;
import java.util.List;

public class Zem  extends Planeta{
    //private Tvory[] poleTvorov;
    private List<Tvory> poleTvorov ;
    private  int pocet_tvorov;
    public Zem(String menoPlanety, double vaha, double priemer) {
        super(menoPlanety, vaha, priemer);
        poleTvorov = new ArrayList<Tvory>();
        pocet_tvorov = 0;

    }

    public Zem(String menoPlanety, double vaha, double priemer, double gravitacia) {
        super(menoPlanety, vaha, priemer, gravitacia);
    }

    public void addTvora(Tvory tentoTvor){
        poleTvorov.add(tentoTvor);
        pocet_tvorov++;
    }

    public List<Tvory> getPoleTvorov() {
        return poleTvorov;
    }

    @Override
    public String toString() {
        return "Zem{" +
                "poleTvorov=" + poleTvorov +
                '}';
    }
// public void setPoleTvorov(Tvory[] poleTvorov) {
    //    this.poleTvorov = poleTvorov;
  //  }

    public int getPocet_tvorov() {
        return pocet_tvorov;
    }

    public void setPocet_tvorov(int pocet_tvorov) {
        this.pocet_tvorov = pocet_tvorov;
    }
}
