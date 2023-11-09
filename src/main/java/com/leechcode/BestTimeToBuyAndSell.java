package com.leechcode;

public class BestTimeToBuyAndSell {

    public static int solution1(int[] prices) {
        int menorValor = Integer.MAX_VALUE;
        int lucroTotal = 0;
        int lucroVendaHoje;

        for (int valorDoDia : prices) {

            if (valorDoDia  < menorValor) { //Se o valor da compra do dia for menor que o menor valor registrado
                menorValor = valorDoDia ; // O valor da compra do dia passa a ser o menor valor registrado
            }

            lucroVendaHoje = valorDoDia  - menorValor; // calcula o valor do lucro vendendo hoje

            //Se ultimo valor de lucroTotal calculado for menor que o valor do lucro da venda de hoje
            if (lucroTotal < lucroVendaHoje) {
                //atualiza o valor do lucroTotal para ser o valor de lucroVendaHoje
                lucroTotal = lucroVendaHoje;
            }
        }
        return lucroTotal;
    }

    public static int solution2(int[] prices) {

        int compra = Integer.MAX_VALUE;

        int venda = 0;

        for (int precoDoDia : prices) {

            //define o valor da compra sendo o menor valor entre o valor atual e o valor que está passando pelo array
            compra = Math.min(compra, precoDoDia);

            //define o valor da venda/lucro sendo o maior valor entre o valor de venda atual e o valor do dia menos o da compra = valor venda
            // o maior lucro da venda deverá ser no momento em que o a subtração do valor de precoDoDia menos o valor de compra seja o maior valor
            venda = Math.max(venda, precoDoDia - compra);
        }

        return venda;

    }
}
