public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }

        int n = m.length;
        boolean[] visited = new boolean[n];
        int[] queue = new int[n];
        int[] distance = new int[n];

        int head = 0;
        int tail = 0;

        queue[tail++] = i;
        visited[i] = true;
        distance[i] = 0;

        while (head < tail) {
            int current = queue[head++];

            for (int next = 0; next < n; next++) {
                if (m[current][next] == 1 && !visited[next]) {
                    if (next == j) {
                        return distance[current] + 1;
                    }
                    visited[next] = true;
                    distance[next] = distance[current] + 1;
                    queue[tail++] = next;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}