package vesmirnetelesa;

import java.util.ArrayList;
import java.util.List;

public class Galaxia  {
    //private Planetarna_Sustava[] polePS = new Planetarna_Sustava[999999];
    private List<Planetarna_Sustava> polePS = new ArrayList<Planetarna_Sustava>();
    private int objectCounter ;
    private String sprava;
    private Higgsov_bozon hb;


    public Galaxia() {
        objectCounter = 0;
        sprava = "";

    }

    public void addSustava(Planetarna_Sustava tato_sustava){
        polePS.add(tato_sustava);
        objectCounter++;

    }
  public void destroySustava(){
        hb.destroySustava();
  }
    public void sendMessage(Galaxia nazov,String sprava){
        nazov.setSprava(sprava);
    }

    public String getSprava() {
        return sprava;
    }

    public void setSprava(String sprava) {
        this.sprava = sprava;
    }

    public Higgsov_bozon getHb() {
        return hb;
    }

    public void setHb(Higgsov_bozon hb) {
        this.hb = hb;
    }
}
