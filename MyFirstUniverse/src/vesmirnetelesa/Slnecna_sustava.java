package vesmirnetelesa;

import java.util.ArrayList;
import java.util.List;

public class Slnecna_sustava extends Planetarna_Sustava  {
    Hviezda slnko;
    private Planeta Jupiter;
    private Planeta Saturn;
    public int object_counter;
   // private Vesmirne_teleso[] obezne_telesa= new Vesmirne_teleso[500000000];
    public List<Vesmirne_teleso> obezne_telesa = new ArrayList<Vesmirne_teleso>();
    public Slnecna_sustava() {
        slnko = new Hviezda(); // vytvorenie objektu triedy Hviezda
        setObject_counter(0);
        obezne_telesa.add(new Planeta("Mars",432432,55555));
        object_counter++;
        obezne_telesa.add(new Planeta("Venusa",32342,154678));
        object_counter++;
        obezne_telesa.add(new Hviezda("polarka",4584,155184));
        object_counter++;
        obezne_telesa.add(new Kometa("prvaKometa"));
        object_counter++;

    }

    public Slnecna_sustava(int object_counter) {
        object_counter = 0;
    }

    public Hviezda getSlnko() {
        return slnko;
    }

    public void setSlnko(Hviezda slnko) {
        this.slnko = slnko;
    }

    public List<Vesmirne_teleso> getObezne_telesa() {
        return obezne_telesa;
    }

    public void setObezne_telesa(List<Vesmirne_teleso> obezne_telesa) {
        this.obezne_telesa = obezne_telesa;
    }

    public int getObject_counter() {
        return object_counter;
    }

    public void setObject_counter(int object_counter) {
        this.object_counter = object_counter;
    }
    public void addTeleso(Vesmirne_teleso nove_teleso)
    {
        obezne_telesa.add(nove_teleso);
        object_counter++;
    }
}
