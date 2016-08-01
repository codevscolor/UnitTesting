package com.codevscolor.testing;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.LinkedList;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {

    @Mock
    Context mMockedContext;

    @Test
    public void test_when_thenReturn(){
        MainActivity activity = Mockito.mock(MainActivity.class);
        when(activity.getName()).thenReturn("MainActivity");
        assertThat(activity.getName(),is("MainActivity"));
    }

    @Test
    public void test_verify(){
        MainActivity activity = Mockito.mock(MainActivity.class);

        when(activity.getName()).thenReturn("MainActivity");
        when(activity.getNumber(anyInt())).thenReturn(0);

        //verify if getName() is never called
        verify(activity,never()).getName();

        //now call it one time
        activity.getName();

        //verify if it is called once
        verify(activity,atLeastOnce()).getName();

        //call getNumber method with a parameter
        activity.getNumber(1);

        //verify if getNumber was called with parameter 1
        verify(activity).getNumber(1);
    }

    @Test
    public void test_spy(){
        List list = new LinkedList();
        List spyList = spy(list);

        when(spyList.size()).thenReturn(200);

        assertThat(spyList.size(),is(200));
    }

}
