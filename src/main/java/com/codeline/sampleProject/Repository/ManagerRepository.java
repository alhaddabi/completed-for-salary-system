package com.codeline.sampleProject.Repository;

import com.codeline.sampleProject.Models.Account;
import com.codeline.sampleProject.Models.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer> {

    @Query("SELECT a FROM Manager a WHERE a.teamName=:teamName")
    Manager getManagerByTeamName(@Param("teamName") String teamNa);

}
