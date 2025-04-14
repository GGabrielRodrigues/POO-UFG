package musicas;

public class testaClasse 
{
    public static void main(String[] args) {
        Compositor mustaine = new Compositor("Dave Mustaine", "EUA");
        System.out.println(mustaine);
        Musica holyWars = new Musica("Holy Wars", "1990", "Rock", mustaine);
        System.out.println(holyWars);
    }
}