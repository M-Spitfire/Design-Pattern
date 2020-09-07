package com.DesignPattern.mediator;

public class Curtains extends Colleague {

	public Curtains(Mediator mediator, String name) {
		super(mediator, name);
		mediator.addColleague(name, this);
	}

	@Override
	public void sendMessage(int stateChange) {
		this.getMediator().getMessage(stateChange, getName());
	}

	public void UpCurtains() {
		System.out.println("I am holding Up Curtains!");
	}

}
