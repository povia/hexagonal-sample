package com.tistory.povia.tweetsample.tweet.adapter.in.web;

import com.tistory.povia.tweetsample.common.WebAdapter;
import com.tistory.povia.tweetsample.tweet.adapter.in.request.PostRequest;
import com.tistory.povia.tweetsample.tweet.application.port.in.PostTweetCommand;
import com.tistory.povia.tweetsample.tweet.application.port.in.PostTweetUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
@RequestMapping("tweet")
public class TweetPostController{
  private final PostTweetUseCase postTweetUseCase;

  @PostMapping("post")
  void postTweet(@RequestBody PostRequest req){
    PostTweetCommand command = new PostTweetCommand(req.userId(), req.body());
    postTweetUseCase.createPost(command);
  }
}
