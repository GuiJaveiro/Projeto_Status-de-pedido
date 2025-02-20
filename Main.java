import entities.Pedido;
import entities.StatusPedido;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pedido pedido1 = new Pedido();

        pedido1.setId(1001);
        pedido1.setData(LocalDate.of(2025, 02, 1));

        pedido1.alteraStatus(StatusPedido.ENTREGUE);
        pedido1.alteraStatus(StatusPedido.PENDENTE);
        String exibeDado = pedido1.exibeDados();
        System.out.println(exibeDado);
    }
}