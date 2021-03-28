package com.zero.turist.service;

import com.zero.turist.data.Service;
import com.zero.turist.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class ServiceManager {

    @Autowired
    private ServiceRepository serviceRepository;

    public Optional<Service> getServiceById(int id){
        return serviceRepository.findById(id);
    }

    public Optional<Service> getServiceByName(String name){
        return serviceRepository.findOneByServiceName(name);
    }

    public List<Service> getAllServices(){ return (List<Service>) serviceRepository.findAll();}

    public void saveSevice(Service service) {
        serviceRepository.save(service);
    }

    public void deleteService(int id) {
        serviceRepository.deleteById(id);
    }

    public void deleteAll(){ serviceRepository.deleteAll();}
}
