package entities;


import java.time.LocalDate;

public class Pedido {
    private int id;
    private LocalDate data;
    private StatusPedido statusPedido;

    //Criado o construtor vazio
    public Pedido() {
    }

    //Criado construtor com os parametros
    public Pedido(int id, LocalDate data, StatusPedido statusPedido) {
        this.id = id;
        this.data = data;
        this.statusPedido = statusPedido;
    }

    /*Basicamente o metodo valida se o status ja esta entregue e caso sim ele bloqueis novo status
        Se o status for um novoStatus o pedito sera atualizado podendo deixar o status pendente novamente
    * */
    public void alteraStatus(StatusPedido novoStatus){
        if (this.statusPedido == StatusPedido.ENTREGUE){
            System.out.println("O pedido ja foi entregue. Portanto, nao e possivel altera-lo");
                    return;
        }
        this.statusPedido = novoStatus;
        System.out.println("O status do pedido foi atualizado para : " + this.statusPedido);

    }

    //Aqui um metodo manipulando o toString da forma que queremos
    public String exibeDados(){
        return "Pedido " + id + ", Data " + data + " , Status do pedido : " + statusPedido;
    }

    //  Daqui para baixo os metodos acessores
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;

    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }
}



