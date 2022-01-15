package com.tistory.povia.tweetsample.tweet.adapter.in.web;

import com.tistory.povia.tweetsample.tweet.application.port.in.PostTweetUseCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.eq;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = TweetPostController.class)
class TweetPostControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private PostTweetUseCase postTweetUseCase;

  @Test
  @DisplayName("트윗 게시 테스트")
  void tweetPostTest() throws Exception {
    mockMvc.perform(post("").header("Content-Type", "application/json"))
      .andExpect(status().isOk());

//    then(sendMoneyUseCase).should()
//      .sendMoney(eq(new SendMoneyCommand(
//        new AccountId(41L),
//        new AccountId(42L),
//        Money.of(500L))));

  }

}