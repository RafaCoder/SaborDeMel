package io.github.sabordemel.model;

import com.db4o.ObjectSet;

import br.sabordemel.model.agregados.Documento;
import br.sabordemel.model.agregados.TipoDocumento;
import br.sabordemel.model.dao.PessoaDAO;

public class Teste {
	public static void main(String[] args) {
		PessoaDAO pd = new PessoaDAO();
		//Pessoa pessoa = new Pessoa(new Long(2), "Paladino", new Documento(TipoDocumento.CPF, "123456"), "joao@joao.com", "18/05/1987");
		//pd.persistence(pessoa);
		//pd.destroy("Paladino");
		
		ObjectSet<Pessoa> result = pd.getAll();
		for(Pessoa p : result){
			System.out.println(p.getNome());
		}
	}
}
