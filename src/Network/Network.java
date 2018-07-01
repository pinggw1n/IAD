package Network;

import java.util.LinkedList;

import Layer.HiddenLayer;
import Layer.InputLayer;
import Layer.Layer;
import Layer.OutputLayer;

public class Network {
	private int layerQuantity;
	private LinkedList<Layer> layers;
	private boolean bias;
	
	
	public Network(LinkedList<Integer> topology, boolean bias) {
		this.bias = bias;
		layerQuantity = topology.size();
		layers = new LinkedList<Layer>();
		//creating input layer and its neurons
		layers.add(new InputLayer(topology.getFirst(), bias));
		//creating hidden layer and its neurons
		for(int layerNumber = 1; layerNumber < layerQuantity - 1; layerNumber++) {
			layers.add(new HiddenLayer(topology.get(layerNumber), bias, layers.get(layerNumber - 1).GetNeuronNumber()));
		}
		//creating output layer and its neurons
		layers.add(new OutputLayer(topology.getLast(), layers.get(layers.size() - 1).GetNeuronNumber()));
	}
	//forward propagation
	//backpropagation
}
