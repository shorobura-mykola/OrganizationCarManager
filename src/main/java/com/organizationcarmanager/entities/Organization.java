package com.organizationcarmanager.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "organization")
    private List<User> users;

    @OneToMany(mappedBy = "organization")
    private List<Car> cars;

    @OneToMany(mappedBy = "organization")
    private List<CarHistory> carHistories;

}
