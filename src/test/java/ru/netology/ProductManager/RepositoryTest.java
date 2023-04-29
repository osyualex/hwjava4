package ru.netology.ProductManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    @Test
    public void testRemoveWhenProductExist(){
        Repository repo = new Repository();
        Book book1 = new Book(1, "Гарри Поттер1", 100, "Роллинг");
        Book book2 = new Book(2, "Война и мир", 100, "Толстой");
        Book book3 = new Book(3, "Гарри Поттер1", 100, "Роллинг");
        Smartphone smartphone1 = new Smartphone(4, "Iphone14", 1000, "Appel");
        Smartphone smartphone2 = new Smartphone(5, "Iphone10", 10, "Appel");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(smartphone1);
        repo.add(smartphone2);
        repo.removeById(3);
        Product[] actual = repo.findAll();
        Product[] expected = {book1,book2,smartphone1,smartphone2};
        Assertions.assertArrayEquals(expected, actual);

    }

}