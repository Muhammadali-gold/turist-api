package com.zero.turist.repository;

import com.zero.turist.data.Region;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegionRepository extends CrudRepository<Region, Integer> {


    //@Query("FROM region where name = ?1")
    Optional<Region> findByRegionName(String name);
}
