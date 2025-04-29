package com.pattern.decorator;

public class ExtraChocolateDecorator implements IcecreamDecorator {
	
	private IcecreamDecorator icecream;
	
	public ExtraChocolateDecorator(IcecreamDecorator icecream) {
		super();
		this.icecream = icecream;
	}

	@Override
	public int price() {
		return icecream.price();
	}

}
