package com.ExhbPJ.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ExhbPJ.entity.Reservation;

public interface ReservationRepository  extends JpaRepository<Reservation, String>{

}
