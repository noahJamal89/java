package com.CenterOfAdoption.bellAdoptionCenter.MODEL;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.lang.NonNull;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="PET_CLIENT")
public class PetClient implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "CLIENT_ID")
    private long clientId;

    @Column(name = "CLIENT_ALLERGY")
    private char clientAllergy;


    @Column(name = "CLIENT_BIRTHDAY")
    private LocalDate clientBirthday;

    @Column(name = "CLIENT_EMAIL")
    private String clientEmail;

    @Column(name = "CLIENT_FNAME")
    private String clientFname;

    @Column(name = "CLIENT_LNAME")
    private String clientLname;

    @Column(name = "CLIENT_PHONE_NUMBER")
    private String clientPhoneNumber;

    @Column(name = "CLIENT_STATUS")
    private char clientStatus;

    //bi-directional many-to-one association to Pet

    @OneToMany(mappedBy = "petClient" , cascade = CascadeType.ALL)
    @JsonProperty
    @JsonIgnore
    private List<Pet> pets = new ArrayList<>();


}
