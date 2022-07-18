package com.example.kodluyoruzspringboot.bean;

import com.example.kodluyoruzspringboot.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

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

   /* @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver slr = new SessionLocaleResolver();
        slr.setDefaultLocale(Locale.US);
        return slr;
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }*/

}
