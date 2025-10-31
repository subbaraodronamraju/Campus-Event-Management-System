package com.rce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rce.models.Events;

@Repository
public interface EventRepository extends JpaRepository<Events, Long> {

}
