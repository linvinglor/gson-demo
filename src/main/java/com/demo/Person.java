package com.demo;

public class Person {

    private String username;
    private String password;
    private int money;


    public Person() {

    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public void sayHi() {
        System.out.println("Hello world!!!");
    }

    public Person(String username, String password, int money) {
        super();
        this.username = username;
        this.password = password;
        this.money = money;
    }
}