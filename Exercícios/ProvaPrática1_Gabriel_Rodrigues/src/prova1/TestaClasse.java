package prova1;

import java.util.Scanner;

// i) Classe principal para cadastro e exibição
public class TestaClasse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cadastro de Usuarios e Eventos ---");

        // Cadastro do Usuario 1
        System.out.println("\n--- Cadastro Usuario 1 ---");
        System.out.print("Nome: ");
        String nomeUser1 = scanner.nextLine();
        System.out.print("Email: ");
        String emailUser1 = scanner.nextLine();
        System.out.print("Senha: ");
        String senhaUser1 = scanner.nextLine();
        Usuario usuario1 = new Usuario(nomeUser1, emailUser1, senhaUser1);
        //
        
        // Cadastro do Evento 1 para Usuario 1 (Evento Normal)
        System.out.println("\n--- Cadastro Evento 1 (Normal) para " + usuario1.getNome() + " ---");
        System.out.print("Descricao do Evento: ");
        String descEvento1 = scanner.nextLine();
        Evento evento1 = new Evento(descEvento1);
        System.out.print("Data Inicio (dd/mm/aaaa): ");
        evento1.setDataInicio(scanner.nextLine());
        System.out.print("Data Fim (dd/mm/aaaa): ");
        evento1.setDataFim(scanner.nextLine());
        //
            
        // Adicionar 3 Palestras ao Evento 1
        System.out.println("-> Adicionar 3 Palestras ao Evento 1:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("--- Palestra " + i + " ---");
            System.out.print("Nome da Palestra: ");
            String nomePal1 = scanner.nextLine();
            System.out.print("Data da Palestra (dd/mm/aaaa): ");
            String dataPal1 = scanner.nextLine();
            Palestra p = new Palestra(nomePal1, dataPal1);
            System.out.print("Hora Inicial (hh:mm): ");
            p.setHoraInicial(scanner.nextLine());
            System.out.print("Hora Final (hh:mm): ");
            p.setHoraFinal(scanner.nextLine());
            System.out.print("Comentario: ");
            p.setComentario(scanner.nextLine());
            evento1.adicionarPalestra(p); // Adiciona palestra ao evento
        }
        usuario1.adicionarEvento(evento1); // Associa evento ao usuario
        //
        
        // Cadastro do Evento 2 para Usuario 1 (Evento Patrocinado)
        System.out.println("\n--- Cadastro Evento 2 (Patrocinado) para " + usuario1.getNome() + " ---");
        System.out.print("Descricao do Evento: ");
        String descEvento2 = scanner.nextLine();
        System.out.print("Nome do Patrocinador: ");
        String sponsor2 = scanner.nextLine();
        System.out.print("Valor do Patrocínio: ");
        double valor2 = scanner.nextDouble();
        scanner.nextLine(); // Consumir nova linha
        EventoPatrocinado evento2 = new EventoPatrocinado(descEvento2, sponsor2, valor2);
        System.out.print("Data Inicio (dd/mm/aaaa): ");
        evento2.setDataInicio(scanner.nextLine());
        System.out.print("Data Fim (dd/mm/aaaa): ");
        evento2.setDataFim(scanner.nextLine());
        //
        
        // Adicionar 3 Palestras ao Evento 2
        System.out.println("-> Adicionar 3 Palestras ao Evento 2:");
         for (int i = 1; i <= 3; i++) {
            System.out.println("--- Palestra " + i + " ---");
            System.out.print("Nome da Palestra: ");
            String nomePal2 = scanner.nextLine();
            System.out.print("Data da Palestra (dd/mm/aaaa): ");
            String dataPal2 = scanner.nextLine();
            Palestra p = new Palestra(nomePal2, dataPal2);
            System.out.print("Hora Inicial (hh:mm): ");
            p.setHoraInicial(scanner.nextLine());
            System.out.print("Hora Final (hh:mm): ");
            p.setHoraFinal(scanner.nextLine());
            System.out.print("Comentário: ");
            p.setComentario(scanner.nextLine());
            evento2.adicionarPalestra(p);
        }
        usuario1.adicionarEvento(evento2); // Associa evento ao usuário
        //
        
        // --- Repetir o processo para o Usuário 2 ---
        System.out.println("\n---------------------------------------");
        System.out.println("\n--- Cadastro Usuario 2 ---");
        System.out.print("Nome: ");
        String nomeUser2 = scanner.nextLine();
        System.out.print("Email: ");
        String emailUser2 = scanner.nextLine();
        System.out.print("Senha: ");
        String senhaUser2 = scanner.nextLine();
        Usuario usuario2 = new Usuario(nomeUser2, emailUser2, senhaUser2);
        //
        
        // Cadastro do Evento 3 para Usuário 2 (Evento Normal)
        System.out.println("\n--- Cadastro Evento 3 (Normal) para " + usuario2.getNome() + " ---");
        System.out.print("Descricao do Evento: ");
        String descEvento3 = scanner.nextLine();
        Evento evento3 = new Evento(descEvento3);
        System.out.print("Data Inicio (dd/mm/aaaa): ");
        evento3.setDataInicio(scanner.nextLine());
        System.out.print("Data Fim (dd/mm/aaaa): ");
        evento3.setDataFim(scanner.nextLine());
        //
        
        // Adicionar 3 Palestras ao Evento 3
        System.out.println("-> Adicionar 3 Palestras ao Evento 3:");
        for (int i = 1; i <= 3; i++) {
             System.out.println("--- Palestra " + i + " ---");
            System.out.print("Nome da Palestra: "); String nomeP = scanner.nextLine();
            System.out.print("Data da Palestra: "); String dataP = scanner.nextLine();
            Palestra p = new Palestra(nomeP, dataP);
            System.out.print("Hora Inicio: "); p.setHoraInicial(scanner.nextLine());
            System.out.print("Hora Fim: "); p.setHoraFinal(scanner.nextLine());
            System.out.print("Comentário: "); p.setComentario(scanner.nextLine());
            evento3.adicionarPalestra(p);
        }
        usuario2.adicionarEvento(evento3);
        //
        
        // Cadastro do Evento 4 para Usuário 2 (Evento Patrocinado - com valor padrão)
        System.out.println("\n--- Cadastro Evento 4 (Patrocinado) para " + usuario2.getNome() + " ---");
        System.out.print("Descricao do Evento: ");
        String descEvento4 = scanner.nextLine();
        System.out.print("Nome do Patrocinador: ");
        String sponsor4 = scanner.nextLine();
        // Usando o construtor com valor padrão
        EventoPatrocinado evento4 = new EventoPatrocinado(descEvento4, sponsor4);
        System.out.print("Data Inicio (dd/mm/aaaa): ");
        evento4.setDataInicio(scanner.nextLine());
        System.out.print("Data Fim (dd/mm/aaaa): ");
        evento4.setDataFim(scanner.nextLine());
        //
        // Adicionar 3 Palestras ao Evento 4
        System.out.println("-> Adicionar 3 Palestras ao Evento 4:");
        for (int i = 1; i <= 3; i++) {
             System.out.println("--- Palestra " + i + " ---");
            System.out.print("Nome da Palestra: "); String nomeP = scanner.nextLine();
            System.out.print("Data da Palestra: "); String dataP = scanner.nextLine();
            Palestra p = new Palestra(nomeP, dataP);
            System.out.print("Hora Inicio: "); p.setHoraInicial(scanner.nextLine());
            System.out.print("Hora Fim: "); p.setHoraFinal(scanner.nextLine());
            System.out.print("Comentário: "); p.setComentario(scanner.nextLine());
            evento4.adicionarPalestra(p);
        }
        usuario2.adicionarEvento(evento4);
        //

        System.out.println("\n\n==============================================");
        System.out.println("      RELATÓRIO FINAL DE CADASTROS");
        System.out.println("==============================================");

        System.out.println("\n--- Usuario 1 ---");
        System.out.println(usuario1); // Chama o toString do usuário 1
        System.out.println("\n--- Detalhes dos Eventos do Usuario 1 ---");
        for (Evento ev : usuario1.getEventos()) {
             System.out.println("--------------------");
             System.out.println(ev); // Chama o toString de cada evento (normal ou patrocinado)
             System.out.println("--- Detalhes das Palestras deste Evento ---");
             for(Palestra pal : ev.getPalestras()){
                 System.out.println(pal); // Chama o toString de cada palestra
             }
             System.out.println("--------------------");
        }

        System.out.println("\n--- Usuario 2 ---");
        System.out.println(usuario2); // Chama o toString do usuario 2
         System.out.println("\n--- Detalhes dos Eventos do Usuario 2 ---");
        for (Evento ev : usuario2.getEventos()) {
             System.out.println("--------------------");
             System.out.println(ev);
             System.out.println("--- Detalhes das Palestras deste Evento ---");
             for(Palestra pal : ev.getPalestras()){
                 System.out.println(pal);
             }
             System.out.println("--------------------");
        }

        scanner.close(); 
    }
}