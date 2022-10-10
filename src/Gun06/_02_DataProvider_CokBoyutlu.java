package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider_CokBoyutlu {
    @Test(dataProvider = "getData")
    void UsernameTest(String username, String password){
        System.out.println("username = " + username+", password="+password);
    }
    @DataProvider
    public Object[][] getData(){
        Object[][] data={
        {"raziye","123456"},
        {"ahmet","123456"},
        {"moldur","789456"},
        {"munira","jijhhii"},
        {"omar","huoh"}
        };

        return data;
    }


}
