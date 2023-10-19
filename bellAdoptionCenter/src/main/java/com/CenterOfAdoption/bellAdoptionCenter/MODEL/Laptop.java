package com.CenterOfAdoption.bellAdoptionCenter.MODEL;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="LAPTOPS")
public class Laptop implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="LAP_ID")
    private long lapId;

    @Column(name="LAP_BRAND")
    private String lapBrand;

    //bi-directional many-to-one association to Student
    @ManyToOne
    @JoinColumn(name="STD_ID" ,referencedColumnName = "STD_ID")

    private Student student;


}