package net.EngineeringDigest.E_Digest.controller;

import net.EngineeringDigest.E_Digest.Entity.JournalEntry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/priv")
public class EntryController {
    public Map <Long,JournalEntry> journalEntryMap= new HashMap<>();
    @GetMapping("/abc")
    public List <JournalEntry> getall() {
        return new ArrayList<>(journalEntryMap.values());
    }
    @PostMapping
    public void CreateEntry() {

    }
}
