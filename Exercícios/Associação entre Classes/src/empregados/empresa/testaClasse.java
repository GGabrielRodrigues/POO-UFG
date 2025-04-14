package empregados.empresa;

public class testaClasse 
{
    public static void main(String[] args) {
        Endereço endereço = new Endereço("Av. T-9", 2940,
                "Qd. 16, Lt. 01", "74255-220", "Jardim América",
                "Goiânia", "GO");
        
        Empresa microsoft = new Empresa("1234567-0001.99", "Microsoft", endereço);
        
        Empregado empregado = new Empregado("Joaozinho", "123456", microsoft);
        
        System.out.println(empregado);
    }
}
