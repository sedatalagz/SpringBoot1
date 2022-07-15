package com.example.kodluyoruzspringboot.controller;

import com.example.kodluyoruzspringboot.bean.BeanCofig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BeanController {

    @Autowired
    BeanCofig beanCofig;

    // http://localhost:8080/bean/beanDto
    @GetMapping("/bean/beanDto") //url yapısı
    @ResponseBody //html olmadan ekranda göstermeye yarar
    public String getBeanDto(){
        return beanCofig.beanDto()+".";
    }


}
