import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;
import static org.testng.AssertJUnit.*;

public class CashbackHackServiceTests {

    @Test
    public void belowThousandPurchase(){
        CashbackHackService service = new CashbackHackService();
        int amount = 200;
        int actual = service.remain(amount);
        int result = 800;
        assertEquals(result, actual);
    }

    @Test
    public void noNeedPurchase(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int result = 0;
        assertEquals(result, actual);
    }

    @Test
    public void aboveThousandPurchase(){
        CashbackHackService service = new CashbackHackService();
        int amount = 2800;
        int actual = service.remain(amount);
        int result = 200;
        assertEquals(result, actual);
    }

    @Test
    public void errorPurchase(){
        CashbackHackService service = new CashbackHackService();
        int amount = -1000;
        int actual = service.remain(amount);
        int result = 0;
        assertEquals(result, actual);
    }
}
