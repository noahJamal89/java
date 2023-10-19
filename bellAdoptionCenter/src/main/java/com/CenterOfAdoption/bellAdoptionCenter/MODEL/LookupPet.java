package com.CenterOfAdoption.bellAdoptionCenter.MODEL;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name="LOOKUP_PETS")
public class LookupPet implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(name="LOOKUP_ID")
    private long lookupId;

    @Column(name = "FOURTH_LOOKUP")
    private BigDecimal fourthlookup;

    @Column(name="SECOND_LOOKUP")
    private BigDecimal secondLookup;

    private BigDecimal thirdlook;



}
