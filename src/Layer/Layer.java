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
	public LinkedList<Double> GetAllOutput(){
		LinkedList<Double> outputList = new LinkedList<Double>();
		for(Neuron n : neurons) {
			outputList.add(n.GetOutputValue());
		}
		return outputList;
	}
	public abstract void forwardPropagation(LinkedList<Double> previousOutputs);
}
