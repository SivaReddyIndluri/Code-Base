package com.ProjectPrac.service;

import com.ProjectPrac.dto.ShipmentDTO;
import com.ProjectPrac.entity.ShipmentEntity;
public interface ShipmenttService {
	
	ShipmentDTO getShipmentNumber(int id);
	ShipmentEntity postData(ShipmentDTO ShipmentDTO);

}
