package org.openjfx.EECS_3311_Project;

import org.openjfx.EECS_3311_Project.model.Booking;
import org.openjfx.EECS_3311_Project.model.User;

enum Page {
    HOME,
    LOGIN,
    DASHBOARD,
    BOOKING,
    PAYMENT,
    CONFIRMATION,
    ERROR
}

public class Session {
    private static User user;
    public static boolean isEditingBooking = false;
    private static Page currentPage = Page.HOME;
    private static Booking editBooking;
    public static User getUser() { return user; }
    public static void setUser(User u) { user = u; }
    
    public static Page getCurrentPage() { return currentPage; }
    public static void setCurrentPage(Page p) { currentPage = p; }

	public static void setEditBooking(Booking booking) {
		Session.editBooking = booking;

	}
	
	public static Booking getEditBooking() {return Session.editBooking;}
}
