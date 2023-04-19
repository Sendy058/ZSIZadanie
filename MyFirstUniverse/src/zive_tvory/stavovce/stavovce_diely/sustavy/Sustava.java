package zive_tvory.stavovce.stavovce_diely.sustavy;

import zive_tvory.stavovce.stavovce_diely.sustavy.Typ_sustavy;

public abstract class Sustava {
    Typ_sustavy TypSustavy;

    public Sustava(Typ_sustavy typSustavy) {
        TypSustavy = typSustavy;
    }

    public Typ_sustavy getTypSustavy() {
        return TypSustavy;
    }
}
