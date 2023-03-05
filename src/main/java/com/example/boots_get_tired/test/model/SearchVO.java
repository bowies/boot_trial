package com.example.boots_get_tired.test.model;

import lombok.Data;

@Data
public class SearchVO {
    private String name;
    private String email;
    private int page;

    //230304 : getter / setter 단축키 : alt + insert
    //230305 : lombok 추가 @Data
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
