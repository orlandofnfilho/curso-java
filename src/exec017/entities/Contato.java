package exec017.entities;

import exec017.exceptions.ContatoNaoExisteException;

public class Contato {

	private Integer id;
	private String nome;
	private String telefone;

	public Contato() {

	}

	public Contato(Integer id, String nome, String telefone) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void consultar(Integer id) {
		if (this.id != id) {
			throw new ContatoNaoExisteException("O contato não está na agenda");
		} else {
			System.out.printf("Id: %d\nNome: %s\nTelefone: %s", getId(), getNome(), getTelefone());
		}
	}

}
