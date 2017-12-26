package com.app.repositories;

import com.app.domain.entity.AlerteConfig;
import com.app.domain.entity.PointInteret;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Housni Mohamed on 23/12/2017.
 */
@Repository
public interface PointInteretRepository extends JpaRepository<PointInteret,Long> {

}
