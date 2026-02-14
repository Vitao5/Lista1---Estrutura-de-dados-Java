public class Ex1 {
    public static void main(String[] args){
        double[] notas = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8};
        double media  = 0;;
        double soma = 0;
        double notaMaior = 0;
        int alunosMedia = 0;

        for (double v : notas) {
            soma = soma + v;
        }

        media = soma/ notas.length;

        for (double nota : notas) {
            if(nota > media) alunosMedia++;
            if(nota > notaMaior) notaMaior = nota;
        }

        System.out.println("Media:  " + media);
        System.out.println("Alunos acima da media: " + alunosMedia);
        System.out.println("Nota maior: " + notaMaior);
    }
}