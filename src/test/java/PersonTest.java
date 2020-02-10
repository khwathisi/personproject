import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    Person person = new Person("Ryan",30,"male",new String [] {"hardarse","agile","ssd hard drives"});

    @Test
    public void testPersonHello(){

        Assert.assertEquals(person.Hello(),"Hello, My name is Ryan and I am 30 years old." +
                " My interests are being a hardarse, agile and ssd hard drives.");
    }

    @Test
    public void testAge(){
        Assert.assertEquals(person.getAge(), 30);
    }

    @Test
    public void testGender(){
        Assert.assertEquals(person.getGender(), "male");
    }

    @Test
    public void testName(){
        Assert.assertEquals(person.getName(), "Ryan");
    }

}

