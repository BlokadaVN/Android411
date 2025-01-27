package OOP9Anonim.test.lymbdaprogram;

interface WordCounter {
    int countWorlds(String text); // Принимаем строку (String text), возвращаем число int countWorlds.
}

public class LymbdaProgram {
    public static void main(String[] args) {
        String txt = "   Лямбда     выражение.    ";
        System.out.println("Исходная строка: " + txt);

        WordCounter wordCounter = (s) -> s.trim().split("\\s+").length;// .trim() - убирает пробелы слева и справа.
        int ctr = wordCounter.countWorlds(txt);
        System.out.println("Количество слов: " + ctr);

        txt = "Программа, которая подсчитывает количество слов в предложении.";
        System.out.println("Исходная строка: " + txt);
        ctr = wordCounter.countWorlds(txt);
        System.out.println("Количество слов: " + ctr);
    }
}
