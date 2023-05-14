package com.codeline.sampleProject.Service;

import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.Models.Manager;
import com.codeline.sampleProject.Repository.AccountRepository;
import com.codeline.sampleProject.Repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ManagerService {

    public List<Manager> getManager()
    {
        return managerRepository.findAll();
    }

    @Autowired
    ManagerRepository managerRepository;

    public void saveManager(Manager manager)

    {
        managerRepository.save(manager);
    }


}

