package task2;

public class Task2 {
    static void findRepeats(String text) {// знаходить повтори
        String[] words = text.replaceAll("[-+.^:,$@!\\\\/()\\[\\]*&%#?|;_\n']", " ").trim().split(" ");
        // replaceALl-прибираємо зайві символи
        // trim-видаляємо зайві пробіли
        // split розбиваємо рядок на масив слів
        System.out.println("\nПерше слово рядка: " + words[0]);


        System.out.println("Слова, які збігаються з першим словом рядка:");
        System.out.println("-------------------------------------------");
        // обробка рядка:
        int repeats = 0;
        for (int i = 1; i < words.length; i++) {//шукаємо в рядку слова які однакові з першим словом
            if (words[0].equalsIgnoreCase(words[i])) {
                System.out.println(words[i]);// якщо знайшли таке слово виводимо його на екран;
                repeats++;
            }
        }
        if (repeats == 0) System.out.println("Співпадінь не знайдено;");
        System.out.println("-------------------------------------------");
        System.out.println("Кількість співпадінь ->" + repeats);
        System.out.println("-------------------------------------------");

    }
}
