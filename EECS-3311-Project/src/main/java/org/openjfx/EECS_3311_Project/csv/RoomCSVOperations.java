package org.openjfx.EECS_3311_Project.csv;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.openjfx.EECS_3311_Project.DatabaseUtils;
import org.openjfx.EECS_3311_Project.model.Room;

public class RoomCSVOperations extends CSVOperations<Room>{

	@Override
	protected Path getCSVPath() {
		return DatabaseUtils.roomsFilePath;
	}

	@Override
	protected String[] toColumns(Room room) {
	    return new String[] {
	        safe(room.getId()),
	        safe(room.getRoomName()),
	        safe(Boolean.toString(room.isActive())),
	        safe(Integer.toString(room.getCapacity())),
	        safe(room.getBuildingName())
	    };
	}

	@Override
	protected List<Room> parseLines(List<String> lines) {
		List<Room> rooms = new ArrayList<Room>();
		for(String l : lines) {
			rooms.add(new Room(l));
		}
		return rooms;
	}


}
