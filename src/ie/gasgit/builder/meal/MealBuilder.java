package ie.gasgit.builder.meal;


import ie.gasgit.builder.Items.*;

/**
 * Created by glen on 04/08/16.
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Cola());

        return meal;
    }

    public Meal prepareNonVegMeal(){

        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Beer());
        meal.addItem(new Orange());
        meal.addItem(new QuarterPounder());

        return meal;
    }

}
