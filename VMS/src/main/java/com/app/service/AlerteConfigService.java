package com.app.service;

import com.app.domain.dto.VO.alerteConfig.AlerteConfigInfoDTO;
import com.app.domain.dto.VO.alerteConfig.createAlerteConfigAddDTO;
import com.app.domain.dto.VO.alerteConfig.updateAlerteConfigAddDTO;
import com.app.domain.entity.AlerteConfig;
import org.springframework.data.domain.Page;

/**
 * Created by Housni Mohamed on 24/12/2017.
 */
public interface AlerteConfigService {
    /**
     * @param Id
     */
    public void deleteAlerteConfig(Long Id);
    public AlerteConfigInfoDTO createAlerteConfig(createAlerteConfigAddDTO alerteConfig);
    public AlerteConfigInfoDTO updateAlerteConfig(updateAlerteConfigAddDTO alerteConfig);
    public Page<AlerteConfigInfoDTO> listAlerConfig(String alerteconfigtp,int page, int size);

}
