package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.File;
import lombok.Data;

@Entity
@Data // generates all the common code like getters setters tostring and more

public class Instrument {

    // @Id to denote the primary key since this is an entity class
    @Id
    // the next line basically says how the id is generated in this case it is automatic
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;
    private String description;
    private Double value;
    private Integer year;
    // unsure of how i am going to parse these
    private File audio;
    private File image;
    // do i still need this
    public Instrument (String name, String description, Double val , Integer year,
                       File audioFilePath, File imageFilePath) {
        this.name = name;
        this.description = description;
        this.value = val;
        this.year = year;
        this.audio = audioFilePath;
        this.image = imageFilePath;
    }

}
