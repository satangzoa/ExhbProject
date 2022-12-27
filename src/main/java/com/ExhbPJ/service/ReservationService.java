package com.ExhbPJ.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ExhbPJ.dto.ReservationDto;
import com.ExhbPJ.entity.Reservation;
import com.ExhbPJ.repository.ReservationRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReservationService {
	private final ReservationRepository ReservationRepository;
	
	public List<Reservation> getList(){
		List<Reservation> reservations = ReservationRepository.findAll();
		
		List<ReservationDto> reservationsDtos = new ArrayList<ReservationDto>();
		
		return reservations;
	}
}
