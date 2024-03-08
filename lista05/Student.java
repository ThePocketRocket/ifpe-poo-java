/*
Questão 01: Crie uma classe estudante. Esta classe deve ter nome, número de
matrícula, endereço, e 04 notas. Forneça um construtor e métodos para alterar e
obter o nome do estudante e as notas. Além disso, crie um método para calcular a
média do estudante. Crie outra classe que forneça as seguintes opções ao usuário:
1. Criar um Estudante
2. Calcular Média (Se o Aluno foi Aprovado, informe ao usuário)
3. Obter número de matricula
4. Obter Endereço
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
