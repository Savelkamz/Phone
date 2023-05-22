public class Main {
    public static void main(String[] args) {
        System.out.println("Класс Phone:");
        Phone phone = new Phone("8 (495) 555-55-22", "Samsung A10", 1.1);
        Phone phone2 = new Phone("8 (800) 555-35-35", "iPhone 14s");

        System.out.println("Номер телефона: " + phone.getNumber() + ", Модель: " + phone.getModel() + ", Вес: " + phone.getWeight());
        System.out.println("Номер телефона: " + phone2.getNumber() + ", Модель: " + phone2.getModel() + ", Вес: " + phone2.getWeight());

        phone.receiveCall("Иван");
        phone.receiveCall("Никита", "8 (915) 184-43-23");

        phone.sendMessage("8 (919) 615-29-73", "8 (495) 920-54-21");

        System.out.println("\nКласс Person:");
        Persone person = new Persone("Петр Иванов", 18);
        Persone person2 = new Persone("Владислав Кукушкин", 32);

        System.out.println("Полное имя: " + person.getFullName() + ", возраст: " + person.getAge());
        System.out.println("Полное имя: " + person2.getFullName() + ", возраст: " + person2.getAge());

        person.move();
        person.talk();
        person2.move();
        person2.talk();
    }
}