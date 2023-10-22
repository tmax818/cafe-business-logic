package co.tylermaxwell;

import java.util.ArrayList;

public class CafeUtil {


    public int getStreakGoal(){
        int sum = 0;
        for(int i = 0; i <= 10; i++){
            sum += i;
        }
        return sum;
    }

    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for(int i = 0; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double sum = 0;
        for(double price : prices) sum += price;
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){

    }

    public void addCustomer(ArrayList<String> customers){

    }
}
