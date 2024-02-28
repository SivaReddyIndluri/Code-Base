package com.ProjectPrac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ProjectPrac.dto.ShipmentDTO;
import com.ProjectPrac.entity.ShipmentEntity;
import com.ProjectPrac.service.ShipmentImpl;

@RestController
public class ShipmentController {
	
	@Autowired
	ShipmentImpl shipmentImpl;
	
	@GetMapping("/shipment/{id}")
	public ShipmentDTO m1( @PathVariable int id) {
		return shipmentImpl.getShipmentNumber(id);	
	}
	@PostMapping()
	public ShipmentEntity m2(@RequestBody ShipmentDTO shipmentDTO) {
		return shipmentImpl.postData(shipmentDTO);
	}
}
