package com.app.domain.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Housni Mohamed on 23/12/2017.
 */
@Entity
@Table(name="alerteconfigstoppoi")
@DiscriminatorValue("alerteconfigstoppoi")
public class AlertConfigSTOPPOI extends AlerteConfig implements Serializable {

    private float duration;
    @OneToOne
    private PointInteret pointInteret;

    public AlertConfigSTOPPOI() {
        super();
    }

    public AlertConfigSTOPPOI(float duration) {
        this.duration = duration;
    }

    public AlertConfigSTOPPOI(boolean state, float duration) {
        super(state);
        this.duration = duration;
    }
}
