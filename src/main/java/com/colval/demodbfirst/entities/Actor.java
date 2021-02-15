package com.colval.demodbfirst.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "actor")
@NoArgsConstructor
@AllArgsConstructor
public class Actor implements Serializable {
    private static final long serialVersionUID = 1;

    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long actorId;

    @Column(name = "first_name")
    @Size(min = 2, max = 50)
    private String firstName;

    @Column(name = "last_name")
    @Size(min = 2, max = 50)
    private String lastName;

    @Column(name = "last_update")
    private java.sql.Timestamp lastUpdate;

    public long getActorId() {
        return this.actorId;
    }

    public void setActorId(long actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public java.sql.Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(java.sql.Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actorId=" + actorId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
