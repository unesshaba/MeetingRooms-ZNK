package com.meetingplanner.services;

import com.meetingplanner.dto.SalleDto;
import com.meetingplanner.entities.Equipment;
import com.meetingplanner.entities.Salle;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SalleServicesTest {

    @Mock
    private SalleServices salleServices;

    @Test
    void testFilterByCapaciter() {
        //given
        List<Salle> salles = new ArrayList<>();
        Salle salle1 = new Salle(1L, "Salle A", 10, 7, null, null, null);
        Salle salle2 = new Salle(2L, "Salle B", 20, 14, null, null, null);
        Salle salle3 = new Salle(3L, "Salle C", 30, 21, null, null, null);
        salles.add(salle1);
        salles.add(salle2);
        salles.add(salle3);
        int expectedCapacity = 15;
        List<Salle> expectedSalles = new ArrayList<>();
        expectedSalles.add(salle2);
        expectedSalles.add(salle3);

        //when
        List<Salle> filteredSalles = salleServices.filterByCapaciter(salles, expectedCapacity);


        //then
        assertEquals(expectedSalles, filteredSalles);
    }
}
