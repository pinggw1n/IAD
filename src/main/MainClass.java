package main;
import java.util.*;

import Network.Network;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> topology = new LinkedList<Integer>();
		Scanner input = new Scanner(System.in);
		boolean bias;
		System.out.println("How many layers would you like to create?");
		int layerQuantity = input.nextInt();
		System.out.println("How many neurons would you like to create in input layer?");
		topology.add(input.nextInt());
		System.out.println("How many neurons would you like to create in the hidden layer?");
		for(int layerNumber = 1; layerNumber < layerQuantity - 1; layerNumber++) {
			topology.add(input.nextInt());
		}
		System.out.println("How many neurons would you like to create in output layer?");
		topology.add(input.nextInt());
		System.out.println("Do you want to include bias?");
		if(input.next().equals("t")) {
			System.out.println("bias included");
			bias = true;
		} else {
			System.out.println("bias not included");
			bias = false;
		}
		Network net = new Network(topology, bias);
		
		LinkedList<Double> inputValues = new LinkedList<Double>();
		inputValues.add((double) 1);
		inputValues.add((double) 1);
		inputValues.add((double) 1);
		inputValues.add((double) 0);
		net.loadInputValues(inputValues);
	}

}
