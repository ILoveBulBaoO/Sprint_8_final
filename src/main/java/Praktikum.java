public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */

        String name = "Тимоти Шаламе";
        Account account = new Account(name);
//        System.out.println(account.isNotWhiteSpaceInTheBegin());
//        System.out.println(account.isNotWhiteSpaceInTheEnd());
//        System.out.println(account.checkNameToEmboss());
        account.checkNameToEmboss();
    }

}