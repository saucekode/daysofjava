package myDiary;

import java.time.LocalDateTime;

public class Entry {
    private String title;
    private String entryBody;
    private LocalDateTime entryTime;

    public Entry(String title) {
        this.title = title;
        entryTime = LocalDateTime.now();
    }

    public void setEntryTitle(String newTitle) {
        title = newTitle;
    }

    public String getEntryTitle(){
        return title;
    }

    public LocalDateTime getEntryDateAndTime() {
        return entryTime;
    }

    public void setEntryBody(String newEntry) {
        entryBody = newEntry;
    }

    public String getEntryBody() {
        return entryBody;
    }

    public String viewEntry() {
        return toString();
    }

    @Override
    public String toString(){
        return ("Title: " + getEntryTitle() + "\n"
                + "Entry Date: " + getEntryDateAndTime().toLocalDate() + "\n"
                + "Entry Body: " + getEntryBody()
        );
    }
}
