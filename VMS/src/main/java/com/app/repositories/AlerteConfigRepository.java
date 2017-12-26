package com.app.repositories;

import com.app.domain.entity.AlerteConfig;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
/**
 * Created by Housni Mohamed on 23/12/2017.
 */
@Repository
public interface AlerteConfigRepository extends JpaRepository<AlerteConfig,Long> {

    @Query("select n from  alerteconfig n where n.AlerteConfigType=:x")
    Page<AlerteConfig> listAlerteConfig(@Param("x") String alerteConfigType, Pageable pageable);
}
