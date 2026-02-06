package ru.stqa.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTests {

    @Test
    void arrayTests() {
        //инициализировать массив,только указав размер (все эл-ты null)
        //var array = new String[3];
        //array[0] = "a";

        //инициализировать массив и сразу присвоить значения элементов
        var array = new String[]{"a","b","c"};
        Assertions.assertEquals("a", array[0]);

        //изменить значение элемента
        array[0] = "d";
        Assertions.assertEquals("d", array[0]);

        //добавить-удалить элемент в массиве невозможно - у него фиксированная длина
        //когда нужен массив бОльшего размера с теми же эл-ми,
        // то создать новый массив нужного размера и скопировать в него эл-ты

        //проверить длину массива
        Assertions.assertEquals(3, array.length);
    }

    @Test
    void listTests() {
        //создать список для хранения строк
        var list = new ArrayList<String>();

        //проверить длину списка (изначально 0)
        Assertions.assertEquals(0, list.size());

        //добавить элемент в список
        list.add("a");
        Assertions.assertEquals(1, list.size());

        //получить значение элемента (индексация тоже с 0)
        Assertions.assertEquals("a", list.get(0));

        //изменить значение элемента
        list.set(0,"d");
        Assertions.assertEquals("a", list.get(0));

        //создать список и проинициализировать его элементами
        //но при таком способе создания получаем немодифицируемый список
        var list1 = List.of("a","b","c");

        //создать немодифиц список и из него конструктором получить модифицируемый список
        var list2 = new ArrayList<String>(List.of("a","b","c"));

        //можно не указывать тип, т.к. тип ясен из перечисления "a","b","c"
        var list3 = new ArrayList<>(List.of("a","b","c"));
    }
}
