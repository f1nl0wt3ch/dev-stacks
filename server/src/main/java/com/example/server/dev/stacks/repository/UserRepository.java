package com.example.server.dev.stacks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.server.dev.stacks.bean.UserBean;

@Repository
public interface UserRepository extends JpaRepository<UserBean, Long>{
    public UserBean findByIdAndInactive(long id, boolean inactive);
    public List<UserBean> findByInactive(boolean inactive);
}
