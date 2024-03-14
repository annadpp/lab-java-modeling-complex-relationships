package com.ironhack.demo.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int presentationDuration;
    @ManyToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;

    //Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(int presentationDuration) {
        this.presentationDuration = presentationDuration;
    }

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }

    //HashCode and equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speaker speaker = (Speaker) o;
        return id == speaker.id && presentationDuration == speaker.presentationDuration && Objects.equals(name, speaker.name) && Objects.equals(conference, speaker.conference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, presentationDuration, conference);
    }

    //toString
    @Override
    public String toString() {
        return "Speaker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", presentationDuration=" + presentationDuration +
                ", conference=" + conference +
                '}';
    }
}
