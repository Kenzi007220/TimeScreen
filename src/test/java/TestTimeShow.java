import org.junit.Test;

import java.util.Locale;

import static junit.framework.TestCase.assertSame;


public class TestTimeShow {

    @Test
    public void testTime() {
        TimeShow showTime = new TimeShow();
        assertSame("5 hour must be \"Good night\" = ", "Good night",showTime.getTime(5));
        assertSame("6 hour must be \"Good morning\" = ", "Good morning",showTime.getTime(6));
        assertSame("8 hour must be \"Good morning\" = ", "Good morning",showTime.getTime(8));
        assertSame("9 hour must be \"Good day\" = ", "Good day",showTime.getTime(9));
        assertSame("18 hour must be \"Good day\" = ", "Good day",showTime.getTime(18));
        assertSame("19 hour must be \"Good evening\" = ", "Good evening",showTime.getTime(19));
        assertSame("22 hour must be \"Good evening\" = ", "Good evening",showTime.getTime(22));
        assertSame("23 hour must be \"Good night\" = ", "Good night",showTime.getTime(23));
    }

    @Test
    public void testLocal() {
        TimeShow showTime = new TimeShow();
        assertSame("Must be \"English Local\" = ", "English Local",showTime.getLocal(String.valueOf(Locale.ENGLISH)));
        assertSame("Must be \"China Local\" = ", "China Local",showTime.getLocal(String.valueOf(Locale.CHINA)));
        assertSame("Must be \"rasha local\" = ", "Rasha local",showTime.getLocal("ru_RU"));


    }

}
