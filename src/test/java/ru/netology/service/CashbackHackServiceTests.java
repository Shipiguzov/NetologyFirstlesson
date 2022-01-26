package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTests {

    @Test
    public void belowThousandPurchase(){
        CashbackHackService service = new CashbackHackService();
        int amount = 200;
        int actual = service.remain(amount);
        int result = 800;
        Assert.assertEquals(actual, result);
    }

    @Test
    public void noNeedPurchase(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int result = 1000;
        Assert.assertEquals(actual, result);
    }

    @Test
    public void aboveThousandPurchase(){
        CashbackHackService service = new CashbackHackService();
        int amount = 2800;
        int actual = service.remain(amount);
        int result = 200;
        Assert.assertEquals(actual, result);
    }

    @Test
    public void errorPurchase(){
        CashbackHackService service = new CashbackHackService();
        int amount = -1000;
        int actual = service.remain(amount);
        int result = 0;
        Assert.assertEquals(actual, result);
    }
}
