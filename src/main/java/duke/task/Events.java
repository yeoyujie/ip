package duke.task;

import java.time.LocalDateTime;

public class Events extends Task {
    protected LocalDateTime duration;

    public Events(String description, LocalDateTime duration) {
        super(description);
        this.duration = duration;
    }
    
    public LocalDateTime getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + duration.format(DATE_TIME_FORMATTER) + ")";
    }
}