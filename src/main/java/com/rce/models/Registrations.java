package com.rce.models;

import java.sql.Date;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "registrations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Registrations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long registrationId;

    private Date registrationDate;

    private String registrationStatus;

    
    @ManyToOne
    @JoinColumn(name = "user")
    private User user;

   
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "event")
    private Events event;

    public Registrations(Date registrationDate, String registrationStatus, User user, Events event) {
        this.registrationDate = registrationDate;
        this.registrationStatus = registrationStatus;
        this.user = user;
        this.event = event;
    }
}
