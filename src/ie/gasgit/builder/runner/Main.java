package ie.gasgit.builder.runner;


import ie.gasgit.builder.meal.Meal;
import ie.gasgit.builder.meal.MealBuilder;

public class Main {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("------------------------------");

        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        System.out.println("------------------------------");
        System.out.println("------------------------------");

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();

        System.out.println("Non Veg Meal");
        System.out.println("------------------------------");

        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());


    }
}
