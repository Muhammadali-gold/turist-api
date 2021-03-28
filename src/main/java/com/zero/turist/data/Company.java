package com.zero.turist.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "company")
public class Company extends BaseEntity{

    @Id
    @Column(name = "company_id")
    @GeneratedValue
    private Long id;

    @Column(name = "company_name")
    @NotNull()
    private String companyName;

    @Column(name = "region")
    private int region;

    @Column(name = "longitude")
    private  double longitude;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "company_type")
    private int companyType;


    @Column(name = "description")
    @NotNull
    private String companyDescription;




}
