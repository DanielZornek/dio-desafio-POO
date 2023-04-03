public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("POO Bootcamp \n");
        
        Curso curso1 = new Curso();
        curso1.setNome("Curso de JAVA OO");
        curso1.setDescricao("Intro a POO com JAVA");
        curso1.setCargaHoraria(6);

        System.out.println(curso1);
        
    }
}
