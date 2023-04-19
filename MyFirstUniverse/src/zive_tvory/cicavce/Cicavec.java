package zive_tvory.cicavce;


import zive_tvory.stavovce.Stavovec;
import zive_tvory.stavovce.stavovce_diely.sustavy.*;
import zive_tvory.stavovce.stavovce_diely.sustavy.Sustava;
import zive_tvory.stavovce.stavovce_diely.sustavy.nervova.Nervova_sustava_cicavec;

public abstract class Cicavec extends Stavovec implements cicable{
    private float temperature;
    public Cicavec(int pocetStavcov) {
        super(pocetStavcov);
        temperature = 36;
    }

   @Override
    public void createSustavy(){
        sustavy = new Sustava[8];
        sustavy[0] = new Obehova(Typ_sustavy.OBEHOVA);
        sustavy[1] = new Oporna(Typ_sustavy.OPORNA);
        sustavy[2] = new Vylucovacia(Typ_sustavy.VYLUCOVACIA);
        sustavy[3] = new Pohybova(Typ_sustavy.POHYBOVA);
        sustavy[4] = new Dychacia(Typ_sustavy.DYCHACIA);
        sustavy[5] = new Traviaca(Typ_sustavy.TRAVIACA);
        sustavy[6] = new Rozmnozovacia(Typ_sustavy.ROZMNOZOVACIA);
        sustavy[7] = new Nervova_sustava_cicavec(Typ_sustavy.NERVOVA);
    }
}
