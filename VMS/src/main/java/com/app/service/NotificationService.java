package com.app.service;

import com.app.domain.dto.VO.notification.NotificationInfoDTO;
import com.app.domain.dto.VO.notification.createNotificationAddDTO;
import com.app.domain.entity.Notification;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Housni Mohamed on 24/12/2017.
 */
@Component
public interface NotificationService {

    public createNotificationAddDTO getNotificationsByID(Long ID);
    public NotificationInfoDTO createNotification(Notification notification);
    public void  deleteNotification(Long ID);
    public NotificationInfoDTO updateNotification(Notification notification);
    public Page<NotificationInfoDTO> getNotifications(Long ALerteConfigID, int page, int size);
    public List<Long> getNotificationIDs(Long ALerteConfigID, int page, int size);

}
