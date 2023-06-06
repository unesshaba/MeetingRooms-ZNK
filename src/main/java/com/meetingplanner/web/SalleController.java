package com.meetingplanner.web;

import com.meetingplanner.dto.SalleDto;
import com.meetingplanner.services.SalleServices;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class SalleController {

    private final SalleServices salleServices;


    @GetMapping("/filtered-salles")
    public List<SalleDto> getFilteredSalles(@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  Date start, @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date end , @RequestParam(required = false,defaultValue = "0") int capacity, @RequestParam(required = false) List<Long> equipment, @RequestParam(required = false) Long typeReservation){
        return salleServices.filterSalles(start,end,capacity,equipment,typeReservation);

    }


}
