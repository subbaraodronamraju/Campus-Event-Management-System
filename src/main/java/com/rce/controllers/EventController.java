package com.rce.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rce.dto.EventRequestDto;
import com.rce.dto.EventResponseDto;
import com.rce.services.EventService;

@RestController
@RequestMapping("/events")
public class EventController {
	private EventService eventService;
	
   public EventController(EventService eventService) {
	   this.eventService=eventService;
	   }
   @PostMapping("/register")
   public EventResponseDto registerEvent(@RequestBody EventRequestDto eventRequestDto){
	   return eventService.registerEvent(eventRequestDto);
	   
   }
   @GetMapping("/getEvent/{id}")
   public EventResponseDto getEventById(@PathVariable(name="id") long id) {
	   return eventService.getEventById(id);
   }
	   
   }
    

