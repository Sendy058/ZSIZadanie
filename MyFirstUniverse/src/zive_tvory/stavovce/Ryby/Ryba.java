package zive_tvory.stavovce.Ryby;

import zive_tvory.stavovce.Stavovec;

import java.util.Date;

public abstract class Ryba extends Stavovec {

    public Ryba(int pocetStavcov) {
        super(pocetStavcov);
    }
    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {
        //super.hybsa(direction_x, direction_y, direction_z);
        System.out.println("JA letim");
    }

    @Override
    public void born(Date day_of_birth) {
        super.day_of_birth = day_of_birth;
        System.out.println("Narodil som sa v " + day_of_birth.toString());
    }

    @Override
    public void die() {

    }

}
