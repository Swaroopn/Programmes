package com.interview.algorithms;

class NutritionFact {
	private int servingSize;
	private int servings;
	private int calories, fat, sodium, carbohydrates;
	
	public static class Builder {
		private int servingSize;
		private int servings;
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;
		private int carbohydrates = 0;
		
		public Builder(int servingSize, int servings)
		{
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int calories)
		{
			this.calories = calories;
			return this;
		}
		public Builder fat(int fat)
		{
			this.fat = fat;
			return this;
		}
		public Builder sodium(int sodium)
		{
			this.sodium = sodium;
			return this;
		}
		public Builder carbohydrates(int carbohydrates)
		{
			this.carbohydrates = carbohydrates;
			return this;
		}
		
		public NutritionFact build()
		{
			return new NutritionFact(this);
		}
		
	}
	
	private NutritionFact(Builder builder) {
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
		this.carbohydrates = builder.carbohydrates;
	}
	
}

public class BuilderPatternDemo {
	public static void main(String[] args)
	{
		NutritionFact demo = new NutritionFact.Builder(240, 8).calories(10)
				.fat(20).sodium(15).carbohydrates(22).build();
	}
}