package com.orhanararat.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class User extends BaseEntity {

    public User() {
        setCreateDate(LocalDateTime.now());
    }

    @Size(min = 3, message = "Name should have 2 character")
    private String name;
    private String surname;
    private int age;
    private String gender;
    private String profileImageUrl;
    @Lob
    private String profileImage;
}
