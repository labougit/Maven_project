package maven_group_project.maven_artifact_project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class FirstPdfTest extends TestCase{

    /*public void test() {
        fail("Not yet implemented");
    }
*/
     public FirstPdfTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FirstPdfTest.class );
    }




    public void test1() {
        assertTrue(true);
    }


}