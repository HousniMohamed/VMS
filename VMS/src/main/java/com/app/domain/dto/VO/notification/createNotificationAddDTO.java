package com.app.domain.dto.VO.notification;

/**
 * Created by Housni Mohamed on 24/12/2017.
 */
public class createNotificationAddDTO {

    private String message;
    private String alerteType;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAlerteType() {
        return alerteType;
    }

    public void setAlerteType(String alerteType) {
        this.alerteType = alerteType;
    }
}
