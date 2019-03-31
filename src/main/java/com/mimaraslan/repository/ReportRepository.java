package com.mimaraslan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mimaraslan.model.entity.Report;

//Master - ReportModel
@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {
}