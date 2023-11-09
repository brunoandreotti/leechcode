package com.leechcode;

import java.util.*;

public class ValidParenthesis {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        //O for adiciona o caractere de fechamento correspondente na pilha
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');

            //
            // se a lista estiver vazia nesse ponto, quer dizer que não houve nenhum caractere de abertura, não havendo push na pilha
            // e com ela vazia então retornará false,
            //mas caso a lista não estiver vazia, quer dizer que houve um caractere de abertura e ele irá para o pop
            // o pop irá comparar se o item popado é diferente do item atual (que deverá ser um de fechamento)
            // caso seja um caractere diferente ele retornará false pois se trata de um caractere invalido
            // caso seja igual a um caractere de fechamento ele realizara o pop e seguirá a sequencia
            else if (stack.isEmpty() || stack.pop() != c)

                return false;
        }


        // se no final a lista estiver vazia, quer dizer que houve um caractere de abertura e o seu correspondente de fechamento
        // ou seja foi feito o pop de todos os caracteres de fechamento validando que era o caractere certo
        // caso não esteja vazia quer dizer que houve caracteres de abertura sem caracteres de fechamento para realizar o pop na piha
        // então a string está com mais caracteres de abertura do que de fechamento
        return stack.isEmpty();

    }


}
