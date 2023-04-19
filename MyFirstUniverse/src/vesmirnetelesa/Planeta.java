package vesmirnetelesa;

public class Planeta extends Vesmirne_teleso {
    private String menoPlanety;
    private double vaha;
    private double priemer;
    private double gravitacia;
    public boolean weightSet = false;

    public String getMenoPlanety() {
        return menoPlanety;
    }
    private void setMenoPlanety(String menoPlanety) {
        this.menoPlanety = menoPlanety;
    }

    public double getVaha() {
        return vaha;
    }

    public void setVaha(double vaha) {

        if(this.vaha>vaha) {
            if ((this.vaha - vaha) <= 1000) {

                System.out.print("Ja chudnem");
            } else {

                System.out.println("Ja chudnem velmi");
            }
        } else {
            if (Math.abs(this.vaha-vaha)<=1000){
                System.out.println("Sakra, pribrala som");

            }else {
                System.out.print("Pribrala som moc");
            }
        }
        if(Math.abs(this.vaha-vaha)>1000){
            increaseGravity(0.1);
        }else {
            decreaseGravity(0.1);
        }
        this.vaha = vaha;
    }

    public double getPriemer() {
        return priemer;

    }

    private void setPriemer(double priemer) {
        this.priemer = priemer;
    }

    public Planeta(String menoPlanety, double vaha, double priemer) {
        setMenoPlanety(menoPlanety);
        setVaha(vaha);
        setPriemer(priemer);
        gravitacia = 9.81;
    }

    public double getGravitacia() {
        return gravitacia;
    }

    public void setGravitacia(double gravitacia) {
        this.gravitacia = gravitacia;
    }
    public void increaseGravity(double add){
        gravitacia += add;
    }
    public void decreaseGravity(double dec){
        gravitacia -= dec;
    }

    public Planeta(String menoPlanety, double vaha, double priemer, double gravitacia) {
        this.menoPlanety = menoPlanety;
        this.vaha = vaha;
        this.priemer = priemer;
        this.gravitacia = gravitacia;
    }

    public Planeta() {
        this.vaha = 1000;
        this.priemer = 4000;
        this.menoPlanety = "noname";
        this.gravitacia = 9.81;
    }
    public void setPlanetaryWeight(double vaha ){
        if (weightSet==false){
            setPriemer(vaha);
            weightSet=true;
        }
    }
}
