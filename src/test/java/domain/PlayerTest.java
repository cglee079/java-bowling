package domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test(expected = IllegalArgumentException.class)
    public void 이름길이() {
        new Player("aaaaaa");
    }

    @Test
    public void 이름길이2() {
        new Player("aaaaa");
    }

    @Test(expected = IllegalArgumentException.class)
    public void 영어아닌이름() {
        new Player("콜린");
    }

    @Test
    public void 영어이름() {
        new Player("colin");
    }
}