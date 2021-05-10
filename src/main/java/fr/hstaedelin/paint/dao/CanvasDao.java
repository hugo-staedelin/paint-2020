package fr.hstaedelin.paint.dao;

import fr.hstaedelin.paint.polygons.Canvas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CanvasDao extends JpaRepository<Canvas, Integer> {}
