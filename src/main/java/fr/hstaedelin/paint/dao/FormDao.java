package fr.hstaedelin.paint.dao;

import fr.hstaedelin.paint.polygons.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormDao extends JpaRepository<Form, Integer> {}

