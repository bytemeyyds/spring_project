package com.test;

import com.proxy5.BookServiceImpl;
import com.proxy5.ProxyFactory;
import com.proxy5.Service;
import com.proxy5.TransAop;
import org.junit.Test;

public class MyTest05 {
    @Test
    public void test05(){
        Service agent = (Service) ProxyFactory.getAgent(new BookServiceImpl(), new TransAop());
        agent.buy();
        agent.show();
    }
}
