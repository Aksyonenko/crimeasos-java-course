package com.crimeasos.java.course.fourth.cocktailmaker;

/**
 * Created by Паша on 07.12.2015.
 */
public class MilkCocktailMaker implements CocktailMakerModule {

    @Override
    public void makeCocktail() {
        System.out.println("Milk cocktail is ready");
    }
}
