import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class BuildStat {
    @Id @GeneratedValue
    private Long id;

    private String jobName;
    private String status;
    private Long duration;
    private Integer buildNumber;
    private LocalDateTime timestamp = LocalDateTime.now();
}
