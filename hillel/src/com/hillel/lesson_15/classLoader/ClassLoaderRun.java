package com.hillel.lesson_15.classLoader;

import java.lang.reflect.InvocationTargetException;

public class ClassLoaderRun {

    public static void main(String[] args) {
        try {
            Class clazz = Student.class;
            System.out.println(clazz.getSimpleName());
            System.out.println(clazz.getClassLoader());
            System.out.println();


            Student student = (Student) clazz.getDeclaredConstructor().newInstance();


            student.print();

            Class clazzStudent = new CustomClassLoader().findClass("Student");
//            System.out.println(clazzStudent.getSimpleName());
//            System.out.println(clazzStudent.getClassLoader());
//            System.out.println();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
