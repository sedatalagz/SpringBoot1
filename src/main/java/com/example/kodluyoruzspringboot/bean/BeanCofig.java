package com.example.kodluyoruzspringboot.bean;

import com.example.kodluyoruzspringboot.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanCofig {

    @Bean(initMethod = "initialBeanMethod", destroyMethod = "destroyBeanMethod")
    @Scope("singleton")//proje ile başlayıp proje ile ölüyor
   /* @Scope("request")//istek boyunca çalışan
    @Scope("sesion")//bir oturum boyunca çalışan*/
    public BeanDto beanDto(){

        return BeanDto
                .builder()
                    .id(0l).beanName("bean Adi").beanData("bean Data")
                .build();
    }
}
