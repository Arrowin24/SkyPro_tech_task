/**
 * Дан массив строк. Необходимо удалить из него все дубли, оставшиеся строки объединить в одну в порядке следования в
 * массиве.
 */
public class Main {
    public static void main(String[] args) {
        String[] strs = new String[]{"ab", "bc", "de", "bc", "bc"};
        //удаление дублей (замена на пустую строку)
        for (int i = 0; i < strs.length; i++) {
            String current = strs[i];
            for (int j = i + 1; j < strs.length; j++) {
                if (current.equals(strs[j])) {
                    strs[i] = "";
                    strs[j] = "";
                }
            }
        }

        //объединение строк
        StringBuilder answer = new StringBuilder();
        for (String str : strs) {
            answer.append(str);
        }

        //вывод строк
        System.out.println(answer);
    }
}