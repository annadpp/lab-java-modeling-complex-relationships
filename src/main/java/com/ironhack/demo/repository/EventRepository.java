package com.ironhack.demo.repository;

import com.ironhack.demo.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
}
