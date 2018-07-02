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
	public void forwardPropagation(LinkedList<Double> previousOutputs) {
		// TODO Auto-generated method stub
		if(Network.Network.bias == true) {
			for(int neuronNumber = 0; neuronNumber < neurons.size() - 1; neuronNumber++) {
				////total net input  = w0*input0 + w1*input1 + w2*input2 + w3*input3 ( + w'bias*inputBias)
				//squshing the total net input using the sigmoid function 1/(1+exp(-total_net_input)
				neurons.get(neuronNumber).CountOutputValue(previousOutputs);
			}
		} else {
			for(int neuronNumber = 0; neuronNumber < neurons.size(); neuronNumber++) {
				////total net input  = w0*input0 + w1*input1 + w2*input2 + w3*input3 ( + w'bias*inputBias)
				//squshing the total net input using the sigmoid function 1/(1+exp(-total_net_input)
				neurons.get(neuronNumber).CountOutputValue(previousOutputs);
			}
		}
	}
}
