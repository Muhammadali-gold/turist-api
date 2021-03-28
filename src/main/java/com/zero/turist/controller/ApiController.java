package com.zero.turist.controller;


import com.zero.turist.Status;
import com.zero.turist.data.Company;
import com.zero.turist.data.Region;
import com.zero.turist.data.Service;
import com.zero.turist.service.CompanyService;
import com.zero.turist.service.RegionService;
import com.zero.turist.service.ServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping(path = "/api")
public class ApiController {


    @Autowired
    private CompanyService companyService;

    @Autowired
    private RegionService regionService;

    @Autowired
    private ServiceManager serviceManager;


    @GetMapping("/company/id/{id}")
    public Company getCompanyById(@PathVariable int id){
        return companyService.getCompanyById(id).orElse(null);
    }

    @GetMapping("/companies")
    public List<Company> getAllCompany(){
        return companyService.getAllCompany();
    }

    @GetMapping("/regions")
    public List<Region> getAllRegion(){
        return regionService.getAllRegion();
    }

    @GetMapping("/services")
    public List<Service> getAllService(){
        return serviceManager.getAllServices();
    }

    @GetMapping("/all")
    public Map<?, ?> getAllData(){
        Map<String, Object> data = new HashMap<>();
        data.put("companies", companyService.getAllCompany());
        data.put("regions", regionService.getAllRegion());
        data.put("services", serviceManager.getAllServices());
        return data;
    }


    @GetMapping("/region/id/{id}")
    public Region getRegionById(@PathVariable int id){
        return regionService.getRegionById(id).orElse(null);
    }

    @GetMapping("/service/id/{id}")
    public Service getServiceById(@PathVariable int id){
        return serviceManager.getServiceById(id).orElse(null);
    }

    @GetMapping("/company/name/{name}")
    public Company getCompanyByName(@PathVariable String name){
        return companyService.getCompanyByName(name).orElse(null);
    }

    @GetMapping("/region/name/{name}")
    public Region getRegionByName(@PathVariable String name){
        return regionService.getRegionByName(name).orElse(null);
    }

    @GetMapping("/service/name/{name}")
    public Service getServiceByName(@PathVariable String name){
        return serviceManager.getServiceByName(name).orElse(null);
    }

    @PostMapping("/company/save")
    public String addCompany(@Valid @RequestBody Company company ){
        companyService.saveCompany(company);
        return Status.SUCCESSFULLY;
    }

    @PostMapping("/region/save")
    public String addRegion(@Valid @RequestBody Region region){
        regionService.saveRegion(region);
        return Status.SUCCESSFULLY;
    }

    @PostMapping("/service/save")
    public String addService(@Valid @RequestBody Service service){
        serviceManager.saveSevice(service);
        return Status.SUCCESSFULLY;
    }

    @PutMapping("/company/save/{id}")
    public String updateCompany(@PathVariable Long id,@Valid @RequestBody Company company ){
        if (companyService.getCompanyById((Integer.parseInt(String.valueOf(id)))) == null){
            return  "Not found";
        }
        companyService.saveCompany(company);
        return Status.SUCCESSFULLY;
    }

    @PutMapping("/region/save/{id}")
    public String updateRegion(@PathVariable Long id,@Valid @RequestBody Region region){
        if (regionService.getRegionById((Integer.parseInt(String.valueOf(id)))) == null){
            return  "Not found";
        }
        regionService.saveRegion(region);
        return Status.SUCCESSFULLY;
    }

    @PutMapping("/service/save/{id}")
    public String updateService(@PathVariable Long id,@Valid @RequestBody Service service){
        if (serviceManager.getServiceById((Integer.parseInt(String.valueOf(id)))) == null){
            return  "Not found";
        }
        serviceManager.saveSevice(service);
        return Status.SUCCESSFULLY;
    }

    @DeleteMapping("/company/id/{id}")
    public String deleteCompany(@PathVariable int id){
        companyService.deleteCompany(id);
        return Status.SUCCESSFULLY;
    }

    @DeleteMapping("/region/id/{id}")
    public String deleteRegion(@PathVariable int id){
        regionService.deleteRegion(id);
        return Status.SUCCESSFULLY;
    }

    @DeleteMapping("/service/id/{id}")
    public String deleteService(@PathVariable int id){
        serviceManager.deleteService(id);
        return Status.SUCCESSFULLY;
    }

    @DeleteMapping("/all")
    public String deleteAll(){
        serviceManager.deleteAll();
        regionService.deleteAll();
        companyService.deleteAll();
        return "deleted";
    }

}
