
import java.util.Locale;


public class TimeShow {
    public TimeShow() {
    }

    public String getTime(Integer hour) {
        String hello;

        if (hour >= 6 && hour < 9) {
            hello = "Good morning";
        } else if (hour >= 9 && hour < 19) {
            hello = "Good day";
        } else if (hour >= 19 && hour < 23) {
            hello = "Good evening";
        } else{
            hello = "Good night";
        }


        return hello;
    }


    public String getLocal(String locale){
        String name = "";
        if (locale.equals(String.valueOf(Locale.ENGLISH))) name = "English Local";
        if (locale.equals(String.valueOf(Locale.CHINA))) name = "China Local";
        if (locale.equals("ru_RU")) name = "Rasha local";
        return name;
    }


}
