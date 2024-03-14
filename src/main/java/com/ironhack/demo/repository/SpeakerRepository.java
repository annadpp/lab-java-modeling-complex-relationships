package com.ironhack.demo.repository;

import com.ironhack.demo.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Integer> {
}
