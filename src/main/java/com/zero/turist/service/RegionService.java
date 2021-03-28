package com.zero.turist.service;

import com.zero.turist.data.Region;
import com.zero.turist.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionService {

    @Autowired
    private RegionRepository regionRepository;

    public Optional<Region> getRegionById(int id){
        return regionRepository.findById(id);
    }

    public Optional<Region> getRegionByName(String name){
        return regionRepository.findByRegionName(name);
    }

    public List<Region> getAllRegion() {return (List<Region>) regionRepository.findAll();}

    public void saveRegion(Region region) {
                regionRepository.save(region);
    }

    public void deleteRegion(int id){
        regionRepository.deleteById(id);
    }

    public void deleteAll(){ regionRepository.deleteAll();}
}
