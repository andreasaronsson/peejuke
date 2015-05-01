package nu.aron.peerjuke.server;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class DirlistTest {

    Dirlist testee;

    @Before
    public void setUp() {
        testee = new Dirlist();
    }

    @Test
    public void testDirList() throws Exception {
        assertThat(testee.dirList("/tmp"), notNullValue());
    }
}
