package sistema.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import sistema.dao.PagamentoDAO;
import sistema.model.Pagamento;
import sistema.model.TipoConta;
import sistema.model.TipoSituacao;

@ManagedBean
@SessionScoped
public class PagamentoBean {

	private Pagamento pagamento = new Pagamento();//Inicia o pagamento
	private List<TipoConta> tipos = Arrays.asList(TipoConta.values());// Carrega os tipod de contas.
	private List<TipoSituacao> situacoes = Arrays.asList(TipoSituacao.values());// Carrega os tipos de situaçoes
	private List<Pagamento> pagamentos = new ArrayList<Pagamento>();// Lista dos os pagamentos do BD
	private List<Pagamento> pag = new ArrayList<Pagamento>(); // Carrega todos pagametos em aberto.
	
	public PagamentoBean(){
		pag= new PagamentoDAO().listarPagamentoAberto();
		pagamentos= new  PagamentoDAO().listarPagamentos();
	}

	public void salvar() {
		new PagamentoDAO().salvar(pagamento);
        pagamento = new Pagamento();
        pag= new PagamentoDAO().listarPagamentoAberto();
        pagamentos= new  PagamentoDAO().listarPagamentos();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Pagamento Salvo com sucesso!"));
	}

	
	public String editar(Pagamento pagamento){
		this.pagamento=pagamento;
		pagamentos= new  PagamentoDAO().listarPagamentos();
		pag= new PagamentoDAO().listarPagamentoAberto();
		return"formulario_conta?faces-redirect=true";
		
	}
	
	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public List<TipoConta> getTipos() {
		return tipos;
	}

	public void setTipos(List<TipoConta> tipos) {
		this.tipos = tipos;
	}

	public List<TipoSituacao> getSituacoes() {
		return situacoes;
	}

	public void setSituacoes(List<TipoSituacao> situacoes) {
		this.situacoes = situacoes;
	}

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}

	public List<Pagamento> getPag() {
		return pag;
	}

	public void setPag(List<Pagamento> pag) {
		this.pag = pag;
	}

}
