public class Course {
    private String code;
    private String title;
    private String description;
    private int capacity;
    private String schedule;
    private int enrolledStudents;

    public Course(String code, String title, String description, int capacity, String schedule) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
        this.enrolledStudents = 0;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getSchedule() {
        return schedule;
    }

    public int getAvailableSlots() {
        return capacity - enrolledStudents;
    }

    public boolean enrollStudent() {
        if (enrolledStudents < capacity) {
            enrolledStudents++;
            return true;
        }
        return false;
    }

    public boolean dropStudent() {
        if (enrolledStudents > 0) {
            enrolledStudents--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Course Code: %s, Title: %s, Description: %s, Schedule: %s, Available Slots: %d",
                code, title, description, schedule, getAvailableSlots());
    }
}
