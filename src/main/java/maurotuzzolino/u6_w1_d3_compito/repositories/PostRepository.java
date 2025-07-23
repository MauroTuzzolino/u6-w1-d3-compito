package maurotuzzolino.u6_w1_d3_compito.repositories;

import maurotuzzolino.u6_w1_d3_compito.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}