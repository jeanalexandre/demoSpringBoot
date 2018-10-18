package com.example.demo;

import com.example.demo.bo.Ask;
import com.example.demo.dao.AskRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AskResourceTest extends AbstractMethodError{

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    public AskRepository askRepository;

    @Test
    public void whenFindById_thenReturnAsk() {

        //given
        Ask ask1 = new Ask();
        ask1.setEntitled("ASK TEST 1");
        entityManager.persist(ask1);
        entityManager.flush();

        //when
        Ask found = askRepository.findById(ask1.getId()).orElse(null);

        //then
        Assert.assertNotNull(found);
        Assert.assertEquals(ask1.getId(), found.getId());
    }
}
