package com.app.config.spring;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Housni Mohamed on 25/12/2017.
 * @Param Configuration spring file
 * @Author Housni Mohamed
 */
@Configuration
public class AppConfig {

    /**
     * @Param get dozer mapper
     * @return
     */
    @Bean
    public DozerBeanMapper getMapper(){
        return new DozerBeanMapper();
    }

}
