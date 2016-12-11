package model;

/**
 *
 * @author jullia
 */
public class Desenvolvedor {
    private String nome;
    private String nivelXP;

    public Desenvolvedor(String nome, String nivelXP) {
        this.nome = nome;
        this.nivelXP = nivelXP;
    }

    public String getNome() {
        return nome;
    }

    public String getNivelXP() {
        return nivelXP;
    }
    
}
