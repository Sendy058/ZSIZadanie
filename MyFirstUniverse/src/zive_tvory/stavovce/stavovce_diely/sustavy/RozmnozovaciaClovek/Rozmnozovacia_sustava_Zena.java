package zive_tvory.stavovce.stavovce_diely.sustavy.RozmnozovaciaClovek;

import zive_tvory.clovecina.Clovek;
import zive_tvory.stavovce.stavovce_diely.sustavy.*;
import zive_tvory.stavovce.stavovce_diely.sustavy.nervova.Nervova_sustava_cicavec;

public class Rozmnozovacia_sustava_Zena extends Rozmnozovacia {

    private int BabyDevelopmentProgress = 0;

    public Rozmnozovacia_sustava_Zena(Typ_sustavy typSustavy) {
        super(typSustavy);
    }
    public int takeCareBaby(Clovek plod){
        while (BabyDevelopmentProgress!=100){
            BabyDevelopmentProgress++;
        }
        plod.createSustavy();
        return BabyDevelopmentProgress;

    }

}
