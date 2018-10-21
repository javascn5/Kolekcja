package com.sda.git;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*List<String> list = new ArrayList<>();// tworzymy liste

        list.add("jab");//  dodajemy elementy do listy
        list.add("maciej");
        list.add("Pokemon");

        System.out.println("Rozmiar = " + list.size());// pokazuje rozmiar listy

        list.add("Pikaczu");
        list.add("Golem");
        System.out.println("Rozmiar = " + list.size());

        for (String imie : list) {
            System.out.println("Imie " + imie);// petla for each pokazuje wszytko z listy
        }
        list.remove("Jab");// usuwany wybrany element
        list.remove(0);// usuwamy wybrany element po indeksie
        String imie;
        try {
            imie = list.get(72); // wyciagamy wskazany element z listy do zmiennej
            System.out.println("Element o indeksie 72" + imie);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Za daleko!");
            e.printStackTrace();
        }


        list.clear(); // usuwa wszytko z listy*/

        User user1 = new User("Oleg", "Dzhum", 28);
        User user2 = new User("Marta", "Paluszek", 18);
        User user3 = new User("ktos", "jakos", 0);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        for (User list : userList) {
            System.out.println("Imie: " + list.getName() + "Nazwisko: " + list.getLastname() + "WIek: " + list.getAge());
        }
            for (User list: userList){
                System.out.println(list.toString());
            }
    }

}
