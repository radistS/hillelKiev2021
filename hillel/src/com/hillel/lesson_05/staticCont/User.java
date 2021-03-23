package com.hillel.lesson_05.staticCont;

public class User {

    private static final int nationalityId = 10;
    private static int age;
    private String userName;
    private String phone;

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        User.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static int getNationalityId() {
        return nationalityId;
    }

}
