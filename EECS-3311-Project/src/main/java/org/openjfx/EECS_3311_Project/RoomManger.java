package org.openjfx.EECS_3311_Project;

import java.util.ArrayList;

import org.openjfx.EECS_3311_Project.model.Room;
import org.openjfx.EECS_3311_Project.model.User;

public class RoomManger {
	ICSVRepository csvRepository = CSVAdapter.getInstance();



	public ArrayList<Room> getAllRooms() {
		// TODO Auto-generated method stub
		return csvRepository.getAllRooms();
	}

}
