package com.rce.services;

import org.springframework.stereotype.Service;
import com.rce.dto.EventRequestDto;
import com.rce.dto.EventResponseDto;
import com.rce.models.Events;


@Service
public class EvnetServiceImpl implements EventService {

	@Override
	public EventResponseDto registerEvent(EventRequestDto eventRequestDto) {
		Events events = new Events();
	    events.setEventTitle(eventRequestDto.getEventTitle());
	    events.setEventDescription(eventRequestDto.getEventDescription());
	    events.setEventDate(eventRequestDto.getEventDate());
	    events.setEventTime(eventRequestDto.getEventTime());
	    events.setEventLocation(eventRequestDto.getEventLocation());
	    events.setEventStatus(eventRequestDto.getEventStatus());
	    events.setCategory(eventRequestDto.getCategoryId());
	    
		
		return null;
	}

}
