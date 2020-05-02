package br.com.mcos.crud.service;

import java.util.List;

import br.com.mcos.crud.model.Encontro;
import br.com.mcos.crud.rest.form.EncontroForm;

public interface EncontroService {

	List<Encontro> lista();

	long cria(Encontro encontro);

	Encontro porId(long id);

	void apaga(long id);

	Encontro atualiza(long id, EncontroForm encontroForm);


}
