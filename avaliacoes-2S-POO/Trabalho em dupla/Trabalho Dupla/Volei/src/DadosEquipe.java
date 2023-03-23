//  a) Das equipes serão informados (nome, cidade, nome do técnico, quantidade de
//  pontos, número de vitórias, saldo de sets vencidos, colocação final no campeonato
//  e o email da equipe).

class DadosEquipe {
    public String nome;
    public String cidade;
    public String tecnico;
    public float pontuacao;
    public int quant_vitoria;
    public int set_vencidos;
    public int colocacao;

    public String email;

    public DadosEquipe() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public float getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(float pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getQuant_vitoria() {
        return quant_vitoria;
    }

    public void setQuant_vitoria(int quant_vitoria) {
        this.quant_vitoria = quant_vitoria;
    }

    public int getSet_vencidos() {
        return set_vencidos;
    }

    public void setSet_vencidos(int set_vencidos) {
        this.set_vencidos = set_vencidos;
    }

    public int getColocacao() {
        return colocacao;
    }

    public void setColocacao(int colocacao) {
        this.colocacao = colocacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
