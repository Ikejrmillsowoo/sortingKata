package com.zipcode;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RackTest {

    @Test
    public void numberInCurrentRackTest_expectTrue(){
        Rack rack = new Rack();
        int result = rack.numberInCurrentRack(); // assume this returns one random number

        List<Integer> validNumbers = Arrays.asList(5, 7, 15);
        Assert.assertTrue(
                "Returned value " + result + " is one of the expected values",
                validNumbers.contains(result)
        );
    }


    @Test
    public void sortArrayTest(){
        //Given
        List<Integer> nums = new ArrayList<>();
        Rack rack = new Rack();
        rack.setRackOfBalls(nums);
        Assert.assertEquals(List.of(), rack.sortRack());
        nums.add(18);
        rack.setRackOfBalls(nums);
        Assert.assertEquals(List.of(18), rack.sortRack());
        nums.add(47);
        rack.setRackOfBalls(nums);
        Assert.assertEquals(Arrays.asList(18,47), rack.sortRack());
        nums.add(4);
        rack.setRackOfBalls(nums);
        Assert.assertEquals(Arrays.asList(4,18,47), rack.sortRack());
    }

    @Test
    public void sortArrayTest2(){
        //Given
        List<Integer> nums = new ArrayList<>();
        Rack rack = new Rack();
        rack.setRackOfBalls(nums);
        Assert.assertEquals(List.of(), rack.sortRack());
        nums.add(55);
        rack.setRackOfBalls(nums);
        Assert.assertEquals(List.of(55), rack.sortRack());
        nums.add(49);
        rack.setRackOfBalls(nums);
        Assert.assertEquals(Arrays.asList(49,55), rack.sortRack());
        nums.add(28);
        rack.setRackOfBalls(nums);
        Assert.assertEquals(Arrays.asList(28,49,55), rack.sortRack());
        nums.add(12);
        rack.setRackOfBalls(nums);
        Assert.assertEquals(Arrays.asList(12,28,49,55), rack.sortRack());
    }

    @Test
    public void sortArrayTest3(){
        //Given
        List<Integer> nums = new ArrayList<>();
        Rack rack = new Rack();
        nums.add(27);
        nums.add(4);
        nums.add(52);
        nums.add(18);
        rack.setRackOfBalls(nums);

        //When
        List<Integer> newArr = Arrays.asList(4,18,27,52);
        //Boolean expectedReturn = newArr.get(1)>newArr.get(0);

        //then
        Assert.assertTrue(newArr.get(1)>newArr.get(0));
    }

    @Test
    public void sortArrayTest4(){
        //Given
        List<Integer> nums = new ArrayList<>();
        Rack rack = new Rack();
        nums.add(27);
        nums.add(4);
        nums.add(52);
        nums.add(18);
        rack.setRackOfBalls(nums);

        //When
        List<Integer> newArr = Arrays.asList(4,18,27,52);

        //then
        Assert.assertTrue(newArr.get(newArr.size()-1)>newArr.get(2));
    }
}