package com.hillel.lesson_05;

public class BankDeposite {
    public static void main(String[] args) {
        // вклад 1000
        // 12% годовых
        // 5 лет
        // капитализация каждый месяц 1%
        // прибыль по годам и суммарная прибыть
        // данный передаем через аргументы приложения

        // сумма : процентная ставка : срок


        Integer vklad = Integer.parseInt(args[0]);
        Integer procStavka = Integer.parseInt(args[1]);
        Integer srok = Integer.parseInt(args[2]);

        double mesProcent = procStavka / 12;
        double mes = srok * 12;

        double summ = vklad;
//        for (int i = 1; i <= mes; i++){
//            summ = summ + summ * (mesProcent / 100);
//            System.out.println("месяц : " + i + ", сумма : " +summ);
//        }

        for (int i = 1; i <= srok; i++){
            System.out.println("Год №" + i);
            double year = 0;
            System.out.println(year + "   " + summ);
            for (int j = 1; j <= 12; j++){
                double perMonth = summ * (mesProcent / 100);
                summ = summ + perMonth;
                year += perMonth;
            System.out.println("месяц : " + j + ", сумма : " + summ);

            }
            System.out.println(year);
        }


    }
}
