package co.tylermaxwell;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void getOrderTotalTest() {
    }

    @Test
    void displayMenuTest() {
    }

    @Test
    void addCustomerTest() {
    }
}