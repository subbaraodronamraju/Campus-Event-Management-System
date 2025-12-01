package com.rce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rce.dao.CategoriesRepository;
import com.rce.dao.EventRepository;
import com.rce.dao.UserRepository;
import com.rce.dto.EventRequestDto;
import com.rce.dto.EventResponseDto;
import com.rce.exceptions.EventNotFoundExeception;
import com.rce.exceptions.IdNotFoundExeception;
import com.rce.exceptions.UserIdNotFoundExeception;
import com.rce.models.Categories;
import com.rce.models.Events;
import com.rce.models.User;


@Service
public class EventServiceImpl implements EventService {
	
	@Autowired
	CategoriesRepository categoriesRepository;
	
	@Autowired
	EventRepository eventRepository;
	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public EventResponseDto registerEvent(EventRequestDto eventRequestDto) {
	Categories category = categoriesRepository.findById(eventRequestDto.getCategoryId())
		                     .orElseThrow(()->new IdNotFoundExeception("Given Id is Not Found"));
		
		
	User user = userRepository.findById(eventRequestDto.getCreatedById())
		              .orElseThrow(()->new UserIdNotFoundExeception("Given Id Name Is Not Found"));
		
	Events events = new Events();
    events.setEventTitle(eventRequestDto.getEventTitle());
    events.setEventDescription(eventRequestDto.getEventDescription());
    events.setEventDate(eventRequestDto.getEventDate());
    events.setEventTime(eventRequestDto.getEventTime());
    events.setEventLocation(eventRequestDto.getEventLocation());
    events.setEventStatus(eventRequestDto.getEventStatus());
    events.setCategory(category);
    events.setCreatedBy(user);
    Events savedEvents = eventRepository.save(events);
    return builderEventResponseDto(savedEvents);
	}
	@Override
	public EventResponseDto getEventById(long id) {
		Events event = eventRepository.findById(id)
		               .orElseThrow(()->new EventNotFoundExeception("Your Given EventId Is Not Found"));
		
		return builderEventResponseDto(event);
	}
	
	
	


	private EventResponseDto builderEventResponseDto(Events savedEvents) {
		EventResponseDto eventResponseDto = new EventResponseDto();
	    eventResponseDto.setEventTitle(savedEvents.getEventTitle());
	    eventResponseDto.setEventDescription(savedEvents.getEventDescription());
	    eventResponseDto.setEventDate(savedEvents.getEventDate());
	    eventResponseDto.setEventTime(savedEvents.getEventTime());
	    eventResponseDto.setEventLocation(savedEvents.getEventLocation());
	    eventResponseDto.setEventStatus(savedEvents.getEventStatus());
	    eventResponseDto.setCategoryName(savedEvents.getCategory().getCategoryName());
	    eventResponseDto.setCreatedByName(savedEvents.getCreatedBy().getUserName());
	    eventResponseDto.setTotalRegistrations(savedEvents.getRegistrations() != null ? savedEvents.getRegistrations().size():0);
	    return eventResponseDto;
	}


}
