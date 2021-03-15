package com.momoka.studentmanager.pojo;

public class Black {
    private int id;
    private String name;
    private String age;
    private String gender;
    private String tel;

    public Black(){
    }

    public Black(int id, String name, String age, String gender, String tel) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
