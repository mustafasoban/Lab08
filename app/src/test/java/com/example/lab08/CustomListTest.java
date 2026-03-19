package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDelete() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // Ensure the city was added
        assertTrue(list.hasCity(calgary));

        // This will fail because delete() doesn't exist yet
        list.delete(calgary);
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();

        // This will fail because countCities() doesn't exist yet
        assertEquals(0, list.countCities());

        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        assertEquals(1, list.countCities());
    }

}