package src.tests.java.ru.levelp.at.homework2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.levelp.at.HW2.HappyTicket;

import static org.testng.Assert.assertEquals;

public class HomeWork2Tests {
    private HappyTicket happyTicket;
    @BeforeClass(groups = {"positive", "negative"})
    public void beforeClass() {
        happyTicket = new HappyTicket();
    }

    @Test(groups = {"positive"}, dataProvider = "luckyTicketDataProvider",
            dataProviderClass = HomeWork2DataProvider.class)
    public void testLuckyTicket(Integer number) {
        assertEquals(HappyTicket.isMyTicketLucky(number), true,
                "Ошибка проверки на счастливый билет");
    }

    @Test(groups = {"negative"}, dataProvider = "notLuckyTicketDataProvider",
            dataProviderClass = HomeWork2DataProvider.class)
    public void testNotLuckyTicket(Integer number) {
        assertEquals(HappyTicket.isMyTicketLucky(number), false,
                "Ошибка проверки на не счастливый билет");
    }

    @Test(groups = {"negative"}, dataProvider = "sizeNumberDataProvider",
            dataProviderClass = HomeWork2DataProvider.class, expectedExceptions = {IllegalArgumentException.class})
    public void testSizeNumber(Integer number) {
        HappyTicket.isMyTicketLucky(number);
    }

}
