package com.ironhack.demo.model;

import com.ironhack.demo.enums.GuestStatus;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING)
    private GuestStatus guestStatus;

    //Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GuestStatus getGuestStatus() {
        return guestStatus;
    }

    public void setGuestStatus(GuestStatus guestStatus) {
        this.guestStatus = guestStatus;
    }

    //HashCode and equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return id == guest.id && guestStatus == guest.guestStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, guestStatus);
    }

    //toString
    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", guestStatus=" + guestStatus +
                '}';
    }
}
