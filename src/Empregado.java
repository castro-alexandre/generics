
public class Empregado implements Comparable<Empregado> {

    private String nome;
    private int matricula;

    public Empregado(String nome, int matricula) {
        if (matricula > 0) {
            this.nome = nome;
            this.matricula = matricula;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", matricula='" + getMatricula() + "'" +
            "}";
    }

    @Override
    public int compareTo(Empregado o) {
        Empregado e = (Empregado) o;
        if (this.matricula < e.getMatricula()) {
            return -1;
        }
        if (this.matricula > e.getMatricula()) {
            return 1;
        }
        return 0;
    }
    
}
