package Layer;

import Neuron.HiddenNeuron;

public class HiddenLayer extends Layer{
	public HiddenLayer(int neuronQuantity) {
		super();
		System.out.println("Creating hidden layer");
		for(int neuronNumber = 0; neuronNumber < neuronQuantity; neuronNumber++) {
			this.neurons.add(new HiddenNeuron());
		}
	}
}
