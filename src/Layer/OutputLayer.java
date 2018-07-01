package Layer;

import java.util.LinkedList;

import Neuron.OutputNeuron;

public class OutputLayer extends Layer{
	public OutputLayer(int neuronQuantity, int previousLayerNeurons) {
		super();
		System.out.println("Creating output layer");
		for(int neuronNumber = 0; neuronNumber < neuronQuantity; neuronNumber++) {
			this.neurons.add(new OutputNeuron(previousLayerNeurons));
		}
	}
	public void loadInputValues(LinkedList<Double> inputValues) {
		System.out.println("values are loaded in inputLayer");
	}
	@Override
	public void forwardPropagation(Layer previousLayer) {
		// TODO Auto-generated method stub
		
	}
}
