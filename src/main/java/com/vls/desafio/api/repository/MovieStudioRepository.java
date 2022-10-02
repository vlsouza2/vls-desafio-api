package com.vls.desafio.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vls.desafio.api.entity.MovieStudio;
import com.vls.desafio.api.entity.MovieStudioId;

public interface MovieStudioRepository extends JpaRepository<MovieStudio, MovieStudioId>{

}
