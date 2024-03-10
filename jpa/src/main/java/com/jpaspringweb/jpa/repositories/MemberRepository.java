package com.jpaspringweb.jpa.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpaspringweb.jpa.model.Members;

public interface MemberRepository extends CrudRepository<Members,Integer> {
    
    List<Members> findByName(String name);
    List<Members> findByJoinYear(Integer joinYear);
    
}
