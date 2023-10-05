package no.hvl.ing303project.visTabell;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface ResturantEntityRepo extends JpaRepository<ResturantEntity, Long> {
}
