package com.amostovaya.pizzarecipes;

public class PizzaRecipeItem {

    private int imageResource;
    private String title;
    private String description;
    private String recipe;

    public PizzaRecipeItem(int imageResource, String title, String description, String recipe) {
        this.imageResource = imageResource;
        this.title = title;
        this.description = description;
        this.recipe = recipe;
    }

    public String getRecipe() {
        return recipe;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
