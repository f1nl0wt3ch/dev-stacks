package com.example.server.dev.stacks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.server.dev.stacks.bean.StackBean;

@Repository
public interface StackRepository extends JpaRepository<StackBean, Integer> {

}
