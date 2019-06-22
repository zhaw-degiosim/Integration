package ch.tagcloud.www.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.tagcloud.www.model.Projects;

public interface ProjectsRepository extends JpaRepository<Projects, Long>{
}
