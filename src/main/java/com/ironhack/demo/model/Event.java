package com.ironhack.demo.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int duration;
    private String location;
    private String title;
    @ManyToMany
    @JoinTable(
            name = "event_guest",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "guest_id")
    )
    private List<Guest> guests;

    //Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //HashCode and equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id && duration == event.duration && Objects.equals(location, event.location) && Objects.equals(title, event.title) && Objects.equals(guests, event.guests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, duration, location, title, guests);
    }

    //toString
    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", duration=" + duration +
                ", location='" + location + '\'' +
                ", title='" + title + '\'' +
                ", guests=" + guests +
                '}';
    }
}
