package com.test;

import org.junit.Test;
import com.proxy2.BookServiceImpl;
import com.proxy2.SubBookServiceImpl;

public class MyTest02 {

    @Test
    public void test02(){
        BookServiceImpl service = new SubBookServiceImpl();
        service.buy();

    }
}
