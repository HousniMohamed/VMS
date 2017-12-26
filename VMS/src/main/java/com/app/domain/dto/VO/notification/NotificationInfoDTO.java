package com.app.domain.dto.VO.notification;

/**
 * Created by Housni Mohamed on 24/12/2017.
 */
public class NotificationInfoDTO {

    private Long notificationID;
    private String message;
    private String alerteConfig;

    public Long getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(Long notificationID) {
        this.notificationID = notificationID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAlerteConfig() {
        return alerteConfig;
    }

    public NotificationInfoDTO() {
    }

    public void setAlerteConfig(String alerteConfig) {
        this.alerteConfig = alerteConfig;
    }
}
