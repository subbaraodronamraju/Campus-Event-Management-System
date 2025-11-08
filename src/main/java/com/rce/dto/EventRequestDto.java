package com.rce.dto;
import java.sql.Date;
import java.sql.Time;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventRequestDto {
	
	
	private String eventTitle;
	
	private String eventDescription;
	
	private Date eventDate;

    private Time eventTime;

    private String eventLocation;

    private String eventStatus;
    
    private Long categoryId;
    
    private Long createdById;

   
    

}
