package TestReg;

import main.java.Arguments;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestArguments {
    Arguments arguments = new Arguments();

    @Test
    public void testSumArguments (){
        Assert.assertEquals(5, arguments.sumArguments("5"));
    }
 }
