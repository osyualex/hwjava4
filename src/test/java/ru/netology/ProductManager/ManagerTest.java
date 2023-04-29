package ru.netology.ProductManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    @Test
    public void testWhenFewProductFound() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "Гарри Поттер1", 100, "Роллинг");
        Book book2 = new Book(2, "Война и мир", 100, "Толстой");
        Book book3 = new Book(3, "Гарри Поттер1", 100, "Роллинг");
        Smartphone smartphone1 = new Smartphone(1, "Iphone14", 1000, "Apple");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        Product[] actual = manager.searchBy("Гарри");
        Product[] expected = {book1, book3};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testWhenOneProductFound() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "Гарри Поттер1", 100, "Роллинг");
        Book book2 = new Book(2, "Война и мир", 100, "Толстой");
        Book book3 = new Book(3, "Гарри Поттер1", 100, "Роллинг");
        Smartphone smartphone1 = new Smartphone(1, "Iphone14", 1000, "Apple");
        Smartphone smartphone2 = new Smartphone(2, "Iphone10", 10, "Apple");


        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
        Product[] actual = manager.searchBy("Iphone10");
        Product[] expected = {smartphone2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testWhenProductIsAbsent() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "Гарри Поттер1", 100, "Роллинг");
        Book book2 = new Book(2, "Война и мир", 100, "Толстой");
        Book book3 = new Book(3, "Гарри Поттер1", 100, "Роллинг");
        Smartphone smartphone1 = new Smartphone(1, "Iphone14", 1000, "Apple");
        Smartphone smartphone2 = new Smartphone(2, "Iphone10", 10, "Apple");


        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
        Product[] actual = manager.searchBy("Samsung");
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

}