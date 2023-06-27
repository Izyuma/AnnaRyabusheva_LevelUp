package src.tests.java.ru.levelp.at.homework2;

import org.testng.annotations.DataProvider;

public class HomeWork2DataProvider {

    @DataProvider(name ="HappyPath")
    public static Object[][] happyTicketDataProvider() {
        return new Object[][]{
                {555555}, {111111}, {126006}, {362542}};

    }

    @DataProvider(name = "notHappyPath")
    public static Object[][] notLuckyTicketDataProvider() {
        return new Object[][] {
                {265894}, {357964}, {325471},{364972}
        };
    }

    @DataProvider(name = "sizeOfNumberNotCorrect")
    public static Object[][] sizeNumberDataProvider() {
        return new Object[][] {
                 {135765138}, {215},{-24682},{-385783871}
        };
    }
}
