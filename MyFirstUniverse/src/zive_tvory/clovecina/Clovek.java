package zive_tvory.clovecina;

import zive_tvory.cicavce.Cicavec;
import zive_tvory.cicavce.Materske_mlieko;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Clovek  extends Cicavec {
    protected Clovek otec;
    protected Clovek mama;
    protected List<Clovek> deti;
    protected String name;
    protected String surName;
    public Clovek(Clovek otec,Clovek mama,int pocetStavcov) {
        super(pocetStavcov);
        this.otec = otec;
        this.mama = mama;
        deti = new ArrayList();

    }

    @Override
    public String toString() {
        return "Clovek{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }

    @Override
    public void cicat(Cicavec mama) {

    }

    @Override
    public void cicat(Materske_mlieko mliecko) {

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

    public void setName(String name) {
        this.name = name;
    }
}
