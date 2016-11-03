# Builder Pattern
# Creational 

```java

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


```

### Sample Output

```
------------------------------
Veg Meal
Item: Veggi Burger
Packing: Wrapper!!
Price: 1.5

Item: Super Cola
Packing: Bottle!!
Price: 1.0

Total Cost: 2.5
------------------------------
------------------------------
Non Veg Meal
------------------------------
Item: Chicken Burger
Packing: Wrapper!!
Price: 2.0

Item: Cold One!!
Packing: Bottle!!
Price: 5.0

Item: Big Orange!!
Packing: Bottle!!
Price: 1.0

Item: Royal with Cheese
Packing: Wrapper!!
Price: 2.5

Total Cost: 10.5

```

