package org.iftm.projeto.control;

import java.util.List;
import model.Empresa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.iftm.projeto.model.Empresa;

public class EmpresaControle {
	private EntityManager em;

	public EmpresaControle() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto 1");
		em = emf.createEntityManager();
	}

	public void inserir(Empresa objeto) {
		try {
			em.getTransaction().begin();
			em.persist(objeto);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void alterar(Empresa objeto) {
		try {
			em.getTransaction().begin();
			em.persist(objeto);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}

	}

	public void excluir(Empresa objeto) {
		try {
			em.getTransaction().begin();
			em.persist(objeto);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public Empresa buscarPorId(Integer id) {
		return em.find(Empresa.class, id);
	}

	public void excluirPorId(Integer id) {
		excluir(buscarPorId(Id));
	}

	public List<Empresa> buscarTodos() {
		String nomeClasse = Empresa.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();

	}

}
