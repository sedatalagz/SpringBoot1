package com.example.kodluyoruzspringboot.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class BeanDto {//Verileri transfer etme

    private Long id;
    private String beanName;
    private String beanData;


    //Başlangıç
    public void initialBeanMethod(){
        log.info("Bean baslamadan once ben varim");
        System.out.println("Bean baslamadan once calisacak method");
    }

    //Bitiş

    public void destroyBeanMethod(){
        log.info("Bean bittikten sonra ben varim");
        System.out.println("Bean bittikten sonra calisacak method");
    }

}
