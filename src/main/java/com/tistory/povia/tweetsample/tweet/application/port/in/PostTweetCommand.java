package com.tistory.povia.tweetsample.tweet.application.port.in;

import com.tistory.povia.tweetsample.common.SelfValidating;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PostTweetCommand extends SelfValidating {
  private final Long postUserId;
  private final String body;

  public Long postUserId(){
    return postUserId;
  }

  public String body(){
    return body;
  }
}
