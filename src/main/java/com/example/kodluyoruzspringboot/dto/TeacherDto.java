package com.example.kodluyoruzspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class TeacherDto {

    private Long teacherId;

    @NotEmpty(message = "Ad soyad alanini bos gecemezsiniz")
    @Size(min = 1, max = 255)
    private String teacherNameSurname;

    @NotEmpty(message = "Email alanini bos gecemezsiniz")
    @Email(message = "Uygun Formatta mail giriniz")
    private String teacherEmail;

    @NotEmpty(message = "Sifre alanini bos gecemezsiniz")
    /*@Min(value = 8, message = "Minimum 8 karakter olmalı")
    @Max(value = 16, message = "Maximum 16 karakter olmalı")*/
    @Size(min = 8, max = 16)
    private String teacherPassword;
}
