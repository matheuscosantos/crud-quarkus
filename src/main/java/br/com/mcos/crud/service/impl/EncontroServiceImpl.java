package br.com.mcos.crud.service.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import br.com.mcos.crud.model.Encontro;
import br.com.mcos.crud.rest.form.EncontroForm;
import br.com.mcos.crud.service.EncontroService;

@ApplicationScoped
public class EncontroServiceImpl implements EncontroService {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<Encontro> lista() {
		return em.createQuery("select e from Encontro e", Encontro.class).getResultList();
	}

	@Override
	@Transactional
	public long cria(Encontro encontro) {
		em.persist(encontro);	
		return encontro.getId();
	}

	@Override
	public Encontro porId(long id) {		
		return em.find(Encontro.class, id);
	}

	@Override
	@Transactional
	public void apaga(long id) {
		Encontro encontro = porId(id);
		em.remove(encontro);		
	}

	@Override
	@Transactional
	public Encontro atualiza(long id, EncontroForm encontroForm) {		
		Encontro encontro = porId(id);		
		encontro.setTitulo(encontroForm.getTitulo());	
		return encontro;
	}

}