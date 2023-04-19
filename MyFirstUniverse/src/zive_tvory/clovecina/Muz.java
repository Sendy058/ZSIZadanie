package zive_tvory.clovecina;


import zive_tvory.cicavce.Cicavec;
import zive_tvory.cicavce.Materske_mlieko;
import zive_tvory.stavovce.stavovce_diely.sustavy.*;
import zive_tvory.stavovce.stavovce_diely.sustavy.RozmnozovaciaClovek.Rozmnozovacia_sustava_Muz;
import zive_tvory.stavovce.stavovce_diely.sustavy.RozmnozovaciaClovek.Rozmnozovacia_sustava_Zena;

import java.util.Date;

public class Muz extends Clovek{
    public Muz(Clovek otec, Clovek mama,int pocetStavcov) {
        super(otec,mama,pocetStavcov);
    }
    public Muz(Clovek otec, Clovek mama, int pocetStavcov,String name ,String surname){
        super(otec,mama,pocetStavcov);
        super.name = name;
        super.surName = surname;
        createSustavy();

    }

    @Override
    public void createSustavy() {
        sustavy = new Sustava[8];
        sustavy[0] = new Obehova(Typ_sustavy.OBEHOVA);
        sustavy[1] = new Oporna(Typ_sustavy.OPORNA);
        sustavy[2] = new Vylucovacia(Typ_sustavy.VYLUCOVACIA);
        sustavy[3] = new Pohybova(Typ_sustavy.POHYBOVA);
        sustavy[4] = new Dychacia(Typ_sustavy.DYCHACIA);
        sustavy[5] = new Traviaca(Typ_sustavy.TRAVIACA);
        sustavy[6] = new Rozmnozovacia_sustava_Muz(Typ_sustavy.ROZMNOZOVACIA);
        sustavy[7] = new Nervova_sustava_stavove_default(Typ_sustavy.NERVOVA);
    }
    @Override
    public String toString() {
        return "Muz";
    }
}
