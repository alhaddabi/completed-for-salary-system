package com.codeline.sampleProject.Repository;

import com.codeline.sampleProject.Models.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ManagerRepository extends JpaRepository<Manager, Integer> {

}
