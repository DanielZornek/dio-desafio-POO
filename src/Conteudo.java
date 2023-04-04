public abstract class Conteudo { // Abstract serve para informar que a 
                                 // class não pode ser instanciada 
                                 // diretamente, apenas por filhas

    private String titulo;
    private String descricao;

    protected static final double XP_Padrao = 10d; // static para informar que o 
                                                    // método é executavel fora desta classe

    public abstract double calcularXP();

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
}
