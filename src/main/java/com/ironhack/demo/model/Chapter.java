package com.ironhack.demo.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String district;
    @OneToOne(mappedBy = "presidentChapter")
    private Member president;
    @OneToMany(mappedBy = "chapter")
    private List<Member> members;

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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    //HashCode and equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chapter chapter = (Chapter) o;
        return id == chapter.id && Objects.equals(name, chapter.name) && Objects.equals(district, chapter.district) && Objects.equals(president, chapter.president) && Objects.equals(members, chapter.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, district, president, members);
    }

    //toString
    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", district='" + district + '\'' +
                ", president=" + president +
                ", members=" + members +
                '}';
    }
}