package com.app.domain.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Housni Mohamed on 23/12/2017.
 */
@Entity
@Table(name="notification")
public class Notification implements Serializable {

    @Id @GeneratedValue
    private Long notificationID;
    private String message;
    @ManyToOne
    @JoinColumn(name="alerteConfig")
    private AlerteConfig alerteConfig;

    public AlerteConfig getAlerteConfig() {
        return alerteConfig;
    }

    public void setAlerteConfig(AlerteConfig alerteConfig) {
        this.alerteConfig = alerteConfig;
    }



    public Notification() {
    }

    public Notification(String message) {
        this.message = message;
    }

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
}
