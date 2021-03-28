package com.zero.turist.data;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "file")
@Data
public class File extends BaseEntity {

    @Id
    @Column(name = "file_id")
    @GeneratedValue
    private Long id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "byte_data")
    private byte[] byteData;

    @Column(name = "file_type")
    private String fileType;

//    @OneToOne (
//            cascade = CascadeType.ALL,
//            orphanRemoval = true,
//            mappedBy = "users"
//    )
//    private User owner;


}
