StudyPlanner/
└── src/
    └── com/
        └── mostafa/
            └── studyplanner/
                ├── model/
                │   ├── Subject.java          # Represents a subject/course
                │   ├── StudySession.java     # A single study session
                │   └── ReviewItem.java       # Item to review (spaced repetition)
                │
                ├── service/
                │   └── StudyManager.java     # Core business logic
                │       ├── addSubject()
                │       ├── addSession()
                │       ├── getTotalHours()
                │       ├── getWeeklyStats()
                │       └── checkReviews()
                │
                └── Main.java                 # Entry point for testing