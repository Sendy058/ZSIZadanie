package zive_tvory.stavovce;

import zive_tvory.Tvory;
import zive_tvory.stavovce.stavovce_diely.Chrbtica;
import zive_tvory.stavovce.stavovce_diely.sustavy.*;

import java.util.Date;

public abstract class Stavovec extends Tvory {
    protected Chrbtica chrbtica;
    protected Sustava[] sustavy;

    public Stavovec(int pocetStavcov) {
        chrbtica = new Chrbtica(pocetStavcov);
        //createSustavy();
    }

    public void createSustavy() {
        sustavy = new Sustava[8];
        sustavy[0] = new Obehova(Typ_sustavy.OBEHOVA);
        sustavy[1] = new Oporna(Typ_sustavy.OPORNA);
        sustavy[2] = new Vylucovacia(Typ_sustavy.VYLUCOVACIA);
        sustavy[3] = new Pohybova(Typ_sustavy.POHYBOVA);
        sustavy[4] = new Dychacia(Typ_sustavy.DYCHACIA);
        sustavy[5] = new Traviaca(Typ_sustavy.TRAVIACA);
        sustavy[6] = new Rozmnozovacia(Typ_sustavy.ROZMNOZOVACIA);
        sustavy[7] = new Nervova_sustava_stavove_default(Typ_sustavy.NERVOVA);
    }

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {

    }

    @Override
    public void born(Date day_of_birth) {

    }

    @Override
    public void die() {

    }

    public Sustava[] getSustavy() {
        return sustavy;
    }

}



