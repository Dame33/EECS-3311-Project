package org.openjfx.EECS_3311_Project;

import java.util.List;

import org.openjfx.EECS_3311_Project.csv.RoomCSVOperations;
import org.openjfx.EECS_3311_Project.model.Room;

public class RoomManager {
	RoomCSVOperations roomsCSV = new RoomCSVOperations();

	public List<Room> getAllRooms() {
		return roomsCSV.readMany(null); // passing null as the filter will return all rooms with no filter
	}


	public Room upsertRoom(Room room) {
		return roomsCSV.update(room);
	}

	public Room removeRoom(Room room) {
		roomsCSV.delete(room);
		return room;
	}

}
