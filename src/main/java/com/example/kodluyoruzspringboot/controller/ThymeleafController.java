package com.example.kodluyoruzspringboot.controller;

import com.example.kodluyoruzspringboot.bean.ProductDto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class ThymeleafController {

    // http://localhost:8080
    @GetMapping({"/", "index"})
    public String index() {
        return "index";
    }

    // http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1") //url yapısı
    //@ResponseBody
    public String getThymeleaf1(Model model) {
        model.addAttribute("key_model1", "Ben modelden geldim-1");
        model.addAttribute("key_model2", "Ben modelden geldim-2");
        return "thymeleaf1";
    }

    // http://localhost:8080/thymeleaf2
    @GetMapping("/thymeleaf2") //url yapısı
    //@ResponseBody
    public String getThymeleaf2(Model model) {
        model.addAttribute("key_model1", "Ben modelden geldim-1");
        model.addAttribute("key_model2", "Ben modelden geldim-2");
        return "/thymeleaf2";
    }

    // http://localhost:8080/thymeleaf3
    @GetMapping("/thymeleaf3") //url yapısı
    //@ResponseBody
    public String getThymeleaf3(Model model) {
        model.addAttribute("key_model1", "Ben modelden geldim-3");
        return "/thymeleaf3";
    }


    ////////////////////////////////////////////////////////////////////////////////////
    //Model Object göndermek

    // http://localhost:8080/thymeleaf4
    @GetMapping("/thymeleaf4") //url yapısı
    //@ResponseBody
    public String getThymeleaf4Object(Model model) {
        model.addAttribute("key_model1", "text");
        ProductDto productDto =
                ProductDto
                        .builder()
                        .productId(0L)
                        .productName("Ürün Adı")
                        .productPrice(2500)
                        .build();
        model.addAttribute("key_model2", productDto);
        return "/thymeleaf4";
    }
    ////////////////////////////////////////////////////////////////////////////
    //Model Object List göndermek

    // http://localhost:8080/thymeleaf5
    @GetMapping("/thymeleaf5") //url yapısı
    //@ResponseBody
    public String getThymeleaf5Object(Model model) {
        model.addAttribute("key_model1", "text");
        List<ProductDto> listem = new ArrayList<>();
        listem.add(ProductDto.builder().productId(1L).productName("Ürün Adı1").productPrice(1500).build());
        listem.add(ProductDto.builder().productId(2L).productName("Ürün Adı2").productPrice(2500).build());
        listem.add(ProductDto.builder().productId(3L).productName("Ürün Adı3").productPrice(3500).build());
        listem.add(ProductDto.builder().productId(4L).productName("Ürün Adı4").productPrice(4500).build());
        model.addAttribute("product_list", listem);
        return "/thymeleaf5";
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //@PathVariable
    // http://localhost:8080/thymeleaf6/4
    // http://localhost:8080/thymeleaf6/
    @GetMapping({"/thymeleaf6","/thymeleaf6/{id}"}) //url yapısı
    public String getThymeleaf6Object(Model model, @PathVariable(name ="id", required = false) Long id) {
        if (id!=null){
            model.addAttribute("key_model1", "id: " +id);
        }
        else{
            model.addAttribute("key_model1", "id bulunamadı ");
        }


        return "thymeleaf6";
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //@RequestParam
    // http://localhost:8080/thymeleaf7?id=4&name=SedatALAGOZ
    @GetMapping("/thymeleaf7") //url yapısı
    public String getThymeleaf7Object(Model model,
                                      @RequestParam(name ="id", required = false, defaultValue = "0") Long id,
                                      @RequestParam(name ="name") String adi
    ) {
        if (id!=null){
            model.addAttribute("key_model1", " id: " + id + " Adı Soyadı " + adi);
        }
        else{
            model.addAttribute("key_model1", "id bulunamadı ");
        }
        return "thymeleaf7";
    }

    // http://localhost:8080/formPost/formvalidation
    @GetMapping("formPost/formvalidation")
    public String form(Model model) {
        return "formPost/formvalidation";
    }
}
