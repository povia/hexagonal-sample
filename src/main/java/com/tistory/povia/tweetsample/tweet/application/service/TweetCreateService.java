package com.tistory.povia.tweetsample.tweet.application.service;

import com.tistory.povia.tweetsample.tweet.application.port.in.PostTweetCommand;
import com.tistory.povia.tweetsample.tweet.application.port.in.PostTweetUseCase;

public class TweetCreateService implements PostTweetUseCase {
  @Override
  public boolean createPost(PostTweetCommand command) {
    return false;
  }
}
