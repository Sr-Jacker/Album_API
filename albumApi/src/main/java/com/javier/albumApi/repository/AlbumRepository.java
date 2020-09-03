package com.javier.albumApi.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.javier.albumApi.documents.Album;

@Repository
@CrossOrigin(value= {})
public interface AlbumRepository extends MongoRepository<Album, Serializable> {

	@RestResource(path="title",rel="title")
	public List<Album> findByTitle(@Param("title") String title);
	
	@RestResource(path="id",rel="id")
	public Album findById(@Param("id") Long id);
}
