package com.zero.turist.data;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "region")
public class Region extends BaseEntity{

    @Id
    @GeneratedValue
    @Column(name = "regionId")
    private Long id;

    @Column(name = "region_name")
    private String regionName;
}
