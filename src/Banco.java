import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;
    
    public Banco() {
        this.contas = new ArrayList<>();
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> listarClientes() {
        List<String> clientesList = new ArrayList<>();
        if (!contas.isEmpty()) {
            for (Conta c : contas) {
                clientesList.add(c.cliente.getNome());
            }
        }
        return clientesList;
    }    
}
