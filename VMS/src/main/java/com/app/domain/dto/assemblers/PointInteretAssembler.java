package com.app.domain.dto.assemblers;

import com.app.domain.dto.VO.pointInteret.createPointInteretAddDTO;
import com.app.domain.dto.VO.pointInteret.updatePointInteretAddDTO;
import com.app.domain.entity.PointInteret;
import org.springframework.stereotype.Component;

/**
 * Created by Housni Mohamed on 24/12/2017.
 */
@Component
public class PointInteretAssembler {

    /**
     * @Param createPointInteretAddDTO :convert *PointInteretInfoDTO to PointInteret
     */
    public PointInteret toPointInteret(createPointInteretAddDTO createPointInteretAddDTO){

        PointInteret pi=new PointInteret();
        pi.setLat(createPointInteretAddDTO.getLat());
        pi.setLng(createPointInteretAddDTO.getLng());
        pi.setRayon(createPointInteretAddDTO.getRayon());
        return pi;
    }
    /**
     * @Param return updated  PointInteret
     */
    public PointInteret toPointInteret(updatePointInteretAddDTO updatePointInteretAddDTO){

        PointInteret pi=new PointInteret();
        pi.setId(updatePointInteretAddDTO.getPointeInteretID());
        pi.setLat(updatePointInteretAddDTO.getLat());
        pi.setLng(updatePointInteretAddDTO.getLng());
        pi.setRayon(updatePointInteretAddDTO.getRayon());
        return pi;
    }

    /**
     * @Param getting PointInteret info from PointInteret
     */

      public createPointInteretAddDTO toPointInteret(PointInteret pointInteret){

          createPointInteretAddDTO pi=new createPointInteretAddDTO();
          pi.setLng(pointInteret.getLng());
          pi.setLat(pointInteret.getLat());
          pi.setRayon(pointInteret.getRayon());
          return pi;
      }
}
