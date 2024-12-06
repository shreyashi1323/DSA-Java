package backtracking;

public class princess {

    static class HealthResult {
        int minInitialHealth;
        int totalHealthLost;

        public HealthResult(int minInitialHealth, int totalHealthLost) {
            this.minInitialHealth = minInitialHealth;
            this.totalHealthLost = totalHealthLost;
        }
    }

    // Function to find the minimum initial health and total health lost using brute-force approach
    static HealthResult findMinimumInitialHealth(int[][] maze) {
        HealthResult result = new HealthResult(Integer.MAX_VALUE, 0);
        exploreMaze(maze, 0, 0, 0, 0, result);

        // If no health is lost along the path, the minimum initial health required should be 1
        if (result.totalHealthLost == 0) {
            result.minInitialHealth = Math.max(result.minInitialHealth, 1);
        }

        return result;
    }

    // Recursive function to explore all possible paths
    static void exploreMaze(int[][] maze, int row, int col, int health, int totalHealthLost, HealthResult result) {
        int rows = maze.length;
        int cols = maze[0].length;

        // Check if current position is out of bounds
        if (row < 0 || row >= rows || col < 0 || col >= cols)
            return;

        // Update health based on current cell
        health += maze[row][col];

        // Update total health lost
        if (health < 0) {
            totalHealthLost -= health;
            health = 0;
        }

        // Check if reached destination
        if (row == rows - 1 && col == cols - 1) {
            result.minInitialHealth = Math.min(result.minInitialHealth, health);
            result.totalHealthLost = totalHealthLost;
            return;
        }

        // Explore down
        exploreMaze(maze, row + 1, col, health, totalHealthLost, result);

        // Explore right
        exploreMaze(maze, row, col + 1, health, totalHealthLost, result);
    }

    public static void main(String[] args) {
        // Example maze
        int[][] maze = {{-2, -3, 2},
                {15, 30, -5},
                {-50, -20, 2}};

        HealthResult result = findMinimumInitialHealth(maze);

        System.out.println("Minimum initial health required: " + result.minInitialHealth);
        System.out.println("Total health lost along the path: " + result.totalHealthLost);
    }
}
