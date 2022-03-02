package com.organizationcarmanager.resources;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/users")
public class UserResource {

    @PostMapping
    public HttpStatus createUser() {
        return OK;
    }

    @PostMapping("/organization/{organizationId}/assign/{userId}")
    public HttpStatus assignUserToOrganization(@PathVariable String organizationId,
                                               @PathVariable String userId) {
        return OK;
    }

}
