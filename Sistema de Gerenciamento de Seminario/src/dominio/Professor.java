package dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professor (String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(Seminario[] seminario, String nome, String especialidade) {
        this.seminario = seminario;
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public void impressora(){
        System.out.println("Professor: " + this.nome);
        if(this.seminario == null) return; {
            System.out.println("##Seminarios Cadastrado##");
            for (Seminario seminario : this.seminario){
                System.out.println(seminario.getTitulo());
                System.out.println(seminario.getLocal().getEndereço());
                System.out.println("**Alunos**");
                for(Alunos alunos : seminario.getAlunos()){
                    System.out.println("aluno: "+ alunos.getNome() +"Idade: "+ alunos.getIdade());
                }
            }
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public String getEspecialidade(){
        return especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
}
