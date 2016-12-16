package sistema.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pagamento {
	
	@Id
	@GeneratedValue
	private Integer codPag;
	private String nome;
	private double valor;
	private Date dataV;
	private Date dataP;
	private TipoConta tipo;
	private TipoSituacao situacao;
	private String descricao;
	public Integer getCodPag() {
		return codPag;
	}
	public void setCodPag(Integer codPag) {
		this.codPag = codPag;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Date getDataV() {
		return dataV;
	}
	public void setDataV(Date dataV) {
		this.dataV = dataV;
	}
	public Date getDataP() {
		return dataP;
	}
	public void setDataP(Date dataP) {
		this.dataP = dataP;
	}
	public TipoConta getTipo() {
		return tipo;
	}
	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}
	public TipoSituacao getSituacao() {
		return situacao;
	}
	public void setSituacao(TipoSituacao situacao) {
		this.situacao = situacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
		
	}
	
	

}
