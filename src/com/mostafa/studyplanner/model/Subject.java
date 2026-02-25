package com.mostafa.studyplanner.model;
import java.util.ArrayList;
import java.util.List;
public class Subject {
    private int id ; 
    private String name ; 
    private double totalHoursStudied;
    private List<StudySession>sessions ; 
    public Subject(int id , String name)
    {
        this.id = id ; 
        this.name = name ; 
        this.totalHoursStudied = 0.0 ; 
        this.sessions = new ArrayList<>() ; 
    }
    public int getId()
    {
        return id ; 
    }
    public String getName()
    {
        return name ; 
    }
    public double getTotalHoursStudied()
    {
        return totalHoursStudied ; 
    }
    public void addSession(StudySession session)
    {
         sessions.add(session);
        totalHoursStudied += session.getDurationHours();
    }
    public void printSummary() 
    {
        System.out.println("Subject: " + name);
        System.out.println("Total Hours Studied: " + totalHoursStudied);
        System.out.println("Number of Sessions: " + sessions.size());
    }
}
