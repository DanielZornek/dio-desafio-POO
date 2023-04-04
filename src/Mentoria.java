import java.time.LocalDate;

public class Mentoria extends Conteudo{

    LocalDate data;

    // Getters and Setters

    public void setData(LocalDate data){
        this.data = data;
    }

    public LocalDate getData(){
        return this.data;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }

    @Override
    public double calcularXP() {
        return XP_Padrao + 10d;
    }

}
