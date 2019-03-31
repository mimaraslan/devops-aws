package com.mimaraslan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mimaraslan.model.entity.Data;

//Detail - DataModel
@Repository
public interface DataRepository extends JpaRepository<Data, Long> {

}