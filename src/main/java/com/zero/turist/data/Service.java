package com.zero.turist.data;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "service")
public class Service {

    @Id
    @Column(name = "service_id")
    @GeneratedValue
    private Long id;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "description")
    private String serviceDescription;

    @Column(name = "price")
    @Min(value = 0, message = "*Price can't be negative.")
    private int servicePrice;

    @Column(name = "amount")
    @Min(value = 0, message = "*Amount can't be negative.")
    private int serviceAmount;

    @Column(name = "company_id")
    private int companyId;


}
