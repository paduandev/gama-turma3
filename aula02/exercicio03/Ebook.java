package exercicio03;

public class Ebook {
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    public Ebook(String titulo, String autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        if (totalPaginas > 0) {
            this.totalPaginas = totalPaginas;
        }
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void avancarPagina() {
        if (paginaAtual < totalPaginas) {
            paginaAtual++;
        }
    }

    public void voltarPagina() {
        if (paginaAtual > 0) {
            paginaAtual--;
        }
    }

    public boolean irParaPagina(int pagina) {
        if (pagina >= 0 && pagina <= totalPaginas) {
            paginaAtual = pagina;
            return true;
        }
        return false;
    }

    public String mostrarDados() {
        return titulo + ", " + autor + ", " + totalPaginas;
    }
}
