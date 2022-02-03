package Lab;


import java.util.Scanner;

public class Pizza {
    int pizzaSize = 0;
    int numToppings = 0;
    double pizzaPrice = 0;
    double tax = 0;

    public void setSize(int size) {
        pizzaSize = size;
    }

    public void setToppings(int toppings) {
        numToppings = toppings;
    }

    public double getPizzaPrice() {
        return pizzaPrice;
    }


    public void calculateBasePizzaPrice() {
        pizzaPrice = (pizzaSize * 6.5) + (numToppings * 0.65);
    }

    public void addDeliveryFee(int delivery) {
        if(delivery == 1){
            pizzaPrice = pizzaPrice + 5;
        }
        if(delivery == 0){
            pizzaPrice = pizzaPrice + 0;
        }

    }

    public void addPizzaTax(int taxRate) {
         tax = pizzaPrice *  taxRate/100.0;
         pizzaPrice = pizzaPrice + tax;
    }

    public double getPrepTime() {
        double prepTime = (8 * pizzaSize) + (1.5 * numToppings);
        return prepTime; //This line will also be changed.
    }
}
