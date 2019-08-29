package com.orhanararat.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class User extends BaseEntity {

    @Size(min = 3, message = "Name should have 2 character")
    private String name;

//    @Past
//    private LocalDate birthDay;

}
