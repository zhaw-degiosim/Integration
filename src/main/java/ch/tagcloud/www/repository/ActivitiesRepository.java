package ch.tagcloud.www.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.tagcloud.www.model.Activities;

public interface ActivitiesRepository extends JpaRepository<Activities, Long>{
}
