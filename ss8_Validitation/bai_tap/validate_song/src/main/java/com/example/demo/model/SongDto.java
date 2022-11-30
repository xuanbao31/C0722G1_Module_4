package com.example.demo.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class SongDto implements Validator {

    private int id;
    @NotBlank(message = "Không được để trống nha")
    @Size(max = 800)
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "Không được chứa kí tự đặt biệt")
    private String nameSong;
    @NotBlank(message = "Không được để trống nha")
    @Size(max = 300)
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "Không được chứa kí tự đặt biệt")
    private String singer;
    @NotBlank
    @Size(min = 1, max = 1000)
    @Pattern(regexp = "^[(\\w)* ,]+$", message = "Vui lòng nhập đúng định dạng")
    private String kind;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
