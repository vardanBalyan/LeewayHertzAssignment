package com.test.leewayhertz.assignment.demo.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection = "Movies")
public class Movies {

    @Id
    private long id;
    private String movieTitle;
    private String directorName;
}
