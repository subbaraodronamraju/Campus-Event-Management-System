package com.rce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rce.models.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

}
