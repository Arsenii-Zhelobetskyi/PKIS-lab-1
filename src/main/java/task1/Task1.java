package task1;

public class Task1 {

    public class functions {//обчислення функції f(x), використовуючи її розкладання в степеневий ряд у трьох випадках:

        //    1) для "точного" значення (за аналітичною формулою).
        public float f1(float x) {
            return (float) Math.exp(x);
        }

        //    2) для заданого k (запитати в користувача);
        public float f2(float x, float kMax) {
            int k = 0;
            float a = 1.0f;// черговий елемент
            float sum = a;
            while (k <= kMax) {
                a = a * x / (k + 1);
                sum += a;
                k++;
            }
            return sum;
        }


        //    3) для заданої точності e (запитати в користувача);
        public float f3(float x, float eps) {
            // kMax- той К який ми запитуємо у користувача
            int k = 0;
            float a = 1.0f;// черговий елемент
            float sum = a;
            while (Math.abs(a) >= eps) {
                a = a * x / (k + 1);
                sum += a;//складаємо результат
                k++;
            }
            return sum;//та потім повертаємо результат

        }

    }

    public class printTable {//для виведення таблиці
        private
        int argumentsLength;//змінна необхідна для того, щоб красиво вивести таблицю

        public void separator(int repeats) {
            for (int i = 0; i < repeats; i++) {
                System.out.print(String.format("%-13s", "+").replace(' ', '-'));//виводить роздільники в таблиці
            }
            System.out.println("+");
        }

        public printTable(String... arguments) {//arguments - отримати усі аргументи в одну змінну
            String s1 = " ";
            //конструктор
            argumentsLength = arguments.length;
            separator(argumentsLength);
            for (String element : arguments) {
                System.out.print(String.format("| %1$5s %2$5s", element, s1));
            }
            System.out.println("|");
            separator(argumentsLength);
        }// конструктор для класу

        public void print(float... arguments) {//виводить рядок даних
            for (float element : arguments) {
                System.out.printf("| %10.4e ", element);
            }// виводить дані в таблицю
            System.out.println('|');
        }

        public void close() {// закриває таблицю розділювачами
            separator(argumentsLength);
        }
    }
}
