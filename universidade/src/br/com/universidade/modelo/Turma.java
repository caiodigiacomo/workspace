package br.com.universidade.modelo;

public class Turma {

	private String nome;
	private String periodo;
	private Curso curso;
	private Aluno aluno;
	private Professor professor;
	
	public Turma() {
		super();
	}

	public Turma(String nome, String periodo, Curso curso, Aluno aluno, Professor professor) {
		super();
		this.nome = nome;
		this.periodo = periodo;
		this.curso = curso;
		this.aluno = aluno;
		this.professor = professor;
	}

	public String getAll() {
		return
				"Nome.......: " + nome + "\n" +
				"Período....: " + periodo + "\n" +
				"Curso......: " + "\n" + curso.getAll() + "\n" +
				"Aluno......:" + "\n" + aluno.getAll() + "\n" +
				"Professor..:" + "\n" + professor.getAll();
	}

	public void setAll(String p1, String p2, Curso p3, Aluno p4, Professor p5) {
		nome=p1;
		periodo=p2;
		curso=p3;
		aluno=p4;
		professor=p5;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
}
