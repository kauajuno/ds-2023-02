import org.example.NewtonCalculations;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDriver {


    @Test
    public void test000(){
        double sqrt = NewtonCalculations.ApproximateSQRT(16, 0.0001);
        Assert.assertEquals(4, sqrt, 0.01);
    }

    @Test
    public void test001(){
        double sqrt = NewtonCalculations.ApproximateSQRT(2, 0.25);
        Assert.assertEquals(1.5, sqrt, 0.01);
    }

    @Test
    public void test002(){
        double sqrt = NewtonCalculations.ApproximateSQRT(90, 0.0001);
        Assert.assertEquals(9.5, sqrt, 0.5);
    }

    @Test
    public void test003(){
        double sqrt = NewtonCalculations.ApproximateSQRT(25, 1);
        Assert.assertEquals(5, sqrt, 1);
    }

    @Test
    public void test004(){
        double sqrt = NewtonCalculations.ApproximateSQRT(792760337, 0.0001);
        Assert.assertEquals(28156, sqrt, 0.1);
    }

}
