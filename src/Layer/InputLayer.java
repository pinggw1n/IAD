package Layer;

import Neuron.InputNeuron;

public class InputLayer extends Layer{
	public InputLayer(int neuronQuantity) {
		super();
		System.out.println("Creating input layer");
		for(int neuronNumber = 0; neuronNumber < neuronQuantity; neuronNumber++) {
			this.neurons.add(new InputNeuron());
		}
	}
}
