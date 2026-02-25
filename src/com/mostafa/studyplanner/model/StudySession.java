package com.mostafa.studyplanner.model;
public class StudySession{
    private String date ;
    private double durationHours ; 
    private String topic ; 

    public StudySession(String date , double durationHours , String topic)
    {
        this.date = date ; 
        this.durationHours = durationHours ; 
        this.topic = topic ; 
    }

    public double getDurationHours()
    {
        return durationHours ; 
    }
    public String getTopic()
    {
        return topic ; 
    }
    public String getDate()
    {
        return date ; 
    }
    
    public void printSession() {
    System.out.println("Date: " + date);
    System.out.println("Topic: " + topic);
    System.out.println("Duration: " + durationHours + " hours");
}
}