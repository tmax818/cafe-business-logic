package co.tylermaxwell;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CafeUtilTest {

    CafeUtil cu;

    @BeforeEach
    void setUp() {
        cu = new CafeUtil();
    }

    @Test
    void getStreakGoalTest() {
        assertEquals(cu.getStreakGoal(), 55);
    }

    @Test
    void getStreakGoalTestWithParameter() {
        assertEquals(cu.getStreakGoal(10), 55);
    }

    @Test
    void getOrderTotalTest() {
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        assertEquals(cu.getOrderTotal(lineItems), 13.5);
    }

    @Test
    void displayMenuTest() {
        String message = """
                0 drip coffee
                1 cappuccino
                2 latte
                3 mocha""";
         ArrayList<String> menu = new ArrayList<String>();
         menu.add("drip coffee");
         menu.add("cappuccino");
         menu.add("latte");
         menu.add("mocha");
    }

    @Test
    void addCustomerTest() {
    }
}