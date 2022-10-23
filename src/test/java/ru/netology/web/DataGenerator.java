package ru.netology.web;

import com.github.javafaker.Faker;
import lombok.Value;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {

    static {
        new Faker(new Locale("ru"));
    }

    private DataGenerator() {
    }

    public static class Registration {
        private Registration() {
        }
        // генерим пользователя с учетом города, даты, имени и телефона
        public static UserInfo generateUserInfo() {
            return new UserInfo(generateCity(), generateDate(3), generateName(), generatePhone());
        }
        // генеририм список городов через массив
        public static String generateCity() {
            String[] cities = new String[]{"Москва", "Смоленск", "Волгоград", "Нижний Новгород", "Казань"};
            int itemIndex = (int) (Math.random() * cities.length);
            return cities[itemIndex];
        }
        // генерим дату через класс LocalDate
        public static String generateDate(int daysToAdd) {
            return LocalDate.now().plusDays(daysToAdd).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        }

        // генерим имя через Faker
        public static String generateName() {
            Faker faker = new Faker(new Locale("ru"));
            return faker.name().fullName();
        }
        // генерим телефон через Faker
        public static String generatePhone() {
            Faker faker = new Faker(new Locale("ru"));
           return faker.phoneNumber().phoneNumber();

        }
    }

}