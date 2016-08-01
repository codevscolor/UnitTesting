package com.codevscolor.testing;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;



public class AdditionTest {

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);

        assertThat(2+2,is(4));
        assertThat(2+2,equalTo(4));
        assertThat(2+2,is(equalTo(4)));
    }

}
