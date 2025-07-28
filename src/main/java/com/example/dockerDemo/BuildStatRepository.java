import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BuildStatRepository extends JpaRepository<BuildStat, Long> {
    List<BuildStat> findTop10ByOrderByTimestampDesc();
}
