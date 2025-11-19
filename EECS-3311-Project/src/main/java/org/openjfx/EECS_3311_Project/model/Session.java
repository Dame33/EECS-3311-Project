package org.openjfx.EECS_3311_Project.model;

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
    private User user;
    private Page currentPage;
    
    public Session() {
        this.user = null;
        this.currentPage = Page.HOME;
    }

    public Session(User user, Page currentPage) {
        this.user = user;
        this.currentPage = currentPage;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Page getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Page currentPage) {
        this.currentPage = currentPage;
    }
}
