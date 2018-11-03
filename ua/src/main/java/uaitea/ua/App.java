package uaitea.ua;
import static org.mockito.Mockito.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Dog dog1=new Dog();
        Dog dog2=new Dog ("Krevedko", 666);
        System.out.println(dog1);
        System.out.println(dog2);
        Dog mockDog=mock(Dog.class);
        System.out.println(mockDog.toString());
        System.out.println(mockDog.getName());
        mockDog.setName("SS");
        verify(mockDog).setName("SS");
        verify(mockDog).getName();
        when(mockDog.getName()).thenReturn("Muller");
        System.out.println(mockDog.getName());
        //when(mockDog.getAge()).thenThrow(new RunTimeException());
        when(mockDog.getAge()).thenReturn(11).thenReturn(22).thenReturn(33);
        
        System.out.println(mockDog.getAge());
        System.out.println(mockDog.getAge());
        System.out.println(mockDog.getAge());
        System.out.println(mockDog.getAge());
        System.out.println(mockDog.getName());
        
        verify(mockDog,times(2)).getName();
        verify(mockDog,atLeast(2)).getName();
        verify(mockDog,atMost(4)).getName();
        Dog spyDog=mock(Dog.class);
        System.out.println(spyDog.getName());
        
    
    }
}
