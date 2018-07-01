package Neuron;

import java.util.LinkedList;
import java.util.Random;

public class HiddenNeuron extends Neuron{
	public HiddenNeuron(int weightsQuantity) {
		super();
		System.out.println("Creating hidden neuron");
		//losowanie wag
		weights = new LinkedList<Double>();
		Random r = new Random();
		for(int weightNumber = 0; weightNumber < weightsQuantity; weightNumber++) {
			weights.add(-1 + (1 + 1)*r.nextDouble());
			System.out.println("" + weights.get(weightNumber));
		}
	}
}
