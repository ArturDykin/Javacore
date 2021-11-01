package HomeWork4;

public class Main {
    public static void main(String[] args){
        System.out.println("Ваш справочник");
        Phonebook phonebook = new Phonebook();

        System.out.println("Данные справочника");
        phonebook.add("Иванов", "88005555535");
        phonebook.add("Петров", "88005555536");
        phonebook.add("Петров", "88005555537");
        phonebook.add("Путин", "88005555538");
        phonebook.add("Сидоров", "88005555539");

        System.out.println("Получаем данные контакта");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
        System.out.println("Сидоров");
        System.out.println(phonebook.get("Сидоров"));
        System.out.println("Путин");
        System.out.println(phonebook.get("Путин"));

        System.out.println("Запись отсутствует");
        System.out.println("Медведев");
        System.out.println(phonebook.get("Медведев"));

        System.out.println("Номер уже зянят");
        phonebook.add("Иванов", "88005555535");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
    }
}
