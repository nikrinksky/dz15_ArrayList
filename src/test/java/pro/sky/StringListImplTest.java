package pro.sky;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListImplTest {

    StringListImpl stringListService;

    @BeforeEach
    public void setUp() {
        stringListService = new StringListImpl(10);;
    }

    @Test
    void add() {
        String expected = stringListService.add("ddd");

        String actual = "ddd";
        assertEquals(expected, actual);

    }


    @Test
    void testAdd() {
        String expected = stringListService.add(0, "aaa");
        String actual = "aaa";
        assertEquals(expected, actual);
    }

    @Test
    void set() {
        String expected = stringListService.set(0, "bbb");
        String actual = "bbb";

        assertEquals(expected, actual);
    }

    @Test
    void remove() {
        stringListService.add("ddd");
        String expected = stringListService.remove("ddd");

        String actual = "ddd";
        assertEquals(expected, actual);
    }

    @Test
    void testRemove() {
        stringListService.add("ddd");
        String expected = stringListService.remove(0);

        String actual = "ddd";
        assertEquals(expected, actual);
    }

    @Test
    void contains() {
        stringListService.add("ddd");
        boolean result = stringListService.contains("ddd");
        assertTrue(result);
    }

    @Test
    void indexOf() {
        stringListService.add("ddd");
        boolean result = stringListService.indexOf("ddd") >= 0;
        assertTrue(result);
    }

    @Test
    void lastIndexOf() {
        stringListService.add("ddd");
        boolean result = stringListService.lastIndexOf("ddd") >= 0;
        assertTrue(result);
    }

    @Test
    void get() {
        stringListService.add("ddd");
        String result = stringListService.get(0);
        assertNotNull(result);
    }

    @Test
    void testEquals() {
        stringListService.add("ddd");
        StringListImpl stringList = new StringListImpl();
        stringList.add("ddd");
        boolean result = stringListService.equals(stringList);

        assertTrue(result);
    }

    @Test
    void size() {
        int expected = stringListService.size();
        int actual = 0;

        assertEquals(expected, actual);
    }

    @Test
    void isEmpty() {
        boolean result = stringListService.isEmpty();

        assertTrue(result);
    }

    @Test
    void clear() {
        stringListService.add("ddd");
        stringListService.clear();
        boolean result = stringListService.isEmpty();

        assertTrue(result);
    }

    @Test
    void toArray() {
        String[] result = stringListService.toArray();

        assertNotNull(result);
    }
}