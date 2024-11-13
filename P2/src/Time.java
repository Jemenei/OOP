public class Time {
    private int hour, minute, second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("Invalid time.");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int h = (hour == 0 || hour == 12) ? 12 : hour % 12;
        return String.format("%02d:%02d:%02d %s", h, minute, second, hour < 12 ? "AM" : "PM");
    }

    public void add(Time t) {
        int totalSeconds = toSeconds() + t.toSeconds();
        setTime((totalSeconds / 3600) % 24, (totalSeconds / 60) % 60, totalSeconds % 60);
    }

    public static Time add(Time t1, Time t2) {
        Time result = new Time(0, 0, 0);
        result.add(t1);
        result.add(t2);
        return result;
    }

    private int toSeconds() {
        return hour * 3600 + minute * 60 + second;
    }

    public static void main(String[] args) {
        Time t1 = new Time(23, 5, 6);
        System.out.println(t1.toUniversal());
        System.out.println(t1.toStandard());

        Time t2 = new Time(4, 24, 33);
        t1.add(t2);
        System.out.println(t1.toUniversal());
        System.out.println(t1.toStandard());

        Time t3 = Time.add(new Time(22, 45, 50), new Time(2, 15, 30));
        System.out.println(t3.toUniversal());
        System.out.println(t3.toStandard());
    }
}
