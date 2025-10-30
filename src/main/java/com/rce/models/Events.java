package com.rce.models;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "events")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long eventId;

    private String eventTitle;

    private String eventDescription;

    private Date eventDate;

    private Time eventTime;

    private String eventLocation;

    private String eventStatus;

   
    @ManyToOne
    @JoinColumn(name = "category", nullable = false)
    private Categories category;

    @ManyToOne
    @JoinColumn(name = "created_by", nullable = false)
    private User createdBy;

    
    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    private List<Registrations> registrations;

    public Events(String eventTitle, String eventDescription, Date eventDate, Time eventTime, 
                  String eventLocation, String eventStatus, Categories category, 
                  User createdBy, List<Registrations> registrations) {
        this.eventTitle = eventTitle;
        this.eventDescription = eventDescription;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.eventLocation = eventLocation;
        this.eventStatus = eventStatus;
        this.category = category;
        this.createdBy = createdBy;
        this.registrations = registrations;
    }
}
