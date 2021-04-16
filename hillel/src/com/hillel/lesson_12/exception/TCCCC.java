package com.hillel.lesson_12.exception;

public class TCCCC {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (RuntimeException ex) {
            System.err.println("RE");
        }catch (Exception ex) {
            System.err.println("E");
        }catch (Throwable ex) {
            System.err.println("T");
        }
        System.err.println("4");
    }
}
