package Neuron;

import java.util.LinkedList;
import java.util.Random;

public class OutputNeuron extends Neuron{
	public OutputNeuron(int weightsQuantity) {
		super();
		System.out.println("Creating output neuron");
		weights = new LinkedList<Double>();
		Random r = new Random();
		for(int weightNumber = 0; weightNumber < weightsQuantity; weightNumber++) {
			weights.add(-1 + (1 + 1)*r.nextDouble());
			System.out.println("" + weights.get(weightNumber));
		}
	}

	@Override
	public void CountOutputValue(LinkedList<Double> previousOutputs) {
		// TODO Auto-generated method stub
		for(int previousOutputNumber = 0; previousOutputNumber < previousOutputs.size(); previousOutputNumber++) {
			System.out.println("" + weights.get(previousOutputNumber)*previousOutputs.get(previousOutputNumber));
			neuronOutputValue += weights.get(previousOutputNumber)*previousOutputs.get(previousOutputNumber);
		}
		System.out.println("Output neuron output value = " + neuronOutputValue);
		
	}
}
