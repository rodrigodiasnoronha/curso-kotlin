package business

import entity.Contato
import repository.ContatoRepository
import java.lang.Exception


class ContatoBusiness {
    fun validarContato(nome: String, telefone: String) {
        if (nome == "") {
            throw Exception("Nome é obrigatório");
        }

        if (telefone == "") {
            throw Exception("Telefone é obrigatório");
        }
    }

    fun validarDelete(nome: String, telefone: String) {
        if (nome == "" || telefone == "") {
            throw Exception("É necessário selecionar um contato antes de remover");
        }
    }

    fun salvarContato(nome: String, telefone: String) {
        validarContato(nome, telefone);

        val contato = Contato(nome, telefone);
        ContatoRepository.salvar(contato);
    }

    fun deletarContato(nome: String, telefone: String) {
        validarDelete(nome, telefone);

        val contato = Contato(nome, telefone);
        ContatoRepository.deletar(contato);
    }

    fun getContatoList(): List<Contato> {
        return ContatoRepository.getContatoList();
    }

    fun getTotalContato(): String {
        return ContatoRepository.getContatoList().size.toString()
    }
}
