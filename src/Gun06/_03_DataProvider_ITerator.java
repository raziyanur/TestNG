package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_DataProvider_ITerator {
    @Test(dataProvider = "getData")
    void UsernameTest(String username){
        System.out.println("username = " + username);
    }
    @DataProvider
    public Iterator<Object> getData(){
       List<Object> data=new ArrayList<>();
        data.add("raziya");
        data.add("ahmet");
        data.add("muni");
        data.add("modu");
        data.add("omay");
        return data.iterator();
    }
/**********************************************/


@Test(dataProvider = "getData2")
void UsernameTest2(String username,String password){
    System.out.println("username = " + username+ ", password="+password);
}
    @DataProvider
    public Iterator<Object[]> getData2(){
        List<Object[]> data=new ArrayList<>();
        data.add(new Object[]{"raziya","12345"});
        data.add(new Object[]{"ahmet","1hgrr"});
        data.add(new Object[]{"omai","fghdh"});
        data.add(new Object[]{"muni","5667"});
        data.add(new Object[]{"modu","2345"});
        return data.iterator();
    }
}
