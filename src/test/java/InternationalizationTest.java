/**
 * Created by Александр on 06.04.2016.
 */
    import java.util.Locale;
    import java.util.ResourceBundle;

    public class InternationalizationTest {

        public static void main(String[] args) throws Exception {

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
