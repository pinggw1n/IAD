package Layer;

import java.util.LinkedList;

import Neuron.Neuron;

public abstract class Layer {
	protected LinkedList<Neuron> neurons;
	public int GetNeuronNumber() {
		return neurons.size();
	}
	public Layer() {
		neurons = new LinkedList<Neuron>();
	}
	public abstract void loadInputValues(LinkedList<Double> inputValues);
	public abstract void forwardPropagation(Layer previousLayer);
}
