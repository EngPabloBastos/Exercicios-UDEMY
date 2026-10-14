package Sistema_deNotas;

public class Student {
    private double nota1Trimestre;
    private double nota2Trimestre;
    private double nota3Trimestre;
    private boolean passou;
    private double notaFinal;
    private double notaFaltante;


    // Getters
    public boolean getPassou(){
        return this.passou;
    }

    public double getNotaFinal(){
        return this.notaFinal;
    }

    public double getNotaFaltante(){
        return this.notaFaltante;
    }


    // Function
    public void calculoNota (double nota1Trimestre, double nota2Trimestre, double nota3Trimestre){
        // Grades Setters
        this.nota1Trimestre = nota1Trimestre;
        this.nota2Trimestre = nota2Trimestre;
        this.nota3Trimestre = nota3Trimestre;

        this.notaFinal = nota1Trimestre + nota2Trimestre + nota3Trimestre;

        // Passed Validation
        if (notaFinal >= 60){
            this.passou = true;
            this.notaFaltante = 0;
        }
        else{
            this.passou = false;
            this.notaFaltante = 60 - notaFinal;
        }
    }

}
