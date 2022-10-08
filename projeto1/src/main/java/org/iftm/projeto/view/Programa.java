package org.iftm.projeto.view;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.iftm.projeto.control.AlunoControle;
import org.iftm.projeto.control.EmpresaControle;
import org.iftm.projeto.model.Aluno;
import org.iftm.projeto.model.Empresa;

public class Programa {
	public static void main(String[] args) {
		//instanciar os objetos
		Aluno aluno1 = new Aluno(null, "Fabio", "34576899034");
		Aluno aluno2 = new Aluno(null, "Maria", "24075064053");
		
		Empresa empresa1 = new Empresa(null, "TQI", "Avenida Rondon Pacheco", "Bruno Reis");
		Empresa empresa2 = new Empresa(null, "LuizaLabs", "Avenida Jose Andraus", "Andrea Martins");
		
		Aluno alunop;
		Empresa empresap;

		AlunoControle controleA = new AlunoControle();
		EmpresaControle controleE =new EmpresaControle();
		// inserindo 
		
		controleA.inserir(aluno1);
		controleA.inserir(aluno2);
		
		controleE.inserir(empresa1);
		controleE.inserir(empresa2);
		
		// buscando
		alunop = controleA.buscarPorId(3); 
		System.out.println(alunop.getNome()); 
		
		empresap = controleE.buscarPorId(3); 
		System.out.println(empresap.getNome());

		// modificando
		alunop.setNome("bruno queiroz"); // no seu caso utilize um método set do seu projeto
		controleA.alterar(alunop);

		// buscar todos
		List<Aluno> objetos = controleA.buscarTodos();
		for (Aluno obj : objetos) {
			System.out.println(obj.getNome());
		}
		List<Empresa> objet = controleE.buscarTodos();
		for (Empresa obj : objet) {
			System.out.println(obj.getNome());
		}

		// excluir
		controleA.excluir(objetos.get(0));
		
		controleE.excluir(objet.get(0));

		// excluir por id
		controleA.excluirPorId(3); 
		
		controleE.excluirPorId(3);// o id 3 precisa existir no banco, modifique o valor
	}

}

