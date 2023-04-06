package com.company.nutrition;

import java.util.ArrayList;
import java.util.List;

public class NutritionClass {
    abstract static class Food {
        double proteins;
        double fats;
        double carbs;
        double tastyScore;

        public Food(double proteins, double fats, double carbs, double tastyScore) {
            this.proteins = proteins;
            this.fats = fats;
            this.carbs = carbs;
            this.tastyScore = tastyScore;
        }

        public abstract void getMacroNutrients();

        public double getProteins() {
            return proteins;
        }

        public void setProteins(double proteins) {
            this.proteins = proteins;
        }

        public double getFats() {
            return fats;
        }

        public void setFats(double fats) {
            this.fats = fats;
        }

        public double getCarbs() {
            return carbs;
        }

        public void setCarbs(double carbs) {
            this.carbs = carbs;
        }

        public double getTaste() {
            return tastyScore;
        }

        public void setTastyScore(double tastyScore) {
            this.tastyScore = tastyScore;
        }
    }

    class Egg extends Food {
        private String type = "Non-vegetarian";

        public Egg(double proteins, double fats, double carbs, double tastyScore) {
            super(proteins, fats, carbs, tastyScore);
        }

        public Egg(double proteins, double fats, double carbs) {
            super(proteins, fats, carbs, 7.0);
        }

        @Override
        public void getMacroNutrients() {
            System.out.println("An egg has " + this.getProteins() + "gms of proteins, " + this.getFats() + "gms of fats, " + this.getCarbs() + "gms of carbohydrates.");
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    class Bread extends Food {
        String type = "vegetarian";
        public Bread(double proteins, double fats, double carbs, double tastyScore) {
            super(proteins, fats, carbs, tastyScore);
        }

        public Bread(double proteins, double fats, double carbs) {
            super(proteins, fats, carbs, 8.0);
        }

        @Override
        public void getMacroNutrients() {
            System.out.println("A slice of bread has " + this.getProteins() + "" +
                    "gms of protein, " + this.getFats() + "gms of fats and "
                    + this.getCarbs() + "gms of carbohydrates.");
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
