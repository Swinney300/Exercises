/*

(The Time class) 

Design a class named Time.

The class contains:

- The data fields hour, minute, and second that represent a time.

- A no-arg constructor that creates a Time object for the current time. (The values of the data fields will represent the current time.)

- A constructor that constructs a Time object with a specified elapsed time since midnight, January 1, 1970, in milliseconds. 
(The values of the data fields will represent this time.)

- A constructor that constructs a Time object with the specified hour, minute, and second.

- Three getter methods for the data fields hour, minute, and second, respectively.

- A method named 
setTime(long elapseTime)
that sets a new time for the object using the elapsed time. For example, if the elapsed time is 555550000 milliseconds, the hour is 10, 
the minute is 19, and the second is 10.

Draw the UML diagram for the class and then implement the class.

Write a test program that creates two Timeobjects (using new Time(), new Time(555550000), and new Time(5, 23, 55))and displays their hour, 
minute, and second in the format hour:minute:second.(Hint: The first two constructors will extract the hour, minute, and second from the elapsed 
time. For the no-arg constructor, the current time can be obtained using System.currentTimeMillis(), as shown in LiveExample 2.7, ShowCurrentTime.java.)

 */
public class Exercise10_01 {
    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.println("h:m:s from current time is " + time1.getHour() + ":" +
                time1.getMinute() + ":" + time1.getSecond());

        Time time2 = new Time(555550000);
        System.out.println("h:m:s from the second constructor is " + time2.getHour() + ":" +
                time2.getMinute() + ":" + time2.getSecond());

        Time time3 = new Time(5, 23, 55);
        System.out.println("h:m:s from the third constructor is " + time3.getHour() + ":" +
                time3.getMinute() + ":" + time3.getSecond());
    }

    public static class Time {
        private long hour = (System.currentTimeMillis() / (1000 * 60 * 60)) % 24;
        private long minute = (System.currentTimeMillis() / (1000 * 60)) % 60;
        private long second = (System.currentTimeMillis() / 1000) % 60;

        public Time() {
            setHour(System.currentTimeMillis());
            setMinute(System.currentTimeMillis());
            setSecond(System.currentTimeMillis());

        }

        public Time(long milliseconds) {
            setHour(milliseconds);
            setMinute(milliseconds);
            setSecond(milliseconds);
        }

        public Time(long hour, long minute, long second) {
            setHour(hour);
            setMinute(minute);
            setSecond(second);
        }

        long getHour() {
            return hour;
        }

        void setHour(Long milliseconds) {
            this.minute = (milliseconds / (1000 * 60)) % 60;
        }

        long getMinute() {
            return minute;
        }

        void setMinute(Long milliseconds) {
            this.minute = (milliseconds / (1000 * 60 * 60)) % 24;
        }

        long getSecond() {
            return second;
        }

        void setSecond(Long milliseconds) {
            this.minute = (milliseconds / 1000) % 60;
        }
    }
}
