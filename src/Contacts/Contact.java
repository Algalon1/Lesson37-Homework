package Contacts;

import java.util.ArrayList;
/*
Хранение контактов в телефонной книге:

Условие: Необходмо создать класс Contacts.Contact, который содержит свойства name и phone,
 а так же метод info, который возвращает строку со значением имени и телефона.
Создайте ArrayList из 5 контактов. Пройдитесь циклом по нему
и для каждого объекта вызовите info и результат выведите в терминал
 */
public class Contact  {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String info(){
        return String.format("%s %s",this.name,this.phoneNumber);
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static  String findName(ArrayList<Contact> array,String name){
        for (Contact elem:array) {
            if(elem.getName().equals(name)){
                return elem.info();
            }
        }
        return "not found";
    }

    public static  String findPhoneNumber(ArrayList<Contact> array,String phoneNumber){
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getPhoneNumber().equals(phoneNumber)){
                return array.get(i).info();
            }
        }
//        for (Contacts.Contact elem:array) {
//            if(elem.getPhoneNumber().equals(phoneNumber)){
//                return elem.info();
//            }
//        }
        return "not found";
    }
}
