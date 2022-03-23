package site.metacoding.searchtable.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
    @Query(value = "SELECT * FROM board WHERE title LIKE %:keyword%", nativeQuery = true)
    List<Board> mSearch(@Param("keyword") String keyword);
}
