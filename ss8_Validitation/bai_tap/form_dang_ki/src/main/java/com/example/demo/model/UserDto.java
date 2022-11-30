package com.example.demo.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class UserDto implements Validator {
    private int id;
    @Size(min = 5,message ="Nhập tối thiểu 5 kí tự")
    @Size(max = 45,message = "Nhập tối đa 45 kí tự")
    private String firstName;
    @Size(min = 5,message ="Nhập tối thiểu 5 kí tự")
    @Size(max = 45,message = "Nhập tối đa 45 kí tự")
    private String lastName;
    @Min(value = 18,message = "Độ tuổi nhỏ nhất là 18")
    private int age;
    @Email(message = "Nhập đúng định dạng email dùm đi fen")
    private String email;

    public UserDto() {
    }

    public UserDto(int id, String firstName, String lastName, int age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
