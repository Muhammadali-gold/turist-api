package com.zero.turist.service;

import com.zero.turist.data.Company;
import com.zero.turist.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Optional<Company> getCompanyById(int id){
        return companyRepository.findById(id);
    }

    public List<Company> getAllCompany(){ return companyRepository.findAll();}

    public Optional<Company> getCompanyByName(String name){
        return companyRepository.findOneByCompanyName(name);
    }

    public List<Company> getCompaniesByRegion(int regionId) {
        return companyRepository.findAllByRegion(regionId);
    }

    public List<Company> getCompaniesByCompanyType(int companyType){
        return companyRepository.findAllByCompanyType(companyType);
    }

    public Optional<Company> getCompanyByLatLong(double lat, double longi){
        return companyRepository.findOneByLatitudeAndLongitude(longi,lat);
    }

    public void saveCompany(Company company){
        companyRepository.save(company);
    }

    public void deleteCompany(int id){
        companyRepository.deleteById(id);
    }

    public void deleteAll(){ companyRepository.deleteAll();}
}
