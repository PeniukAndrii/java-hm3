package Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Створити енум Стать.
//        Створити клас Юзер з плоями : ід, ім'я , вік, Стать.
//        Ствроити 10 об'єктів Юзера з відповідними ід (1-10)
//        Свторити  arrayList , та покласти цих юзерів в arayList.
//        - Проітерувати колекцію юзерів, вивевши тільки юзерів з парним значенням ід
//        - Проітерувати колекцію юзерів, вивевши тільки юзерів з ім'ям , довжина якого більше ніж 5 символів
//        - Проітерувати колекцію юзерів, вивевши тільки юзерів жінок

        User user1 = new User(1, "Oleg", 30, Sex.male);
        User user2 = new User(2, "Igor", 25, Sex.male);
        User user3 = new User(3, "Vasya", 20, Sex.male);
        User user4 = new User(4, "Andrii", 19, Sex.male);
        User user5 = new User(5, "Ira", 35, Sex.female);
        User user6 = new User(6, "Katya", 19, Sex.female);
        User user7 = new User(7, "Olya", 20, Sex.female);
        User user8 = new User(8, "Sofiya", 40, Sex.female);
        User user9 = new User(9, "Eva", 54, Sex.female);
        User user10 = new User(10, "Vitya", 12, Sex.male);

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);

        //  - Проітерувати колекцію юзерів, вивевши тільки юзерів з парним значенням ід
        for(User user : users){
            if (user.getId() % 2 == 0) {
                System.out.println("Pair id user: " + user);
            }
        }
        // - Проітерувати колекцію юзерів, вивевши тільки юзерів з ім'ям , довжина якого більше ніж 5 символів
        for(User user : users){
            if (user.getName().length()>=5){
                System.out.println("name>5:" + user);
            }
        }
        // - Проітерувати колекцію юзерів, вивевши тільки юзерів жінок
        for(User user : users) {
            if(user.getSex() == Sex.female){
                System.out.println("Female: " + user);
            }
        };
    }
}
