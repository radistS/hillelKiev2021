package com.hillel.lesson_07.enumer;

public class UserStatusRun {
    public static void main(String[] args) {
        User u = new User("test@email.com");

        System.out.println(u);

        u.setStatus(UserStatus.ACTIVE);

        System.out.println(u);

        for (UserStatus us : UserStatus.values()){
            System.out.println(us);
        }


        String act = "ACTIVE";
        UserStatus ust = UserStatus.valueOf(act);
        System.out.println(act.getClass());
        System.out.println(ust.getClass());
        System.out.println(ust);
    }
}
