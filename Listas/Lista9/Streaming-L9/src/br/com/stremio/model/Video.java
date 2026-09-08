package br.com.stremio.model;

public class Video {

    private int duracaoMinutos;
    private String titulo;

    public Video(int duracaoMinutos, String titulo) {
        setDuracaoMinutos(duracaoMinutos);
        this.titulo = titulo;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
    if (duracaoMinutos <= 0) {
        this.duracaoMinutos = 1;
    } else {
        this.duracaoMinutos = duracaoMinutos;
    }
}

    @Override 
    public String toString() {
        return "Nome do video:" + titulo +
        " Duração:" + duracaoMinutos + "min";
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
