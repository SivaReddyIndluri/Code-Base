package com.ProjectPrac.dto;

import com.ProjectPrac.entity.ShipmentEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ShipmentDTO {
	
	private int shipmentId;
	private String userFirstName;
	private String userSecondName;
	private String userMail;
	
	public ShipmentDTO(ShipmentEntity shipmentEntity ){
		shipmentId = shipmentEntity.getShipmentId();
		userFirstName = shipmentEntity.getUserFirstName();
		userSecondName = shipmentEntity.getUserSecondName();
		userMail = shipmentEntity.getUserMail();
		
	}

	public int getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(int shipmentId) {
		this.shipmentId = shipmentId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserSecondName() {
		return userSecondName;
	}

	public void setUserSecondName(String userSecondName) {
		this.userSecondName = userSecondName;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	
	

}
