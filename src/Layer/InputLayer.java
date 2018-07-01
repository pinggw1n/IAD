package Layer;

import java.util.LinkedList;

import Network.Network;
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
	public void loadInputValues(LinkedList<Double> inputValues) {
		if(Network.bias == true) {
			for(int neuronNumber = 0; neuronNumber < neurons.size() - 1; neuronNumber++) {
				neurons.get(neuronNumber).SetOutputValue(inputValues.get(neuronNumber));
				System.out.println("Neuron " + neuronNumber + " has outputValue: " + neurons.get(neuronNumber).GetOutputValue());
			}
			System.out.println("Bias wynosi: " + neurons.get(neurons.size() - 1).GetOutputValue());
		} else {
			for(int neuronNumber = 0; neuronNumber < neurons.size(); neuronNumber++) {
				neurons.get(neuronNumber).SetOutputValue(inputValues.get(neuronNumber));
				System.out.println("Neuron " + neuronNumber + " has outputValue: " + neurons.get(neuronNumber).GetOutputValue());
			}
		}
	}
	
}
