package com.zipcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Rack {
    private List<Integer> rackOfBalls = new ArrayList<>();
    Random rand = new Random();

    public Rack(List<Integer> rackOfBalls) {
        this.rackOfBalls = rackOfBalls;
    }

    public Rack() {
    }

    public int numberInCurrentRack(){
        int num = rand.nextInt(1,4);
        if (num ==1 ){
            return 5;
        }
        if (num ==2 ){
            return 7;
        }
            return 15;

    }

    public int randomizerForNumbers(){
        int num = rand.nextInt(60);
       // System.out.println(num);
        return num;
    }

    public int generateListOfNumbersForRack(){

        int numberBallsInRack = numberInCurrentRack();
        int count = 0;

        while (count < numberBallsInRack) {
            int num = randomizerForNumbers();
            if (!rackOfBalls.contains(num)){
                rackOfBalls.add(num);
                count++;
            }
        }

        return rackOfBalls.size();
    }

    public List<Integer> sortRack(){
       // List<Integer> sortedRack = new ArrayList<>();
        for (int i = 0; i < rackOfBalls.size() - 1; i++) {
            for (int j = 0; j < rackOfBalls.size() - 1 - i; j++) {
                if (rackOfBalls.get(j+1) < rackOfBalls.get(j)) {
                    // swap
                    int temp = rackOfBalls.get(j);
                    rackOfBalls.set(j, rackOfBalls.get(j + 1));
                    rackOfBalls.set(j + 1, temp);
                }
            }
        }



        return rackOfBalls;
    }

    public List<Integer> getRackOfBalls() {
        return this.rackOfBalls;
    }

    public void setRackOfBalls(List<Integer> nums) {
        this.rackOfBalls = nums;
    }
}
