package Neuron;

import java.util.LinkedList;

public class InputNeuron extends Neuron{
	public InputNeuron() {
		super();
		System.out.println("Creating input neuron");
	}

	@Override
	public void CountOutputValue(LinkedList<Double> previousOutputs) {
		// TODO Auto-generated method stub
		System.out.println("input neuron does not count output value");
	}
	
}
