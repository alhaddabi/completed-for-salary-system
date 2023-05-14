package com.codeline.sampleProject.Controller;

import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.Models.Manager;
import com.codeline.sampleProject.Repository.ManagerRepository;
import com.codeline.sampleProject.Service.AccountService;
import com.codeline.sampleProject.Service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class MangerController {

    @Autowired
    ManagerService managerservice;

    @RequestMapping("manager/create")
    public void saveManager()
    {
        createManager();
    }

    @RequestMapping("manager/get")
    public List<Manager> getmanager ()
    {
        return managerservice.getManager();
    }

    public void createManager()
    {
        Manager manager = new Manager();
        manager.setCreatedDate(new Date());
        manager.setTeamName("TechMahindra");
        manager.setDepartment("Tech-IT_Department");
        manager.setIsActive(true);
        managerservice.saveManager(manager);
    }
}
