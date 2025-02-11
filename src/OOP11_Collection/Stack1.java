package OOP11_Collection;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Катя");
        stack.push("Наташа");
        stack.push("Ирина");
        stack.push("Ольга");
        stack.push("Таня");
        System.out.println(stack);
        stack.remove(2);
        System.out.println(stack.pop()); //  .pop - удаляет последний индекс.
        System.out.println(stack);
    }
}
