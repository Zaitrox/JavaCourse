package javakurs;

public abstract class Time {
    public abstract long getMinutes();

    public long getSeconds() {
        return getMinutes() * 60;
    }
}

class Days extends Time {
    public long days;

    public Days(long days) {
        this.days = days;
    }

    public long getMinutes() {
        return this.days * 24 * 60;
    }
}

class HoursMinutes extends Time {
    private long hours;
    private long minutes;

    public HoursMinutes(long hours, long minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public long getMinutes() {
        return this.hours * 60 + this.minutes;
    }
}
