import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //initial variables and strings
        String str1 = "Перестановочный алгоритм быстрого действия";
        String str2 = "Перевыборы выбранного президента";
        String str3 = "Посмотрите как Рите нравится ритм";
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int counter = 0;
        int extraCounter = 0;

        //task #1
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'о') {
                System.out.print(str1.charAt(i));
            }
        }

        // task #2
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == 'е') {
                counter += 1;
            }
        }
        System.out.println(counter);

        // task #3
        String str3_lower = str3.toLowerCase();
        int index = str3_lower.indexOf("рит");

        while (index != -1) {
            System.out.println(index);
            index = str3_lower.indexOf("рит", index + 1);
        }

        //extra task !!!
        for ( int i = 0; )





}
}