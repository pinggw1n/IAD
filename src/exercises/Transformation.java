package exercises;

import java.util.LinkedList;
import java.util.Scanner;

import Network.Network;

public class Transformation {
	
	public Transformation() {
		LinkedList<Integer> topology = new LinkedList<Integer>();
		boolean bias = true;
		int layerQuantity = 3;
		//amount of neurons on input layer
		topology.add(4);
		//amount of neurons on hidden layer
		for(int layerNumber = 1; layerNumber < layerQuantity - 1; layerNumber++) {
			topology.add(3);
		}
		//amount of neurons on output layer
		topology.add(4);
		//creating network
		Network net = new Network(topology, bias);
		//creating input values
		//!!!!!!!!!later to be read from the file!!!!!!!
		LinkedList<LinkedList<Double>> inputValues = new LinkedList<LinkedList<Double>>();
		inputValues.add(new LinkedList<Double>());
		inputValues.get(0).add((double) 0);
		inputValues.get(0).add((double) 1);
		inputValues.get(0).add((double) 1);
		inputValues.get(0).add((double) 1);
		inputValues.add(new LinkedList<Double>());
		inputValues.get(1).add((double) 1);
		inputValues.get(1).add((double) 0);
		inputValues.get(1).add((double) 1);
		inputValues.get(1).add((double) 1);
		inputValues.add(new LinkedList<Double>());
		inputValues.get(2).add((double) 1);
		inputValues.get(2).add((double) 1);
		inputValues.get(2).add((double) 0);
		inputValues.get(2).add((double) 1);
		inputValues.add(new LinkedList<Double>());
		inputValues.get(3).add((double) 1);
		inputValues.get(3).add((double) 1);
		inputValues.get(3).add((double) 1);
		inputValues.get(3).add((double) 0);
		net.loadInputValues(inputValues.get(0));
		net.forwardPropagation();
	}
}
