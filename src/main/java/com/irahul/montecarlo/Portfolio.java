package com.irahul.montecarlo;


/**
 * A Portfolio
 * @author rahul
 *
 */
public class Portfolio {
	private String name;
	private double initialInvestment;
	private double mean;//return
	private double standardDeviation;//risk
	
	//simulated values
	private double simulationMedian;
	private double simulationTop10;
	private double simulationBottom10;
		
	public Portfolio(String name, double initialInvestment, double mean, double standardDeviation) {
		this.name=name;
		this.initialInvestment=initialInvestment;
		this.mean=mean;
		this.standardDeviation=standardDeviation;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getInitialInvestment() {
		return initialInvestment;
	}

	public void setInitialInvestment(double initialInvestment) {
		this.initialInvestment = initialInvestment;
	}

	public double getMean() {
		return mean;
	}

	public void setMean(double mean) {
		this.mean = mean;
	}

	public double getStandardDeviation() {
		return standardDeviation;
	}

	public void setStandardDeviation(double standardDeviation) {
		this.standardDeviation = standardDeviation;
	}

	public double getSimulationMedian() {
		return simulationMedian;
	}

	public void setSimulationMedian(double simulationMedian) {
		this.simulationMedian = simulationMedian;
	}

	public double getSimulationTop10() {
		return simulationTop10;
	}

	public void setSimulationTop10(double simulationTop10) {
		this.simulationTop10 = simulationTop10;
	}

	public double getSimulationBottom10() {
		return simulationBottom10;
	}

	public void setSimulationBottom10(double simulationBottom10) {
		this.simulationBottom10 = simulationBottom10;
	}

	@Override
	public String toString() {
		return "Portfolio [name=" + name + ", initialInvestment="
				+ initialInvestment + ", return=" + mean + ", risk="
				+ standardDeviation + ", Median=" + simulationMedian
				+ ", 10% Best=" + simulationTop10
				+ ", 10% Worst=" + simulationBottom10 + "]";
	}
	
}
