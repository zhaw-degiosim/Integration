package ch.tagcloud.www.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.tagcloud.www.model.Workpackage;

public interface WorkpackageRepository extends JpaRepository<Workpackage, Long>{
}
