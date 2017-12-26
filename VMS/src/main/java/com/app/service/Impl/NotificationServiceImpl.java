package com.app.service.Impl;

import com.app.domain.dto.VO.notification.NotificationInfoDTO;
import com.app.domain.dto.VO.notification.createNotificationAddDTO;
import com.app.domain.entity.Notification;
import com.app.repositories.NotificationRepository;
import com.app.service.NotificationService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Housni Mohamed on 24/12/2017.
 */
@Service
@Transactional
public class NotificationServiceImpl implements NotificationService {
    @Autowired
    DozerBeanMapper dozerBeanMapper;
    @Autowired
    private NotificationRepository notificationRepository;
    /**
     *
     * @param ID
     * @return
     */
    @Override
    public createNotificationAddDTO getNotificationsByID(Long ID) {
        /**
         * @Param find notification with ID value
         * @Return the founded notification
         */
       return dozerBeanMapper.map(notificationRepository.findOne(ID),createNotificationAddDTO.class);
    }
    /**
     *
     * @param notification
     * @return
     */
    @Override
    public NotificationInfoDTO createNotification(Notification notification) {
        /**
         * @Param fistly we save the object
         * @Param we will convert the created object
         * to Vo object
         * @Param we use the dozer mapper to accomplish this action
         */
        return dozerBeanMapper.map(notificationRepository.save(notification),NotificationInfoDTO.class);
    }
    /**
     *
     * @param ID
     */
    @Override
    public void deleteNotification(Long ID) {
        /**
         * @Param tester si la notifacations existe
         */
        if(getNotificationsByID(ID)!=null) notificationRepository.delete(ID);
    }
    /**
     *
     * @param notification
     * @return
     */
    @Override
    public NotificationInfoDTO updateNotification(Notification notification) {
        return dozerBeanMapper.map(notificationRepository.save(notification),NotificationInfoDTO.class);
    }
    /**
     * @param ALerteConfigID
     * @param page
     * @param size
     * @return
     */
    @Override
    public Page<NotificationInfoDTO> getNotifications(Long ALerteConfigID, int page, int size) {

        /**
         * @Param l'objet page retourné contient des page de type
         * Notification.
         * Mapper cet object a un objet de type NotificationInfoDTO
         * @Param mapper ce
         * @Param iterate the list of page
         */
        Page<NotificationInfoDTO> notificationInfoDTOs=notificationRepository.listNotification(ALerteConfigID,new PageRequest(page,size))
                .map(this::getNotificationInfoDTO);
         return notificationInfoDTOs;
    }

    /**
     *
     * @param notification
     * @return
     */
    public NotificationInfoDTO getNotificationInfoDTO(Notification notification) {
        return dozerBeanMapper.map(notification,NotificationInfoDTO.class);
    }

    @Override
    /**
     * @Param we return a list of Notification IDs
     * l'objectif est de retourner une liste des Id
     * pour les mapper ensuite a l'objet AlertConfigInfoDTO
     * mapper une liste des Id rend l'objet AlertConfigInfoDTO trés leger
     */
    public List<Long> getNotificationIDs(Long ALerteConfigID, int page, int size) {

     return notificationRepository.listNotification(ALerteConfigID,new PageRequest(page,size)).
             getContent().stream().map(Notification::getNotificationID).collect(Collectors.toList());
    }
}
