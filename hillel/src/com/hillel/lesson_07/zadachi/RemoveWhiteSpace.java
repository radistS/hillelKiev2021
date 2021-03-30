package com.hillel.lesson_07.zadachi;

// Напишите Java-программу для удаления всех пробелов из строки без использования replace().
public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str = "Башка сегодня отключилась." +
                     "Не вся, конечно, — есть могу.";

        String[] values = str.split(" ");

        str = "";
        for (String s : values){
            str = str.concat(s);
        }

        System.out.println(str);

    }

}
