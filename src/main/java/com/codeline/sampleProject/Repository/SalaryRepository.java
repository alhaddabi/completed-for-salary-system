package com.codeline.sampleProject.Repository;

import com.codeline.sampleProject.Models.Manager;
import com.codeline.sampleProject.Models.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SalaryRepository extends JpaRepository<Salary , Long> {
    @Query("SELECT a FROM Salary a WHERE a.currency=:currency")
    Salary getByCurrencyName(@Param("currency") String teamNa);
}
