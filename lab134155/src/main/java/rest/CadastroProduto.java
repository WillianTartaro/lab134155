package rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.univel.model.Produto;

@Stateless
public class CadastroProduto {
	
	@PersistenceContext(unitName = "lab134155-persistence-unit")
	private EntityManager em;
	
	public void create(Produto produto){
		em.persist(produto);
	}
	
	public List<Produto> read(){
		TypedQuery<Produto> findAllQuery = em.createQuery("SELECT * FROM PRODUTO ORDER BY ID", Produto.class);
		return findAllQuery.getResultList();
	}
	
	public void update(Produto produto){
		em.merge(produto);
	}

	public void delete(Long id){
		Produto entity = em.find(Produto.class, id);
		if(entity != null){
			em.remove(entity);
		}
	}
}
