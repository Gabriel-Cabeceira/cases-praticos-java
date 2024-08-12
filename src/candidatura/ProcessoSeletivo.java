package candidatura;

public class ProcessoSeletivo {

    double salarioBase = 2000.0;

    public String analisarCandidato(String nomeCandidato, double salarioPretendido) {


        // Incia o fluxo de verificação dos candidatos
        if (salarioBase >= salarioPretendido) {

            // System.out.println("LIGAR PARA CANDIDATO - " + nomeCandidato);
    
            return nomeCandidato;

        }
    
        return null;
        
    }   
}
