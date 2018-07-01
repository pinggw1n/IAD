package Neuron;

public class InputNeuron extends Neuron{
	public InputNeuron() {
		super();
		System.out.println("Creating input neuron");
	}

	@Override
	public void CountOutputValue() {
		// TODO Auto-generated method stub
		System.out.println("InputNeuron does not count its outputValue");
	}
	
}
