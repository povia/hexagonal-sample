package com.tistory.povia.tweetsample.tweet.application.port.in;

public interface PostTweetUseCase {
  boolean createPost(PostTweetCommand command);
}
