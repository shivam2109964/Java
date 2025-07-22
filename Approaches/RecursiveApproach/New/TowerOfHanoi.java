package Approaches.RecursiveApproach.New;

import java.util.Stack;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3; // number of disks

        // Create 3 rods as stacks
        Stack<Integer>[] rods = new Stack[3];
        for (int i = 0; i < 3; i++) {
            rods[i] = new Stack<>();
        }

        // Initialize rod A with disks: largest (bottom) to smallest (top)
        for (int i = n; i >= 1; i--) {
            rods[0].push(i); // rod A is rods[0]
        }

        // Solve Tower of Hanoi: from rod 0 to rod 2 using rod 1
        solveHanoi(n, rods[0], rods[2], rods[1], "A", "C", "B");
    }

    public static void solveHanoi(int n, Stack<Integer> fromRod, Stack<Integer> toRod, Stack<Integer> auxRod,
            String from, String to, String aux) {
        if (n == 0)
            return;

        // Step 1: Move n-1 disks from 'fromRod' to 'auxRod'
        solveHanoi(n - 1, fromRod, auxRod, toRod, from, aux, to);

        // Step 2: Move the nth disk from 'fromRod' to 'toRod'
        int disk = fromRod.pop();
        toRod.push(disk);
        System.out.println("Move disk " + disk + " from " + from + " to " + to);

        // Step 3: Move n-1 disks from 'auxRod' to 'toRod'
        solveHanoi(n - 1, auxRod, toRod, fromRod, aux, to, from);
    }
}
