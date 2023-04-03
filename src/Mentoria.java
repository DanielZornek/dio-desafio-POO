import java.time.LocalDate;

public class Mentoria {
    String titulo;
    String descricao;
    LocalDate data;

    // Getters and Setters

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setData(LocalDate data){
        this.data = data;
    }

    public LocalDate getData(){
        return this.data;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
    }

}
