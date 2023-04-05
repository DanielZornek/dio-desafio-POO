import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("POO Bootcamp \n");
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de JAVA OO");
        curso1.setDescricao("Intro a POO com JAVA");
        curso1.setCargaHoraria(6);

        Curso curso2 = new Curso();
        curso2.setTitulo("Estrutura de dados com JAVA");
        curso2.setDescricao("Introdução a estrutura de dados com java");
        curso2.setCargaHoraria(9);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("O que podemos fazer com JAVA");
        mentoria1.setDescricao("Bate-papo sobre as possibilidades que a linguagem JAVA proporciona");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Java Banco Pan Developer");
        bootcampJava.setDescricao("Decrição ui");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria1);

        Dev devDaniel = new Dev();

        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcampJava);

        System.out.println("Conteúdos incritos do Dev: " + devDaniel.getNome() + " - " + devDaniel.getConteudoInscritos()+"\n");

        devDaniel.progredir();
        devDaniel.progredir();

        System.out.println("Conteúdos Concluídos do Dev: "+devDaniel.getNome() + " - " + devDaniel.getConteudosConcluidos());

        System.out.println("XP Total adquirido: " + devDaniel.calcularTotalXP()+"XP");

        
    }
}
