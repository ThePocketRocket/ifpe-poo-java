/*
Quest�o 01: Crie uma classe estudante. Esta classe deve ter nome, n�mero de
matr�cula, endere�o, e 04 notas. Forne�a um construtor e m�todos para alterar e
obter o nome do estudante e as notas. Al�m disso, crie um m�todo para calcular a
m�dia do estudante. Crie outra classe que forne�a as seguintes op��es ao usu�rio:
1. Criar um Estudante
2. Calcular M�dia (Se o Aluno foi Aprovado, informe ao usu�rio)
3. Obter n�mero de matricula
4. Obter Endere�o
0. Sair
*/

package lista05;

public class Student {
    private String name, matriculationId, address;
    private double[] grades;

    public Student(String name, String matriculationId, String address, double[] grades) {
        setName(name);
        setMatriculationId(matriculationId);
        setAddress(address);
        setGrades(grades);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatriculationId() {
        return matriculationId;
    }

    public void setMatriculationId(String matriculationId) {
        this.matriculationId = matriculationId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double calculateAverage(double[] grades) {
        double average = 0, arrayLength = grades.length;
        for (double grade : grades) {
            average += grade;
        }

        return average / arrayLength;
    }
}
