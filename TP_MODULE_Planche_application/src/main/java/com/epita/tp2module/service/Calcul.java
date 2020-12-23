package com.epita.tp2module.service;

public class Calcul {

	public static double calculerNombrePlanche(double surface) {
		double planche = 0.31;
		
		return ((surface / planche) * 10) / 100;

	}

}
