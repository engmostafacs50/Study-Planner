package com.mostafa.studyplanner;

import com.mostafa.studyplanner.model.Subject;
import com.mostafa.studyplanner.model.StudySession;

public class Main {

    public static void main(String[] args) {

        // Create Subject
        Subject math = new Subject(1, "Mathematics");

        // Create Study Sessions
        StudySession session1 = new StudySession("2026-02-25", 2.0, "Limits");
        StudySession session2 = new StudySession("2026-02-26", 1.5, "Derivatives");

        // Add sessions to subject
        math.addSession(session1);
        math.addSession(session2);

        // Print summary
        math.printSummary();
    }
}