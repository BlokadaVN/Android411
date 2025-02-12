package DZoop14_Nenashev;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        String[] color = {"red", "orange", "aqua", "pink", "gray", "blue", "white", "black", "yellow", "brown"};
        HashMap<String, Color> str = new HashMap<>();
        for (int i = 0; i < color.length; i++) {
            str.put(color[i], new Color(color[i]));
        }
        for (HashMap.Entry s : str.entrySet()) {
            System.out.println(s.getKey() + ": " + s.getValue());
        }
    }
}

class Color {
    private String name;

    public Color(String name) {
        this.name = name.toUpperCase();
    }

    @Override
    public String toString() {
        return name;
    }
}