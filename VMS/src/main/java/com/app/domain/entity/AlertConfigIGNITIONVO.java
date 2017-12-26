package com.app.domain.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Housni Mohamed on 23/12/2017.
 */
@Entity
@Table(name ="alaerteconfigignitionvo" )
@DiscriminatorValue("alerteconfigignitionvo")
public class AlertConfigIGNITIONVO extends AlerteConfig implements Serializable {

    private float duration;

    public AlertConfigIGNITIONVO() {
        super();
    }

    public AlertConfigIGNITIONVO(float duration) {
        this.duration = duration;
    }

    public AlertConfigIGNITIONVO(boolean state, float duration) {
        super(state);
        this.duration = duration;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }
}
