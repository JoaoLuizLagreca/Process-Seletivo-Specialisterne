/*
3. Analise o seguinte algoritmo e faça o teste de mesa:
Inicio
    ler a, b, c
    media ← (a+b+c)/3
        se media>=7 então
            mens ← ‘Aprovado’
        senão
            se media>=5 e media<7
                mens ← ‘Recuperação’
            fim_se
            se media<5 então
                mens ← ‘Reprovado’
            fim_se
Fim
*/

public class Exe1{

    static final Aluno alunos[] = {
            new Aluno(2, 4, 6),
            new Aluno(4, 8, 3),
            new Aluno(9, 3.5f, 8),
            new Aluno(4, 7, 6),
            new Aluno(5, 5, 8.75f)
        };

    public static void main(String args[]){

        System.out.println(
          "         Variáveis\n"
        + " A     B     C      MENSAGEM"
        );

        float media;
        Aluno al;
        for (int i=0; i<alunos.length; i++){
            al = alunos[i];

            media=(al.A + al.B + al.C)/3;
            if(media>=7){
                al.setSituacao(Aluno.APROVADO);
            }else if(media>=5 && media<7){
                al.setSituacao(Aluno.RECUPERACAO);
            }else{
                al.setSituacao(Aluno.REPROVADO);
            }

            System.out.println(al.A+"   "+al.B+"   "+al.C+"    "+al.situacaoDoAluno());
        }

    }
}

class Aluno{

    static final byte CURSANDO=0;
    static final byte APROVADO=1;
    static final byte RECUPERACAO=2;
    static final byte REPROVADO=3;

    float A, B, C;
    byte situacao = CURSANDO;

    public Aluno(float A, float B, float C){
        this.A=A;
        this.B=B;
        this.C=C;
    }

    public void setSituacao(byte situacao){
        this.situacao = situacao;
    }

    public String situacaoDoAluno(){
        switch(situacao){
            case CURSANDO:
                return "Cursando";
            case APROVADO:
                return "Aprovado";
            case REPROVADO:
                return "Reprovado";
            case RECUPERACAO:
                return "Recuperação";
            default:
                return "Desconhecida";
        }
    }

}
