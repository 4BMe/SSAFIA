package s05.p12a104.mafia.domain.dao;

import io.openvidu.java.client.OpenViduRole;
import java.time.LocalDateTime;
import java.util.Map;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;
import s05.p12a104.mafia.domain.entity.GamePhase;
import s05.p12a104.mafia.domain.entity.GameState;

@Getter
@Slf4j
@RedisHash("GameSession")
@Builder
public class GameSessionDao {

  @Id
  private final String roomId;

  private final int day;

  private final int phaseCount;

  private final boolean night;

  @Indexed
  private final String creatorEmail;

//  private final Map<String, String> playerId;

  private final String accessType;

  private final String roomType;

  @Enumerated(EnumType.STRING)
  private final GameState state;

  @Enumerated(EnumType.STRING)
  private final GamePhase phase;

  private final LocalDateTime createdTime;

  private final LocalDateTime finishedTime;

  private final String lastEnter;

  private final String sessionId;

  private final String masterId;

  private final Map<String, OpenViduRole> mapSessionNamesTokens;

}