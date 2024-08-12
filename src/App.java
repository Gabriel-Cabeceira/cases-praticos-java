import candidatura.ProcessoSeletivo;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import candidato.Candidato;

public class App {

    static Double gerarValorRandomico() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void main(String[] args) throws Exception {

        // Lista de nomes de candidatos
        String[] nomesCandidatos = {"Gabriel", "Aline", "Alexandre", "Gabriela", "Pedro", "Dener", "Francigênia", "Ailton", "Rose", "Debora"};

        // Define o número máximo de candidatos a serem selecionados
        int limiteCandidatos = 5;
        
        // Lista completa de candidatos
        ArrayList<Candidato> candidatos = new ArrayList<>();


        // Lista com nomes dos candidatos selecionados
        ArrayList<String> Totalselecionados = new ArrayList<>();

        // Lista com nomes dos candidatos selecionados
        ArrayList<String> selecionados = new ArrayList<>();

        // Array completo de candidatos é preenchido aqui
        for(String candidato: nomesCandidatos) {
            candidatos.add(
                new Candidato(candidato, gerarValorRandomico())
            );
        }

        // Cria uma instância da Classe ProcessoSeletivo
        ProcessoSeletivo processoSeletivo = new ProcessoSeletivo();

        
        for(Candidato candidato : candidatos) {
            Totalselecionados.add(
                processoSeletivo.analisarCandidato(candidato.nome, candidato.salarioPretendido)
            );
        }

        for(String selecionado : Totalselecionados) {
            if(selecionado != null && (selecionados.size() < limiteCandidatos)) {
                selecionados.add(selecionado);
            }
        }

        for(String teste : selecionados) {
            System.out.println(teste);
        }
    }    
}
