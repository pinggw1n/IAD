package Layer;

import java.util.LinkedList;

import Neuron.Bias;
import Neuron.HiddenNeuron;

public class HiddenLayer extends Layer{
	public HiddenLayer(int neuronQuantity, boolean bias, int previousLayerNeurons) {
		super();
		System.out.println("Creating hidden layer");
		for(int neuronNumber = 0; neuronNumber < neuronQuantity; neuronNumber++) {
			this.neurons.add(new HiddenNeuron(previousLayerNeurons));
		}
		if(bias == true) {
			this.neurons.add(new Bias());
		}
	}
	public void loadInputValues(LinkedList<Double> inputValues) {
		System.out.println("values are loaded in inputLayer");
	}
}
