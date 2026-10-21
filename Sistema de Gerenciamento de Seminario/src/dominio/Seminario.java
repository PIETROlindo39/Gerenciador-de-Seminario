package dominio;

public class Seminario {
    private String titulo;
    private Alunos[] alunos;
    private Local local;

    public Seminario(String titulo){
        this.titulo = titulo;
    }
    public Seminario(String titulo, Alunos[] alunos, Local local) {
        this.alunos = alunos;
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Alunos[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }

    public Alunos[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Alunos[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
