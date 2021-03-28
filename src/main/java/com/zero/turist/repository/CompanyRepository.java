package com.zero.turist.repository;

import com.zero.turist.data.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

//    @Query(value = "FROM company WHERE name = ?1")
    public Optional<Company> findOneByCompanyName(String name);

//    @Query("FROM company WHERE region = ?1")
    public Optional<Company> findOneByRegion(int region);

    //@Query("FROM company WHERE longitude = ?1 AND latitude = ?2")
    public Optional<Company> findOneByLatitudeAndLongitude(double latitude, double longitude);

    //@Query("FROM company WHERE company_type = ?1")
    public Optional<Company> findOneByCompanyType(int companyType);

    //@Query("FROM company WHERE name = ?1")
    public List<Company> findAllByCompanyName(String name);

    //@Query("FROM company WHERE region = ?1")
    public List<Company> findAllByRegion(int region);


//    @Query("FROM company WHERE company_type = ?1")
    public List<Company> findAllByCompanyType(int companyType);

}
