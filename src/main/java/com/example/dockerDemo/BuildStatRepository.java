public interface BuildStatRepository extends JpaRepository<BuildStat, Long> {
    List<BuildStat> findTop10ByOrderByTimestampDesc();
}
