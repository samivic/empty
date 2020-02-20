package com.example.empty.samivic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@org.springframework.stereotype.Service
public interface Service extends JpaRepository<Sami, Long> {

    @Query(value = "SELECT count(*) FROM sami",nativeQuery = true)
    public Long countAll();
}
