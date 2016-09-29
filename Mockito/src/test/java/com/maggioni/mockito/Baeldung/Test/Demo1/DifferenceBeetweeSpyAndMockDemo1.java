package com.maggioni.mockito.Baeldung.Test.Demo1;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

/*
 http://www.baeldung.com/mockito-spy
 */
@RunWith(MockitoJUnitRunner.class)
public class DifferenceBeetweeSpyAndMockDemo1 {

    @Spy
    List<String> spyList = new ArrayList<>();

    @Mock
    List<String> mockList = new ArrayList<>();
    
    @Test
    public void SpyDemo1() {
        
        spyList.add("one");
        spyList.add("two");
        
        Mockito.verify(spyList).add("one");
        Assert.assertEquals(2, spyList.size());
        
    }
    
    @Test
    public void SpyDemo2() {
        
        Mockito.when(spyList.size()).thenReturn(258);
        
        Assert.assertEquals(258, spyList.size());
    }
    
    @Test
    public void MockDemo1() {
        
        mockList.add("one");
        mockList.add("two");
        
        Mockito.verify(mockList).add("one");
        Assert.assertEquals(0, mockList.size()); // this is the main difference, the add() statement above do not add anything to the mock object
    }
}
