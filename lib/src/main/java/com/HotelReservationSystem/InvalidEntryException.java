package com.HotelReservationSystem;

@SuppressWarnings("serial")
public class InvalidEntryException extends Exception {
	public InvalidEntryException(String message) {
		super(message);
	}
}