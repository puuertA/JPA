
import br.edu.ifsp.dao.ProdutoDAO;
import br.edu.ifsp.dao.VendaDAO;
import br.edu.ifsp.modelo.Item;
import br.edu.ifsp.modelo.Produto;
import br.edu.ifsp.modelo.Venda;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Principal {
    private static final ProdutoDAO produtoDAO = new ProdutoDAO();
    private static final VendaDAO vendaDAO = new VendaDAO();
    
    public static void main(String[] args) {
        adicionarProdutos();
        exibirProdutos();
        adicionarVenda();
    }
    
    private static void adicionarProdutos() {
        for(int i=0;i<10;i++)
        {
            Produto p = new Produto("Produto " + i, i * 10, new BigDecimal(i + 1));
            produtoDAO.inserir(p);
        }
    }
    
    private static void exibirProdutos() {
     List<Produto> produtos = produtoDAO.buscar();
     for(Produto produto : produtos) {
         System.out.println(produto);
     }
    }
    
    private static void adicionarVenda() {
        Venda venda = new Venda();
        venda.setData(new Date());
        
        List<Produto> produtos = produtoDAO.buscar();
        
        Item item = new Item();
        item.setVenda(venda);
        item.setProduto(produtos.get(0));
        item.setPreco(produtos.get(0).getPreco());
        item.setQuantidade(10);
        
        List<Item> itens = new ArrayList<>();
        itens.add(item);
        
        venda.setItens(itens);
        
        vendaDAO.inserir(venda);
    }
}
