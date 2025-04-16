package com.zipcode;


import org.junit.Assert;
import org.junit.Test;

public class SortingCharactersTest {

    @Test
    public void verifyStringTest_removeSpaceAndSpecialCharacters(){
        //making sure string returns without special characters
        SortingCharacters sc = new SortingCharacters();
        String actualString = sc.verifyString("Sting% cart");

        String expectedString = "stingcart";

        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void verifyStringTest2_removeSpaceAndSpecialCharacters(){
        //making sure string returns without special characters
        SortingCharacters sc = new SortingCharacters();
        String actualString = sc.verifyString("Z7IpC$O!D#2E@&");

        String expectedString = "zipcode";

        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void verifyStringTest_isLowerCase_removeSpaceAndSpecialCharacters(){
        //making sure string returns without special characters and lower case
        SortingCharacters sc = new SortingCharacters();
        String actualString = sc.verifyString("CAPITAL ONE &&&");

        String expectedString = "capitalone";

        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void sortStringTest(){

        SortingCharacters sc = new SortingCharacters("CAPITAL ONE &&&");
        String actualString = sc.sortString();

        String expectedString = "aaceilnopt";

        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void sortStringTest2(){

        SortingCharacters sc = new SortingCharacters("When not studying nuclear physics, Bambi likes to play\n" +
                "beach volleyball.");
        String actualString = sc.sortString();

        String expectedString = "aaaaabbbbcccdeeeeeghhhiiiiklllllllmnnnnooopprsssstttuuvwyyyy";

        Assert.assertEquals(expectedString, actualString);
    }

}