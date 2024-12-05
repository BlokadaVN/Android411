package lesson17;

public class Main {
    public static void main(String[] args) {

        // Изучение строк, продолжение

//        // StringBuilder - позволяет работать со строками, которые будут изменяемыми


//        StringBuilder sb = new StringBuilder();
//        System.out.println(sb.capacity()); // .capacity() - показывает сколько памяти выделяется для данной переменной (sb)
//        System.out.println(sb.length());
//        System.out.println(sb + "\n");
//
//        StringBuilder sb1 = new StringBuilder(1000); // 1000 - в данном случае, сколько элементов можно будет сохранить в данной переменной.
//        System.out.println(sb1.capacity());
//        System.out.println(sb1.length());
//        System.out.println(sb1 + "\n");
//
//
//        StringBuilder sb2 = new StringBuilder("Java"); // 20 - объем памяти. 4 - длинна строки. Java - текст.
//        System.out.println(sb2.capacity());
//        System.out.println(sb2.length());
//        System.out.println(sb2 + "\n");


        // =====================================================================

//        StringBuilder sb = new StringBuilder();

        //       sb.append("a"); // .append - добавлять какие - то значения. Разные типы данных в одну строку. Добавляет в конец строки.
//        sb.append(true);
//        sb.append(10);
//        sb.append(10.2f);
//        sb.append(12364564l);
//        sb.append('a');
//        sb.append("Hello").append(" ").append("World");
//
//        sb.insert(5, "!"); // .insert - добавить символ (5 - это индекс. ! - символ)
//        sb.insert(sb.length(), "!!!");
//        System.out.println(sb);
//
//        sb.delete(5, 6); // удаляет в данном случае 5-й индекс не включая 6-й.
//        sb.deleteCharAt(5); // удаляет 5-й индекс (только один индекс)
//        System.out.println(sb);
//
//        sb.replace(5, 10, "Java"); // заменяет с 5-го по 10-й индекс "Java" - на это слово.
//        System.out.println(sb);
//
//        String st = sb.substring(6, 7); // находит элемент от 6-го до 7-го индекса (7-й не включая)
//        System.out.println(st);
//        st = sb.substring(6); // от 6-го до конца строки.
//        System.out.println(st);


        // Разворот строки в обратную сторону.
//
//        sb.append("Hello").append(" ").append("World");
//        System.out.println(sb);
//        sb.reverse(); // разворачивает текс в обратную сторону!!!!!!!!!!!!!!!!
//        System.out.println(sb);
//        System.out.println(sb.indexOf("l",2)); // l лежит в индексе 1, а 2 в данной ситуации, с какого индекса искать дальше.


        StringBuilder sb1 = createStr(5, 3);
        System.out.println(sb1);

        modifyStr(sb1, "=", "равно");
        modifyStr(sb1, "+", "плюс");
        modifyStr(sb1, "-", "минус");
        modifyStr(sb1, "*", "умножить");
        System.out.println(sb1);
    }

    public static StringBuilder createStr(int a, int b) {
        StringBuilder res = new StringBuilder();
        res.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        res.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n");
        res.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        return res;
    }

    public static StringBuilder modifyStr(StringBuilder stBuild, String oldStr, String newStr) {
        int pos;
        while ((pos = stBuild.indexOf(oldStr)) != -1) {
//            stBuild.deleteCharAt(pos).insert(pos, newStr);
            stBuild.replace(pos, pos + 1, newStr); // pos, pos +1 это от какой до какой позиции мы заменяем символы.
        }
        return stBuild;
    }
}

