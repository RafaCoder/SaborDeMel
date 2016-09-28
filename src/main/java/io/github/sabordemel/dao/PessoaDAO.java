package io.github.sabordemel.dao;

import java.util.List;

import io.github.sabordemel.model.Pessoa;

public class PessoaDAO extends DAO<Pessoa>{

	@Override
	@SuppressWarnings("unchecked")
	public List<Pessoa> findAll() {
		return entityManager.createQuery("FROM pessoa").getResultList();
	}

	@Override
	public Pessoa getById(Long id) {
		return entityManager.find(Pessoa.class, id);
	}

	@Override
	public boolean removeById(final Long id) {
		boolean result = true;
		try{
			Pessoa pessoa = getById(id);
			super.remove(pessoa);
		}catch (Exception ex) {
			ex.printStackTrace();
			result = false;
		}
		return result;
	}

}
