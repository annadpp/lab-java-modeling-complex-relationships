package com.ironhack.demo.repository;

import com.ironhack.demo.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Integer> {
}
