package repository

import entity.Contato

class ContatoRepository {

    companion object {
        private var contatoList = mutableListOf<Contato>();

        fun salvar(contato: Contato) {
            contatoList.add(contato);
        }

        fun deletar(contato: Contato) {
            this.contatoList =
                this.contatoList.filter { it.nome == contato.nome && it.telefone == contato.telefone } as MutableList<Contato>
        }

        fun getContatoList(): List<Contato> {
            return this.contatoList;
        }
    }
}