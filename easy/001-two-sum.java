/*
 * LeetCode 1. Two Sum
 * Dificuldade: Easy
 * Link: https://leetcode.com/problems/two-sum/
 *
 * Estratégia:
 * - Dois loops para verificar todas as combinações possíveis de números.
 * - O índice `j` começa em `i + 1` para evitar comparar o mesmo elemento.
 * - Quando a soma bate com o `target`, retornamos os índices imediatamente.
 * - Um `return` final é mantido para satisfazer o compilador (caso nenhum par seja encontrado, 
 *   embora o problema garanta sempre uma solução).
 *
 * Observações:
 * - Inicialmente pensei em retornar os valores, mas o problema pede os índices.
 * - Complexidade de tempo: O(n²)
 * - Complexidade de espaço: O(1)
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    result[0] = i;
                    result[1] = j;
                    return result; // solução encontrada
                }
            }
        }
        return result; // apenas para satisfazer o compilador
    }
}
