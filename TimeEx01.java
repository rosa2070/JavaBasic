class Time {
    private int hour;          // 25
    private int minute;        // 61
    private int second;        // -1

    public int getHour() { return hour;}
    public void setHour(int hour) {
        if (hour < 0 || hour > 23)
            hour = 0;
        this.hour = hour;
    }

    public int getMinute() { return minute; }
    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) 
            minute = 0;
        this.minute = minute;
    }

    public int getSecond() { return second; }
    public void setSecond(int second) {
        if( second < 0 || second > 59) 
            second  = 0;
        this.second = second;
    }

    public String toString() {
        return hour + ":" + minute+ ":" + second;
    }
}
public class TimeEx01 {
    public static void main(String[] args) {
        Time t = new Time();
        t.setHour(25);
        t.setHour(61);
        t.setHour(-1);

        System.out.println(t.toString());
    }
    
}
