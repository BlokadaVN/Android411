package OOP10Lambda;

interface Converter<F, T> {
    T convert(F from); // T - возвращает значение, F - принимает.
}

public class Sample {
    public static void main(String[] args) {
// Лямбда выражение длинное.

//        Converter<String, Integer> converter = (from -> Integer.valueOf(from)); // .valueOf(from) - это как .parseInt(String s) строка преобразовывается в числовое значение.
//        Integer converted = converter.convert("123");
//        System.out.println(converted);

        // Лямбда короткое выражение.

        Converter<String, Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("123");
        System.out.println(converted);
    }
}
