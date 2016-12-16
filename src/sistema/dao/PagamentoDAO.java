package sistema.dao;

import java.util.List;

import javax.persistence.EntityManager;

import sistema.model.Pagamento;

public class PagamentoDAO {

	
	
	public void salvar(Pagamento pagamento){
		
		EntityManager em= JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(pagamento);
		em.getTransaction().commit();
		em.close();
		
		
	}
	
	@SuppressWarnings("static-access")
	public List<Pagamento>listarPagamentoAberto(){
		 Pagamento pag = new Pagamento();
		EntityManager em= JpaUtil.getEntityManager();
		 return em.createQuery("FROM Pagamento p WHERE p.situacao=:sit",Pagamento.class)
		.setParameter("sit", pag.getSituacao().ABERTO).getResultList();
		
	}
	
	public List<Pagamento>listarPagamentos(){
		
		EntityManager em= JpaUtil.getEntityManager();
	 return em.createQuery("FROM Pagamento",Pagamento.class).getResultList();
		
	}
	
}
