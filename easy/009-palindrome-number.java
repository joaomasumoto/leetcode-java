/*
 * LeetCode 9. Palindrome Number
 * Dificuldade: Easy
 * Link: https://leetcode.com/problems/palindrome-number/
 *
 * Estratégia:
 * - Converte o número inteiro para String usando String.valueOf() e armazena em `num`.
 * - Utiliza StringBuilder para inverter a string (`reverse()`), criando `numInvert`.
 * - Compara `num` e `numInvert` usando `.equals()` (necessário pois `==` compara apenas referências de objetos, não o conteúdo).
 * - O método `.equals()` retorna um boolean diretamente, por isso não foi necessário usar if/else.
 *
 * Observações:
 * - Atenção: `==` funciona para tipos primitivos, mas para objetos como String é preciso usar `.equals()` para comparar o conteúdo.
 * - Essa abordagem é simples e clara, mas consome mais memória do que a solução que evita conversão para String.
 * - Complexidade de tempo: O(n), onde n é o número de dígitos do inteiro.
 * - Complexidade de espaço: O(n) devido à criação das strings.
 */

class Solution {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        String numInvert = new StringBuilder(num).reverse().toString();
        return num.equals(numInvert);
    }
}
