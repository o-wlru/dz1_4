package ru.sky.pro;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        {
            int number = 1;
            while (number <= 10) {
                if (number < 10) {
                    System.out.print(number + " ");
                    number++;
                } else {
                    System.out.println(number); //вывод 10
                    break;
                }
            }
        }
        {

            for (int number = 10; number > 1; number-- ) {
                System.out.print(number + " ");
                if (number == 1)
                    System.out.println(number); //должна выводится "1". Но почему-то не выводится
                                                //и поэтому нет перехода на следующую строку в заголовке задания 2
                } }
        // Задание 2
        System.out.println("Задание 2");
        int friday1 = 3;
        for ( int fridayToday = friday1; fridayToday <=31; fridayToday +=7) {
            System.out.println("Сегодня пятница, " + fridayToday + " число, необходимо подготовить отчет");
        }
        // Задание 3
        System.out.println("Задание 3");
        int yearToday = 2021;
        int yearTodayMinus200 = yearToday - 200;
        int yearTodayPlus100 = yearToday + 100;
        for (int i = yearTodayMinus200; i <= yearTodayPlus100; i ++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }

        }




            }
        }

