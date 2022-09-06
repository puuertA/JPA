package newpackage;

import br.edu.ifsp.dao.FuncionarioDAO;
import br.edu.ifsp.dao.PessoaDAO;
import br.edu.ifsp.modelo.Funcionario;
import br.edu.ifsp.modelo.Pessoa;
import java.math.BigDecimal;

/**
 *
 * @author aluno
 */
public class Principal {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.setNome("João");
        
        PessoaDAO pessoaDAO = new PessoaDAO();
        pessoaDAO.inserir(p1);
        
        Funcionario f1 = new Funcionario();
        f1.setNome("Maria");
        f1.setSalario(new BigDecimal(50000));
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.inserir(f1);
    }
}
