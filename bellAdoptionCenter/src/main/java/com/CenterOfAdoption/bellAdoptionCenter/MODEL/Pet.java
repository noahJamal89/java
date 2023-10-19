package com.CenterOfAdoption.bellAdoptionCenter.MODEL;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name="PETS")

public class Pet implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="PET_ID")
    private long petId;

    @Column(name="PET_ADDRESS")
    private String petAddress;



    @Column(name="PET_COLOR")
    private String petColor;

    @Column(name="PET_FOOD_ALLREGY")
    private String petFoodAllregy;

    @Column(name="PET_GENDER")
    private String petGender;

    @Column(name="PET_NAME")
    private String petName;

    @Column(name="PET_STATUS")
    private String petStatus;

    @Column(name="PET_TRICK")
    private String petTrick;

    @Column(name="PET_TYPE")
    private String petType;

    @Column(name="PET_BIRTHDAY")
    private LocalDate petBirthday;

    //bi-directional many-to-one association to MedicalPet
    @OneToMany(mappedBy = "petMed")
    @JsonProperty
    @JsonIgnore
   private List<MedicalPet> medicalPet;


    //bi-directional many-to-one association to PetClient

    @ManyToOne
    @JoinColumn(name="CLIENT_ID", referencedColumnName = "CLIENT_ID")
    private PetClient petClient;

    //bi-directional many-to-one association to PetAdoption

    @OneToMany(mappedBy="pet")
    @JsonProperty
    @JsonIgnore
    private List<PetAdoption> petAdoptions;







}
