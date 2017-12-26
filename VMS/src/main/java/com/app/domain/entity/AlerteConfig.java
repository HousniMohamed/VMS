package com.app.domain.entity;

import com.app.commons.AlerteConfigType;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by Housni Mohamed on 23/12/2017.
 */
@Entity
@Table(name="alerteconfig")
@Inheritance(strategy =InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn(name="AlerteConfigType",discriminatorType = DiscriminatorType.STRING)
public abstract class AlerteConfig implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private boolean state;
    @OneToMany(mappedBy = "notificationID")
    private Collection<Notification> notifications;

    public AlerteConfig() {
    }
    public AlerteConfig(boolean state) {

        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
