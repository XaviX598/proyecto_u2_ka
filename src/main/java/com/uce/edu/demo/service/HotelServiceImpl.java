package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IHotelRepository;
import com.uce.edu.demo.repository.modelo.onetomany.Hotel;

@Service
public class HotelServiceImpl implements IHotelService{
	
	@Autowired
	private IHotelRepository iHotelRepository;
	
//	@Autowired
//	private IHabitacionRepository iHabitacionRepository;
	
	@Override
	public void insertar(Hotel h) {
		this.iHotelRepository.insertar(h);
		}

//	@Override
//	public void insertar(Hotel h) {
//		// TODO Auto-generated method stub
//		List<Habitacion> habitaciones = h.getHabitaciones();
//		h.setHabitaciones(null);
//		this.iHotelRepository.insertar(h);
//		
//		//buscar el hotel
//		String numero = h.getNombre();
//		Hotel hotelBuscado=null;
//		for(Habitacion habiItem: habitaciones) {
//			//Recomendable esta manera cuando necesitemos hacer calculos
//			habiItem.setHotel(hotelBuscado);
//			this.iHabitacionRepository.insertar(habiItem);
//		}
		
	}


