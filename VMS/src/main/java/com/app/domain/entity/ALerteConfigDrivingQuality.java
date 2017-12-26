package com.app.domain.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Housni Mohamed on 23/12/2017.
 */
@Entity
@Table(name = "alerteconfigdrivingquality")
@DiscriminatorValue("alerteconfigdrivingquality")
public class ALerteConfigDrivingQuality extends AlerteConfig implements Serializable {

    private float quality;
    private float prisevirage;

    public ALerteConfigDrivingQuality() {
        super();
    }

    public ALerteConfigDrivingQuality(float quality, float prisevirage) {
        this.quality = quality;
        this.prisevirage = prisevirage;
    }

    public ALerteConfigDrivingQuality(boolean state, float quality, float prisevirage) {
        super(state);
        this.quality = quality;
        this.prisevirage = prisevirage;
    }

    public float getQuality() {
        return quality;
    }

    public void setQuality(float quality) {
        this.quality = quality;
    }

    public float getPrisevirage() {
        return prisevirage;
    }

    public void setPrisevirage(float prisevirage) {
        this.prisevirage = prisevirage;
    }
}
