package zive_tvory.stavovce.stavovce_diely.sustavy.nervova;

import zive_tvory.stavovce.stavovce_diely.sustavy.Nervova_sustava_stavove_default;
import zive_tvory.stavovce.stavovce_diely.sustavy.Typ_sustavy;

public class Nervova_sustava_cicavec extends Nervova_sustava_stavove_default {
    private CNS centralNervSustava;
    private PNS perifernaNervSustava;

    public Nervova_sustava_cicavec(Typ_sustavy typSustavy) {
        super(typSustavy);
        centralNervSustava = new CNS();
        perifernaNervSustava = new PNS();
    }
}
