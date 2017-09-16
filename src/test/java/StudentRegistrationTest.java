import static org.junit.Assert.*;
import org.junit.Test;

public class StudentRegistrationTest {

	@Test
	public void getUserNameTest() {
		Student s = new Student("EricMcEvoy", 21, "28/09/1995");
		String result1 = s.getName() + s.getAge();
		String result2 = s.getUsername();
		assertEquals(result1,result2);	
	}

}
