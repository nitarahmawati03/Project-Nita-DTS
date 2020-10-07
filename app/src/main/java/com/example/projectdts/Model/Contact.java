package com.example.projectdts.Model;

public class Contact {
    private String name;
    private String no;
    private String imageUrl;

    public Contact(String name, String no, String imageUrl) {
        this.name = name;
        this.no = no;
        this.imageUrl = imageUrl;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
