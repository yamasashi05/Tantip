public class Time {
    private int hour=0;
    private int minute=0;
    private int second=0;

    /*
     * Default constructor, creates a time object initialized to 00:00:00
     */
    public Time(){}

    //Constructor that initialized the time with specified hour,minute, and second
    public Time(int hour, int minute, int second){
        //this.hour = hour;
        //this.minute = minute;
        //this.hour = hour;
        setTime(hour, minute, second);
    }

    //Getter method
    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond() {
        return second;
    }

    //Setter methods with validation
    public void setHour(int hour){
        if(hour < 0 || hour >=24 ){
            throw new IllegalArgumentException("Hour must be between 0 and 23.");
        }

        this.hour = hour;
    }

    
    public void setMinute(int minute){
        if(minute < 0 || minute >=60){
            throw new IllegalArgumentException("Minute must be between 0 and 59.");
        }

        this.minute = minute;
    }

    public void setSecond(int second){
        if(second < 0 || second >=60){
            throw new IllegalArgumentException("Second must be between 0 and 59.");
        }   

        this.second = second;
    }

    public void setTime(int hour,int minute,int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

    /*
     * Advance the time by one second.
     * Returns the current object to allow for method chaining.
     * Return the current Time object
     */

     public Time nextSecond(){
        this.second++;
        if(this.second==60){
            this.second=0;
            this.minute++;
            if(this.minute==60){
                this.minute=0;
                this.hour++;
                if(this.hour==24){
                    this.hour=0;
                }
            }
        }
        return this;
     }









    
}