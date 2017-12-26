package com.app.repositories;

import com.app.domain.dto.VO.notification.NotificationInfoDTO;
import com.app.domain.entity.Notification;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Housni Mohamed on 23/12/2017.
 */
@Repository
public interface NotificationRepository extends JpaRepository<Notification,Long> {
    @Query("select n from  Notification n where n.alerteConfig.id=:x")
    Page<Notification> listNotification(@Param("x") Long alerteConfigID, Pageable pageable);
}
