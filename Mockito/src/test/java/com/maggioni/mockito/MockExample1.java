package com.maggioni.mockito;

import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author maggioni
 */
@RunWith(MockitoJUnitRunner.class)
public class MockExample1 {

    public MockExample1() {
    }

    @Test
    public void  whenNotUseMockAnnotation_thenCorrect() {
        
        List mockList = Mockito.mock(ArrayList.class);
        
        mockList.add("one");
        Mockito.verify(mockList).add("one");
        Assert.assertEquals(0,mockList.size());
       
        Mockito.when(mockList.size()).thenReturn(100);
        Assert.assertEquals(100,mockList.size());
    }
    
}
