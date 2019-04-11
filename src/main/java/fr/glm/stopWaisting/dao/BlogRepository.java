package fr.glm.stopWaisting.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.glm.stopWaisting.entities.Blog;

public interface BlogRepository extends JpaRepository<Blog, Long> {

}
