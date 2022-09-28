package org.iftm.projeto.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.iftm.projeto.model.Aluno;
import org.iftm.projeto.model.Empresa;

public class Programa {
	public static void main(String[] args) {
		//instanciar os objetos
		Aluno aluno1 = new Aluno(null, "Fabio", "34576899034");
		Aluno aluno2 = new Aluno(null, "Maria", "24075064053");
		
		Empresa empresa1 = new Empresa(null, "TQI", "Avenida Rondon Pacheco", "Bruno Reis");
		Empresa empresa2 = new Empresa(null, "LuizaLabs", "Avenida Jose Andraus", "Andrea Martins");
			
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(aluno1);
		em.persist(aluno2);
		
		em.persist(empresa1);
		em.persist(empresa2);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
