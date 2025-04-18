//Gabriel Rodrigues da SIlva 202403072

package pacote1;

public class Serie extends ProgramaTV {
    private int temporadas;
    private int episodios;
    
    public Serie(String nome, String categoria, int temporadas, int episodios) {
        super(nome, categoria);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }
    
    // Métodos de acesso
        public int getTemporadas() {
            return temporadas;
        }

        public void setTemporadas(int temporadas) {
            this.temporadas = temporadas;
        }

        public int getEpisodios() {
            return episodios;
        }

        public void setEpisodios(int episodios) {
            this.episodios = episodios;
        }
    //
    @Override
    public String toString() {
        return super.toString() + 
               "Temporadas: " + temporadas + "\n" +
               "Episódios: " + episodios + "\n";
    }
}
