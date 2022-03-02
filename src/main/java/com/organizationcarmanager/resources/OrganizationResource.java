package com.organizationcarmanager.resources;

import com.organizationcarmanager.dto.OrganizationDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/organizations")
public class OrganizationResource {

    @PostMapping
    public HttpStatus createOrganization(){
        return OK;
    }

    @GetMapping
    public List<OrganizationDto> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public OrganizationDto findOne(@PathVariable String id) {
        return null;
    }

}
