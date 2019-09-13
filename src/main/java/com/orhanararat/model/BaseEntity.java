package com.orhanararat.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@JsonIgnoreProperties({"modifiedDate","createDate","status"})
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int status = 1;

    private LocalDateTime modifiedDate = LocalDateTime.now();

    private LocalDateTime createDate;

//    public LocalDateTime setModifiedDate(LocalDateTime date){
//        return LocalDateTime.now();
//    }
}
