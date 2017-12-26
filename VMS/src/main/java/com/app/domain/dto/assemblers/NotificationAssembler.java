package com.app.domain.dto.assemblers;

import com.app.domain.dto.VO.notification.NotificationInfoDTO;
import com.app.domain.dto.VO.notification.createNotificationAddDTO;
import com.app.domain.dto.VO.notification.updateNotificationAddDTO;
import com.app.domain.entity.Notification;
import org.springframework.stereotype.Component;

/**
 * Created by Housni Mohamed on 24/12/2017.
 */
@Component
public class NotificationAssembler {

    /**
     *
     * @param notification
     * @return
     *  we create NotificationInfoDTO from Notification object
     *  the created object will be used to return the created Notification
     */
    public NotificationInfoDTO toNotification(Notification notification){

        NotificationInfoDTO n=new NotificationInfoDTO();
        n.setMessage(notification.getMessage());
        n.setNotificationID(notification.getNotificationID());
        n.setAlerteConfig(notification.getAlerteConfig().getId().toString());
        return n;
    }

    /**
     *
     * @param createNotificationAddDTO
     * @return
     */
    Notification toNotification(createNotificationAddDTO createNotificationAddDTO){
        Notification n=new Notification();
        n.setMessage(createNotificationAddDTO.getMessage());
        return n;
    }

    /**
     *
     * @param updateNotificationAddDTO
     * @return
     */
    public Notification toNotification(updateNotificationAddDTO updateNotificationAddDTO){
        return toNotification(updateNotificationAddDTO);
    }

}
