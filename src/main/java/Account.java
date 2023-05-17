public class Account {

    private final String name;
    private int countOfWhiteSpaces = 0;

    public Account(String name) {
        this.name = name;
    }

    // метод, который считает количество пробелов
    public int countOfWhiteSpace() {
        if ((name != null) && (name.length() > 0)) {
            for (int i = 0; i < name.length(); i++) {
                if (Character.isWhitespace(name.charAt(i))) {
                    countOfWhiteSpaces += 1;
                }
            }
        }
        return countOfWhiteSpaces;
    }

    // метод проверки отсутсвия пробела вначале строки
    public boolean isNotWhiteSpaceInTheBegin() {
        return !(Character.isWhitespace(name.charAt(0)));
    }

    // метод проверки отсутствия пробела в конце строки
    public boolean isNotWhiteSpaceInTheEnd() {
        return !(Character.isWhitespace(name.charAt(name.length()-1)));
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям:
                в строке не меньше 3 и не больше 19 символов,
                в строке есть только один пробел,
                пробел стоит не в начале и не в конце строки..
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        return ((this.name.length() > 2) && (this.name.length() < 19) && (countOfWhiteSpace() == 1) && (isNotWhiteSpaceInTheBegin()) && (isNotWhiteSpaceInTheEnd()));
    }
}