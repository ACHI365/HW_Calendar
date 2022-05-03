package fop.w7cal;

public class RepeatEvent extends InfiniteRepeatEvent{
    private int end;

    public RepeatEvent(int day, String description, String place,int period, int end) {
        super(day, description, place, period);
        this.end = end;
    }

    public int getEnd() {
        return end;
    }

    public int diff(int day){
        if (day <= end){
           return super.diff(day);
        }else {
            return end - day;
        }
    }
}
