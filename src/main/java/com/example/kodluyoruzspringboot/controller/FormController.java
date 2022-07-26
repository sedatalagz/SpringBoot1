package com.example.kodluyoruzspringboot.controller;

import com.example.kodluyoruzspringboot.dto.TeacherDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@Log4j2
public class FormController {


    /*  FORM
        @GetMapping
        @PostMapping
        @PutMapping     Güncelleme
        @DeleteMapping  Silme
    */
    //getGetMethod
    // http://localhost:8080/form
    @GetMapping("/form")
    public String getForm(Model model){

        model.addAttribute("cv_teacher", new TeacherDto());
        return "formPost/formvalidation";
    }

    @PostMapping("/form")
    public String postForm(@Valid @ModelAttribute("cv_teacher") TeacherDto teacherDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){ //Hatam var ise
            log.error("Hata var...");
            System.err.println("Hata var...");
            return "formPost/formvalidation";
        }
        log.info("Succes! " + teacherDto);
        //Database kaydetme alanı
        //dosyaya yazmak

        return "formPost/success";
    }
}
