package com.hillel.lesson_10;
import com.hillel.lesson_05.staticCont.TestEClazz;

import java.sql.Timestamp;
import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) throws InterruptedException {

        Set<Temp> set = new HashSet<>();

        Temp t1 = new Temp("1", "2");
        System.out.println(t1);
        System.out.println(set.add(t1));

        Thread.sleep(5000);

        Temp t2 = new Temp("1", "2");
        System.out.println(t2);
        System.out.println(set.add(t2));

        System.out.println(set);
    }
}

class Temp{
    String a;
    String b;
    Timestamp timestamp;

    public Temp(String a, String b) {
        this.a = a;
        this.b = b;
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temp temp = (Temp) o;
        return Objects.equals(a, temp.a) &&
                Objects.equals(b, temp.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "Temp{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
