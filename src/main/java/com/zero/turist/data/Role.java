package com.zero.turist.data;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "role")
public class Role extends BaseEntity {


    @Id
    @Column(name = "role_id")
    @GeneratedValue
    private Long id;

    @Column(name = "role")
    private String role;


}
