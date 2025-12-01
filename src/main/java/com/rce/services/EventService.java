package com.rce.services;

import com.rce.dto.EventRequestDto;
import com.rce.dto.EventResponseDto;

public interface EventService {

	EventResponseDto registerEvent(EventRequestDto eventRequestDto);

	EventResponseDto getEventById(long id);

	
	
	

}
