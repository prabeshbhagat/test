package pack2;

import org.testng.annotations.Test;

public class ExampleTest {
@Test(groups={"sanity"})

public void accountSummaryTest(){
	System.out.println("account summary opened");
}
@Test(groups={"regression"})

public void accountTransferTest(){
	System.out.println("money transferred");
}
@Test(groups={"sanity"})

public void accountBalanceTest(){
	System.out.println("account balance shown");
}

}
