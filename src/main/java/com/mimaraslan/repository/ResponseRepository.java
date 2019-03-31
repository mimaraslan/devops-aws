package com.mimaraslan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mimaraslan.model.entity.Response;

//Detail - ResponseModel
@Repository
public interface ResponseRepository extends JpaRepository<Response, Long> {

}