package Neuron;

public class Bias extends Neuron{
	public Bias() {
		super();
		this.neuronOutputValue = 1;
		System.out.println("bias is created");
	}

	@Override
	public void CountOutputValue() {
		// TODO Auto-generated method stub
		System.out.println("bias does not count output value");
	}
}
