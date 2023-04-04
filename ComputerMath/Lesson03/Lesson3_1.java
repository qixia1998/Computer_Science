public class Lesson3_1 {
    /**
     * @Description: 计算舍罕王麦子数量
     * param grid- 棋子格数
     * return long- 麦粒总数量
     */

     public static long getNumberOfWheat(int grid) {

        long sum = 0; // 麦粒总数
        long numberOfWheatInGrid = 0; // 当前格子麦粒数量

        numberOfWheatInGrid = 1; // 第一个格子麦粒数量
        sum += numberOfWheatInGrid;

        for (int i = 2; i <= grid; i++) {
            numberOfWheatInGrid *= 2; // 当前格子里麦粒数量是前一个格子的2倍
            sum += numberOfWheatInGrid; // 累计麦粒总数
        }

        return sum;
     }

     public static void main(String[] args) {
        System.out.println(String.format(" 罕舍王麦粒数: %d", Lesson3_1.getNumberOfWheat(63)));
     }
}