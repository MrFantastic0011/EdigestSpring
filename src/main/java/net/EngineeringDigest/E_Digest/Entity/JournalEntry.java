package net.EngineeringDigest.E_Digest.Entity;

public class JournalEntry {
    public long getJournalEntryId() {
        return journalEntryId;
    }

    public void setJournalEntryId(long journalEntryId) {
        this.journalEntryId = journalEntryId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    private long journalEntryId;
    private String Title;
    private String Description;
}
