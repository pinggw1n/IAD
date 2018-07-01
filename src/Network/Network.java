package Network;

import java.util.LinkedList;

import Layer.HiddenLayer;
import Layer.InputLayer;
import Layer.Layer;
import Layer.OutputLayer;

public class Network {
	private int layerQuantity;
	private LinkedList<Layer> layers;
	
	public Network(LinkedList<Integer> topology) {
		layerQuantity = topology.size();
		layers = new LinkedList<Layer>();
		//creating input layer and its neurons
		layers.add(new InputLayer(topology.getFirst()));
		//creating hidden layer and its neurons
		for(int layerNumber = 1; layerNumber < layerQuantity - 1; layerNumber++) {
			layers.add(new HiddenLayer(topology.get(layerNumber)));
		}
		//creating output layer and its neurons
		layers.add(new OutputLayer(topology.getLast()));
	}
}
