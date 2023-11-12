package br.com.brokenbrain.BB.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Pessoa")
@Table(name = "pessoa")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String nomeTreino;
	private String nomePessoa;
	private String deficiencia;
	private String urlTreino;
	private String urlImagem;
	private String descricao;

	public final String getNomeTreino() {
		return nomeTreino;
	}

	public final void setNomeTreino(String nomeTreino) {
		this.nomeTreino = nomeTreino;
	}

	public final String getNomePessoa() {
		return nomePessoa;
	}

	public final void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public final String getDeficiencia() {
		return deficiencia;
	}

	public final void setDeficiencia(String deficiencia) {
		this.deficiencia = deficiencia;
	}

	public final String getUrlTreino() {
		return urlTreino;
	}

	public final void setUrlTreino(String urlTreino) {
		this.urlTreino = urlTreino;
	}

	public final String getUrlImagem() {
		return urlImagem;
	}

	public final void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public final String getDescricao() {
		return descricao;
	}

	public final void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
