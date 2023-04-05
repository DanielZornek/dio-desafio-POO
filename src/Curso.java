public class Curso extends Conteudo{

    int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso [nome=" + getTitulo() + ", descricao=" + getDescricao() + ", Carga Horária=" + cargaHoraria + "]";
    }

    @Override
    public double calcularXP() {
        // TODO Auto-generated method stub
        return XP_Padrao * cargaHoraria;
    }
    
}
