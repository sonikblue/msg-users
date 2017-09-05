package uk.co.sonikblue.msgusers.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageControllerTest {
    private MessageController messageController;

    @Before
    public void setUp() {
        this.messageController = new MessageController();
    }

    @Test
    public void getMessagesReturnsHelloWorld() {
        String expectedResponse = "Hello, World!";
        String actualResponse = messageController.getMessages();

        Assert.assertEquals("Get messages should return expected message.", expectedResponse, actualResponse);
    }
}
