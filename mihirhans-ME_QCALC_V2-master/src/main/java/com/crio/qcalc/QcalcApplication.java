package com.crio.qcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		
LogicCalculator calc = new LogicCalculator();

calc.OR(8, 6);

calc.printResult();

	   
StandardCalculator calc1 = new StandardCalculator();

calc1.add(Double.MAX_VALUE, Double.MAX_VALUE);

calc1.printResult();


	}

}
