
import br.edu.ifsp.dao.ProdutoDAO;
import br.edu.ifsp.modelo.Produto;
import java.math.BigDecimal;

/**
 *
 * @author aluno
 */
public class Principal {
    private static final ProdutoDAO produtoDAO = new ProdutoDAO();
    
    public static void main(String[] args) {
        adicionarProdutos();
    }
    
    private static void adicionarProdutos() {
        for(int i=0;i<10;i++)
        {
            Produto p = new Produto("Produto " + i, i * 10, new BigDecimal(i + 1));
            produtoDAO.inserir(p);
        }
    }
    
}
