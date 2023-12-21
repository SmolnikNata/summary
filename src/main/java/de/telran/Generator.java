package de.telran;


import com.github.javafaker.Faker;
import lombok.experimental.UtilityClass;

import java.util.Random;

@UtilityClass
public class Generator {
    private static final Faker FAKER = new Faker();//фэйковая база данных для
    // заполнения нужных полей строчных: адрес, название....
    private static final Random RANDOM = new Random();//создает(экземпляр класса)
    // случайное число или символ.


    private static Condition randomConditionGen() {
        Condition[] conditions = Condition.values(); //new old damaged
        int index = RANDOM.nextInt(3);
        return conditions[index];
    }

    private static boolean isEbookRandomGen() {
        boolean[] isEbook = {true, false};
        int index = RANDOM.nextInt(2);
        return isEbook[index];
    }

    public static Book[] bookGenerator(int bookNumbers) {
        Book[] books = new Book[bookNumbers];
        for (int i = 0; i < bookNumbers; i++) {
            books[i] = new Book(FAKER.book().author(),
                    FAKER.book().title(),
                    bookIssueDate(),
                    randomConditionGen(),
                    isEbookRandomGen());
        }
        return books;
    }


    //todo
    private static int bookIssueDate() {
        int year = RANDOM.nextInt(1900,2023);
        //int year = RANDOM.nextInt(max-min)+min;
        return year;
    }

    //todo1. Вывести все адреса библиотек
    //     public static void printAllAddresses(Library[] libraries)
    public static Library[] libraryGen() {
        Library[] libraries = new Library[5];// l1,l2,l3,l4,l5
        int bookNumber = 15;
        for (int i = 0; i < libraries.length; i++) {
           libraries[i]= new Library(FAKER.address().fullAddress(),bookNumber,bookGenerator(bookNumber));
        }
        return libraries;

        //logic.......

    }
}
