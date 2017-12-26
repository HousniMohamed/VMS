package com.app.domain.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Housni Mohamed on 23/12/2017.
 */
@Entity
@Table(name = "alerteconfigspeed")
@DiscriminatorValue("alerteconfigspeed")
public class ALerteConfigSpeed extends AlerteConfig implements Serializable {

    private int min=0;
    private int max=120;
    private int duration;

    public ALerteConfigSpeed() {
        super();
    }

    public ALerteConfigSpeed(int min, int max, int duration,boolean state) {
        super(state);
        this.min = min;
        this.max = max;
        this.duration = duration;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


}
