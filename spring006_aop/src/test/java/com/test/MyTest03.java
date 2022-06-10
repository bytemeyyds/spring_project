package com.test;

import org.junit.Test;
import com.proxy3.Agent;
import com.proxy3.BookServiceImpl;
import com.proxy3.Service;

public class MyTest03 {
    @Test
    public void test03(){
        Service agent = new Agent(new BookServiceImpl());
        agent.buy();
    }
}
