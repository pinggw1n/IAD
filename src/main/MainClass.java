package main;
import java.util.*;

import Network.Network;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> topology = new LinkedList<Integer>();
		Scanner input = new Scanner(System.in);
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
		Network net = new Network(topology);
	}

}
