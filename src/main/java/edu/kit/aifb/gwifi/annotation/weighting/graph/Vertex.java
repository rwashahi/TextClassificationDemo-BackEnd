package edu.kit.aifb.gwifi.annotation.weighting.graph;

import java.util.HashSet;
import java.util.Set;

public abstract class Vertex {

	protected Set<Edge> linksOutEdges;
	protected double weight;
	
	protected double totalEdgeWeight; 
	
	public Vertex() {
		linksOutEdges = new HashSet<Edge>();
	} 
	
	public boolean containsEdge(Edge edge) {
		return linksOutEdges.contains(edge);	 	
	}
	
	public void addOutEdge(Edge edge) {
		if(!linksOutEdges.contains(edge)) {
			linksOutEdges.add(edge);
			totalEdgeWeight += edge.getWeight();
		}
	}
	
	public Set<Edge> getOutEdges() {
		return linksOutEdges;
	}
	
	public void setWeight(double weight) {
		this.weight = weight; 
	}
	
	public double getWeight() {
		return weight;
	} 
	
	public double getTotalEdgeWeight() {
		return totalEdgeWeight;
	}
	
}
