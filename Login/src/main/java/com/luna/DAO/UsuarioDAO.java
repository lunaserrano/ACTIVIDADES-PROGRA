package com.luna.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.luna.model.TbUsuariop;

public class UsuarioDAO {

	public List<TbUsuariop> ingresoUsuario(TbUsuariop usu){
		
		List<TbUsuariop> Usuario = new ArrayList();
		
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("Login");
		em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			Usuario = em.createQuery("from TbUsuariop as u where u.usuario = '"+usu.getUsuario()+"' and u.contrasenia='"+usu.getContrasenia()+"'").getResultList();
			
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e+"error");
		}
		
		return Usuario;
	}
}
