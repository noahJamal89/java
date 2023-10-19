package com.CenterOfAdoption.bellAdoptionCenter.MODEL;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="STUDENTS")
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "STD_ID")
    private long stdId;

    @Column(name = "STD_NAME")
    private String stdName;

    //bi-directional many-to-one association to Laptop
    @OneToMany(mappedBy = "student" , cascade = CascadeType.ALL)
    @JsonProperty
    @JsonIgnore
    private List<Laptop> laptops=new ArrayList<>();




}