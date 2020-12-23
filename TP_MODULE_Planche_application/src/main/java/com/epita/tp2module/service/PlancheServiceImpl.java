package com.epita.tp2module.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epita.tp2module.entity.Planche;
import com.epita.tp2module.infra.DaoPlanche;

@Service
public class PlancheServiceImpl implements PlancheService { 
	
	@Autowired
	DaoPlanche dao;

	public void calculerPlancheSurface(double surface) {
		Planche p = new Planche();
		p.setSurface(surface);
		p.setNombrePlanche(Calcul.calculerNombrePlanche(surface));
		dao.create(p);
	} 
	


}
