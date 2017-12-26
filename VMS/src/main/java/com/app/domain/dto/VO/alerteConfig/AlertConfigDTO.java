package com.app.domain.dto.VO.alerteConfig;

/**
 * Created by Housni Mohamed on 26/12/2017.
 */

/**
 * @Param base class
 */
public abstract class AlertConfigDTO {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
