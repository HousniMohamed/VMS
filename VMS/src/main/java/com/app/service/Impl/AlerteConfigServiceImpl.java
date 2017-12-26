package com.app.service.Impl;

import com.app.domain.dto.VO.alerteConfig.AlerteConfigInfoDTO;
import com.app.domain.dto.VO.alerteConfig.createAlerteConfigAddDTO;
import com.app.domain.dto.VO.alerteConfig.updateAlerteConfigAddDTO;
import com.app.domain.entity.AlerteConfig;
import com.app.repositories.AlerteConfigRepository;
import com.app.service.AlerteConfigService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Housni Mohamed on 24/12/2017.
 */
@Service
@Transactional
public class AlerteConfigServiceImpl implements AlerteConfigService {

   @Autowired
    AlerteConfigRepository alerteConfigRepository;
    @Autowired
    DozerBeanMapper dozerBeanMapper;
    /**
     *
     * @param Id
     */
    @Override
    public void deleteAlerteConfig(Long Id) {
        AlerteConfig alerteConfig=alerteConfigRepository.findOne(Id);
        if(alerteConfig!=null) alerteConfigRepository.delete(Id);
    }
    /**
     *
     * @param alerteConfig
     * @return
     */
    @Override
    public AlerteConfigInfoDTO createAlerteConfig(createAlerteConfigAddDTO alerteConfig) {

        AlerteConfig al=dozerBeanMapper.map(alerteConfig,AlerteConfig.class);
        return dozerBeanMapper.map(alerteConfigRepository.save(al),AlerteConfigInfoDTO.class);
    }
    /**
     *
     * @param alerteConfig
     * @return
     */
    @Override
    public AlerteConfigInfoDTO updateAlerteConfig(updateAlerteConfigAddDTO alerteConfig) {
        /**
         * @Param on peut ajouter des traitement specifique a chaque opertion
         * update ou create
         */
        AlerteConfig al=dozerBeanMapper.map(alerteConfig,AlerteConfig.class);
        return dozerBeanMapper.map(alerteConfigRepository.save(al),AlerteConfigInfoDTO.class);
    }
    /**
     *
     * @param alerteconfigtype
     * @param page
     * @param size
     * @return
     */
    @Override
    public Page<AlerteConfigInfoDTO> listAlerConfig(String alerteconfigtype, int page, int size) {
        Page<AlerteConfigInfoDTO> alerteConfigInfoDTOs=alerteConfigRepository.listAlerteConfig(alerteconfigtype,new PageRequest(page,size))
                .map(this::getalerteConfigInfoDTOs);
        return alerteConfigInfoDTOs;
    }
    /**
     * @Param create AlerteConfigInfoDTO instance
     * @param alerteConfig
     * @return
     */
    public AlerteConfigInfoDTO getalerteConfigInfoDTOs(AlerteConfig alerteConfig) {
        return dozerBeanMapper.map(alerteConfig,AlerteConfigInfoDTO.class);
    }
}
