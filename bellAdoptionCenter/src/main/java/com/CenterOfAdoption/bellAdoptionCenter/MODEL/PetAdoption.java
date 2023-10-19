package com.CenterOfAdoption.bellAdoptionCenter.MODEL;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name="PET_ADOPTION")
public class PetAdoption implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="PET_ADOPTION_ID")
    private long petAdoptionId;

    @Column(name="PET_ADOPTION_CONTRACT")
    private String petAdoptionContract;


    @Column(name="PET_ADOPTION_DATE")
    private LocalDate petAdoptionDate;

    @Column(name="PET_ADOPTION_DESC")
    private String petAdoptionDesc;

    //bi-directional many-to-one association to Pet
    @ManyToOne
    @JoinColumn(name="PET_ID")
    private Pet pet;


    //bi-directional many-to-one association to PetClient

    @ManyToOne
    @JoinColumn(name="CLINET_ID")
    private PetClient petClient;
}
