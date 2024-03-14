package com.ironhack.demo.model;

import com.ironhack.demo.enums.Status;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Status status;
    private LocalDate renewalDate;
    @ManyToOne
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(LocalDate renewalDate) {
        this.renewalDate = renewalDate;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }

    //HashCode and equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return id == member.id && Objects.equals(name, member.name) && status == member.status && Objects.equals(renewalDate, member.renewalDate) && Objects.equals(chapter, member.chapter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, renewalDate, chapter);
    }

    //toString
    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", renewalDate=" + renewalDate +
                ", chapter=" + chapter +
                '}';
    }
}