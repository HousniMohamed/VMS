package com.app.domain.dto.VO.pointInteret;

/**
 * Created by Housni Mohamed on 24/12/2017.
 */
public class updatePointInteretAddDTO {

    private Long pointeInteretID;
    private Double lat;
    private Double lng;
    private Double rayon;

    public Long getPointeInteretID() {
        return pointeInteretID;
    }

    public void setPointeInteretID(Long pointeInteretID) {
        this.pointeInteretID = pointeInteretID;
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

    public void setayon(Double rayon) {
        this.rayon = rayon;
    }

}
