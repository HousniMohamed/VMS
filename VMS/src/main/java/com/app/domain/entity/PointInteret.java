package com.app.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Housni Mohamed on 23/12/2017.
 */
@Entity
@Table(name="pointinteret")
public class PointInteret implements Serializable {

    @Id @GeneratedValue
    private Long id;
    private Double lat;
    private Double lng;
    private Double rayon;

    public PointInteret() {
    }
    public PointInteret(Double lat, Double lng, Double rayon) {
        this.lat = lat;
        this.lng = lng;
        this.rayon = rayon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getRayon() {
        return rayon;
    }

    public void setRayon(Double rayon) {
        this.rayon = rayon;
    }
}
