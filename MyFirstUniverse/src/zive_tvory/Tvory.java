package zive_tvory;

import java.util.Date;

public abstract class Tvory implements bornable,dieable{
    protected Date day_of_birth;


    public abstract void hybsa(int direction_x, int direction_y, int direction_z);

    public Date getDay_of_birth() {
        return day_of_birth;
    }

}

