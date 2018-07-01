package Layer;

import Neuron.Bias;
import Neuron.InputNeuron;

public class InputLayer extends Layer{
	public InputLayer(int neuronQuantity, boolean bias) {
		System.out.println("Creating input layer");
		for(int neuronNumber = 0; neuronNumber < neuronQuantity; neuronNumber++) {
			this.neurons.add(new InputNeuron());
		}
		if(bias == true) {
			this.neurons.add(new Bias());
		}
	}
}
