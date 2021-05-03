package myDiary;

import java.util.Map;

public class Diary {
    private Entry[] entries;
    private int noOfEntries;

    public Diary(int numberOfEntries){
        entries = new Entry[numberOfEntries];
    }

    public int getNumberOfDiaryEntries() {
        return entries.length;
    }

    public Entry[] getEntries() {
        return entries;
    }

    public void addNewEntry(Entry entry){
        entries[noOfEntries] = entry;
        if(entries.length > noOfEntries){
            entries[noOfEntries] = entry;
            noOfEntries++;
        }
    }
}
