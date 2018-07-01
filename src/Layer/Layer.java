package Layer;

import java.util.LinkedList;

import Neuron.Neuron;

public class Layer {
	protected LinkedList<Neuron> neurons;
	public int GetNeuronNumber() {
		return neurons.size();
	}
	public Layer() {
		neurons = new LinkedList<Neuron>();
	}
}
