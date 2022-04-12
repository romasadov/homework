package ru.geekbrains;

public class Main {
    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Сергей Маркин","Уборщик","Ubor@mail.ru","+79871457645",60,13000);
        persArray[1] = new Employee("Дмитрий Абаренов","Видитель","Abar@mail.ru","+79826372123",30,100000);
        persArray[2] = new Employee("Владимир Клепнев","Продавец","Klep@icloud.com","+79864324976",28,15000);
        persArray[3] = new Employee("Владимир Путин","Призедент","PUtin@icloud.com","+79814277777",68,6000000);
        persArray[4] = new Employee("Генадий Боков","Разработчик","Bokov@mail.ru","+79845647896",23,60000);


        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) persArray[i].print();
        }






    }
}
