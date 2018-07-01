package Layer;

import Neuron.OutputNeuron;

public class OutputLayer extends Layer{
	public OutputLayer(int neuronQuantity) {
		super();
		System.out.println("Creating output layer");
		for(int neuronNumber = 0; neuronNumber < neuronQuantity; neuronNumber++) {
			this.neurons.add(new OutputNeuron());
		}
	}
}
