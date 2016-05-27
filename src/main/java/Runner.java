import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Runner {
    public static void main(String[] args) {

        TimeShow showTime = new TimeShow();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int hour = calendar.get(Calendar.HOUR_OF_DAY);


        System.out.println(showTime.getTime(hour));


        String locale = String.valueOf(Locale.getDefault());
        System.out.println(showTime.getLocal(locale));

       // Message resource
        ResourceBundle bundle1 = ResourceBundle.getBundle("TestBundle");
        displayValues(bundle1);

        Locale defaultLocale = Locale.getDefault();
        ResourceBundle bundle2 = ResourceBundle.getBundle("TestBundle", defaultLocale);
        displayValues(bundle2);

        Locale russianLocale = new Locale("ru", "RU");
        ResourceBundle bundle3 = ResourceBundle.getBundle("TestBundle", russianLocale);
        displayValues(bundle3);

        Locale nonexistentLocale = new Locale("en", "EN");
        ResourceBundle bundle4 = ResourceBundle.getBundle("TestBundle", nonexistentLocale);
        displayValues(bundle4);

    }

    public static void displayValues(ResourceBundle bundle) {
        System.out.println("Info message:" + bundle.getString("local"));

        System.out.println();
    }

}


