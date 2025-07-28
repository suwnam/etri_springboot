import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/stats")
public class BuildStatController {

    @Autowired
    BuildStatRepository repo;

    @PostMapping
    public ResponseEntity<BuildStat> save(@RequestBody BuildStat stat) {
        return ResponseEntity.ok(repo.save(stat));
    }

    @GetMapping("/recent")
    public List<BuildStat> recent() {
        return repo.findTop10ByOrderByTimestampDesc();
    }
}
