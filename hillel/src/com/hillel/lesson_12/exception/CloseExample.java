package com.hillel.lesson_12.exception;

import java.io.Closeable;
import java.io.IOException;
import java.sql.SQLException;

public class CloseExample {
    public static void main(String[] args)  {

        try (Test text = new Test();) {
            text.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

class Test  implements Closeable{
    @Override
    public void close() throws IOException {
        System.out.println("run method : close()");
    }

    public void run() throws SQLException {
        System.out.println("run method : run()");
        throw new BussinesException("class run");
    }
}