package com.codeline.sampleProject.Controller;

import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.Models.Manager;
import com.codeline.sampleProject.Repository.ManagerRepository;
import com.codeline.sampleProject.RequestObject.getEmployeeRequestObject;
import com.codeline.sampleProject.RequestObject.getManagerRequestObject;
import com.codeline.sampleProject.ResponseObject.GetEmployeeResponse;
import com.codeline.sampleProject.ResponseObject.GetManagerResponse;
import com.codeline.sampleProject.Service.AccountService;
import com.codeline.sampleProject.Service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class MangerController {

    @Autowired
    ManagerService managerservice;

    @RequestMapping("manager/create")
    public void saveManager (@RequestBody getManagerRequestObject managerRequestObject)
    {
        createManager(managerRequestObject);
    }

    @RequestMapping("manager/get")
    public List<Manager> getmanager ()
    {
        return managerservice.getManager();
    }


    @RequestMapping("manager/get/{managerId}")
    public GetManagerResponse createManager (@PathVariable Integer managerId)
    {
        return managerservice.getManagerById(managerId);
    }

    public void createManager(getManagerRequestObject managerRequestObject)
    {
        Manager manager = new Manager();
        manager.setCreatedDate(new Date());
        manager.setTeamName(managerRequestObject.getTeamName());
        manager.setDepartment(managerRequestObject.getDepartment());
        manager.setIsActive(true);
        managerservice.saveManager(manager);
    }
    @RequestMapping(value = "findManagerByTeamName", method = RequestMethod.GET)
    public Manager getManagerByTeamName(@RequestParam String teamName){
        return managerservice.getManagerByTeamName(teamName);
    }
}
