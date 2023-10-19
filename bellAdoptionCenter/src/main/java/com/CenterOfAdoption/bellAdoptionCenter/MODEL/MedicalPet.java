package com.CenterOfAdoption.bellAdoptionCenter.MODEL;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

import java.util.List;


@Data
@Entity
@Table(name="MEDICAL_PET" )
public class MedicalPet implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "PET_MEDICAL_ID")
    private long petMedicalId;

    @Column(name = "PET_DISABLITIY")
    private char petDisablitiy;

    @Column(name = "PET_M_DISEASE")
    private String petMDisease;

    @Column(name = "PET_M_LIFE_VACCINE")
    private char petMLifeVaccine;

    @Column(name = "PET_M_STERILE")
    private char petMSterile;

    @Column(name = "PET_M_YEARLY_VACCINES")
    private char petMYearlyVaccines;

    //bi-directional many-to-one association to Pet

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="PET_ID")
    private Pet petMed;
}

