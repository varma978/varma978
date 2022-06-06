package com.skill.collectionframeworkk;

public class FruitsTreeSett  {

	private String fruitName;
	private Double weight;
	private Integer price;
	public FruitsTreeSett(String fruitName, Double weight, Integer price) {
		super();
		this.fruitName = fruitName;
		this.weight = weight;
		this.price = price;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
