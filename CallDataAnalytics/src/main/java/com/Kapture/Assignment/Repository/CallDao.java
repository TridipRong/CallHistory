package com.Kapture.Assignment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Kapture.Assignment.Entity.Calls;
@Repository
public interface CallDao extends JpaRepository<Calls, Integer> {

}
