import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testEmptyName(){

        Person person = new Person("Ryan",30,"male",new String [] {"hardarse","agile","ssd hard drives"});
        Assert.assertEquals(person.Hello(),"Hello, My name is Ryan and I am 30 years old." +
                " My interests are being a hardarse, agile and ssd hard drives.");

    }

}

