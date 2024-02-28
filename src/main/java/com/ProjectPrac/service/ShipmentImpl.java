package com.ProjectPrac.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjectPrac.dto.ShipmentDTO;
import com.ProjectPrac.entity.ShipmentEntity;
import com.ProjectPrac.repositary.ShipmentRepo;
@Service
public class ShipmentImpl implements ShipmenttService {
	
	@Autowired
	ShipmentRepo shipmentRepo;

	@Override
	public ShipmentDTO getShipmentNumber(int id) {
		ShipmentDTO shipmentDTO = null;
		Optional<ShipmentEntity> shipmentEntity =   shipmentRepo.findById(id);
		
		if(shipmentEntity.isPresent()) {
			ShipmentEntity shipmentEntityGet = shipmentEntity.get();
			shipmentDTO =  new ShipmentDTO(shipmentEntityGet);
		}else {
			System.out.println("Data not present in Entity classs:");
		}	
		return shipmentDTO;
	}

	@Override
	public ShipmentEntity postData(ShipmentDTO shipmentDTO) {
		ShipmentEntity shipmentEntity = new ShipmentEntity();
		shipmentEntity.setShipmentId(shipmentDTO.getShipmentId());
		shipmentEntity.setUserFirstName(shipmentDTO.getUserFirstName());
		shipmentEntity.setUserSecondName(shipmentDTO.getUserSecondName());
		shipmentEntity.setUserMail(shipmentDTO.getUserMail());
		return shipmentRepo.save(shipmentEntity);
	}
}
