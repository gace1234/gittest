package com.jwj.pojo;

public class Person {

    private Integer id;
    private String pName;

    public Person() {
    }

    public Person(Integer id, String pName) {
        this.id = id;
        this.pName = pName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", pName='" + pName + '\'' +
                '}';
    }
}
