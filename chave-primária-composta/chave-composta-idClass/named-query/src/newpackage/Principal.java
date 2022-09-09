package newpackage;

import br.edu.ifsp.dao.PessoaDAO;
import br.edu.ifsp.modelo.Pessoa;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author aluno
 */
public class Principal {

    public static void main(String[] args) {

        PessoaDAO pessoaDAO = new PessoaDAO();

        for (int i = 0; i < 10; i++) {
            Pessoa p = new Pessoa("Pessoa" + i, new Date(), new BigDecimal(1000 * ++i));

            pessoaDAO.inserir(p);
        }
        
        Pessoa pessoaRetornada = pessoaDAO.buscarPorId(5);
        
        System.out.println(pessoaRetornada);
    }
}
