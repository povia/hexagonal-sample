package com.tistory.povia.tweetsample.tweet.adapter.out.persistence;

import com.tistory.povia.tweetsample.common.AbstractDateAudit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserJpaEntity extends AbstractDateAudit {

  @Id
  @GeneratedValue
  private Long id;

  private boolean banned;

}
