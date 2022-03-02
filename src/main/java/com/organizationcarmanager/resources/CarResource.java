package com.organizationcarmanager.resources;

import com.organizationcarmanager.dto.CarDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/cars")
public class CarResource {

    @PostMapping("/organization/{organizationId}/assign/{carId}")
    public HttpStatus assignCarToOrganization(@PathVariable String organizationId,
                                              @PathVariable String carId) {
        return OK;
    }

    @GetMapping("/{organizationId}")
    public List<CarDto> findAllCarsInOrganization(@PathVariable String organizationId) {
        return null;
    }

    @GetMapping("/{registrationNumber}")
    public CarDto findOne(@PathVariable String registrationNumber) {
        return null;
    }
}
