package com.zero.turist.repository;

import com.zero.turist.data.Service;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ServiceRepository extends CrudRepository<Service, Integer> {

//    @Query(value = "FROM service WHERE name = ?1")
    public Optional<Service> findOneByServiceName(String name);

//    @Query("FROM service WHERE price = ?1")
    public Optional<Service> findOneByServicePrice(int price);

//    @Query("FROM service WHERE price <= ?1")
    public Service findOneByServicePriceIsLessThanEqual(int price);

//    @Query("FROM service WHERE name = ?1")
    public List<Service> findAllByServiceName(String name);

//    @Query("FROM service WHERE price = ?1")
    public List<Service> findAllByServicePrice(int region);

//    @Query("FROM service WHERE price <= ?1")
    public List<Service> findAllByServicePriceLessThanEqual(int region);

//    @Query("FROM service WHERE amount = ?1")
    public Service findOneByServiceAmount(int amount);

//    @Query("FROM service WHERE amount = ?1")
    public List<Service> findAllByServiceAmount(int amount);

//    @Query("FROM service WHERE company_id = ?1")
    public Service findOneByCompanyId(int companyId);

//    @Query("FROM service WHERE company_id = ?1")
    public Service findAllByCompanyId(int companyId);

}
