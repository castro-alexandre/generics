import java.util.Objects;

public class Carro implements Comparable<Carro> {

    private String nome;
    private double km;

    public Carro() {
    }

    public Carro(String nome, double km) {
        this.nome = nome;
        this.km = km;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getKm() {
        return this.km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Carro)) {
            return false;
        }
        Carro carro = (Carro) o;
        return Objects.equals(nome, carro.nome) && km == carro.km;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, km);
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", km='" + getKm() + "'" +
            "}";
    }

    @Override
    public int compareTo(Carro o) {
        return this.nome.compareTo(o.getNome());
    }
    

    
}
