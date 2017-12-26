package com.app.domain.dto.VO.alerteConfig;

/**
 * Created by Housni Mohamed on 26/12/2017.
 */
public class createAlerteConfigAddDTO extends AlertConfigDTO {

    private String AlerteConfigType;
    private float duration;
    private float quality;
    private float prisevirage;
    private int min;
    private int max;
    private int durationSpeed;
    public String getAlerteConfigType() {
        return AlerteConfigType;
    }

    public void setAlerteConfigType(String alerteConfigType) {
        AlerteConfigType = alerteConfigType;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
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

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getDurationSpeed() {
        return durationSpeed;
    }

    public void setDurationSpeed(int durationSpeed) {
        this.durationSpeed = durationSpeed;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }


}
