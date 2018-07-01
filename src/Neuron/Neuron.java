package Neuron;

import java.util.LinkedList;

public abstract class Neuron {
	protected double neuronOutputValue;
	protected LinkedList<Double> weights;
	public Neuron() {
		
	}
	public void SetOutputValue(double outputValue) {
		neuronOutputValue = outputValue;
	}
	public double GetOutputValue() {
		return neuronOutputValue;
	}
	public abstract void CountOutputValue();
}
