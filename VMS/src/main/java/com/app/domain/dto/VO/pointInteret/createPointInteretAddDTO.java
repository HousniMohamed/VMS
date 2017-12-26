package com.app.domain.dto.VO.pointInteret;

/**
 * Created by Housni Mohamed on 24/12/2017.
 */

/**
 * create user
 * createPointInteretAddDTO
 */
public class createPointInteretAddDTO {

    private Long pointInteretID;
    private Double lat;
    private Double lng;
    private Double rayon;

    /**
     *
     * @return
     */
    public Long getPointInteretID() {
        return pointInteretID;
    }

    /**
     *
     * @param pointInteretID
     */
    public void setPointInteretID(Long pointInteretID) {
        this.pointInteretID = pointInteretID;
    }

    /**
     *
     * @return
     */
    public Double getLat() {
        return lat;
    }

    /**
     *
     * @param lat
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     *
     * @return
     */
    public Double getLng() {
        return lng;
    }

    /**
     *
     * @param lng
     */
    public void setLng(Double lng) {
        this.lng = lng;
    }

    /**
     *
     * @return
     */
    public Double getRayon() {
        return rayon;
    }

    /**
     *
     * @param raton
     */
    public void setRayon(Double raton) {
        this.rayon = raton;
    }
}
