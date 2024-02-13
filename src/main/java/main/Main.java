package main;

import java.util.Scanner;// для прочитання інформації з консолі
import task1.Task1;
import task2.Task2;

class Main {// головна програма

    public static void main(String[] args) {


        // 1 завдання

        Task1 task1Instance = new Task1(); // зробимо два пакети, бо нам потрібно розмістити два завдання в одному репозиторії;

        Scanner in = new Scanner(System.in);//для того, щоб організувати читання інформації з консолі
        //******ініціалізація******
        float a = 1.0e0f, b = 2.0e0f;
        float h = (b - a) / (float) 10;//(float)- необхідний через те що ми хочемо мати у результаті число з плаваючою точкою,
        // тому потрібно провести ділення з плаваючою точкою, що досягається вказанням одного з операндів  (float)
        float er1, er2;// er1,er2- відносна похибка обчислення функції
        float y1, y2, y3;//y1,y2,y3-результати виконання функцій
        Task1.functions func = task1Instance.new functions();
        System.out.print("Введіть значення k= ");
        int k = in.nextInt();// 15
        System.out.print("Введіть значення eps= ");
        float eps = in.nextFloat();//1e-5f-0.00001
        //******ініціалізація******
        System.out.println("Результат(обчислення функції y=e^x):");
        Task1.printTable table =  task1Instance.new printTable("X", "Y1", "Y2", "Y3", "er1", "er2");
        for (float x = a; x <= b; x += h) {
            y1 = func.f1(x);//виклик необхідних функцій
            y2 = func.f2(x, k);
            y3 = func.f3(x, eps);
            er1 = Math.abs((y1 - y2) / y1) * 100;//обчислення похибки
            er2 = Math.abs((y1 - y3) / y1) * 100;
            table.print(x, y1, y2, y3, er1, er2);// виведення таблиці
        }
        table.close();//виведення розмежувача



        // 2 завдання

        String text;
        while (true) {
            System.out.print("Введіть рядок ->");
            text = in.nextLine();
            if (text.length() == 0)
                System.out.println("Помилка вводу, повторіть спробу");
            else break;
        }
       Task2.findRepeats(text);
    }
}


//public class Main {
//
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);// Для прочитання інформації з консолі
//        String text;
//        while (true) {
//            System.out.print("Введіть рядок ->");
//            text = in.nextLine();
//            if (text.length() == 0)
//                System.out.println("Помилка вводу, повторіть спробу");
//            else break;
//        }
//        findRepeats(text);
//    }
//}