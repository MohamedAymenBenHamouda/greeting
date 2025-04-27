package com.fsb.greeting.dao.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

 import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; 


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name="persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
     @Column(name="persons_name",length = 30, nullable=false, unique = true) 
    private String name;
    private short age;
    private String photo; 
}