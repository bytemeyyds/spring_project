package com.test;

import com.proxy4.*;
import org.junit.Test;
import org.proxy4.*;

public class MyTest04 {
    @Test
    public void test04(){
        Service agent = new Agent(new BookServiceImpl(),new TransAop());
        Service agent1 = new Agent(agent,new LogAop());

        agent1.buy();
    }
}
