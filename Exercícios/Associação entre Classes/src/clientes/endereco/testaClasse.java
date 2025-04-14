package clientes.endereco;

public class testaClasse {
    public static void main(String[] args) {
        Endereço endereço = new Endereço("Av. T-9", 2940,
                "Qd. 16, Lt. 01", "74255-220", "Jardim América",
                "Goiânia", "GO");
        Cliente cliente = new Cliente("Joao", "123456789-0", endereço);
        System.out.println(cliente);
    }
}
