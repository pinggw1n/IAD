package Layer;

import java.util.LinkedList;

import Neuron.Neuron;

public class Layer {
	protected LinkedList<Neuron> neurons;
	public Layer() {
		neurons = new LinkedList<Neuron>();
	}
}
