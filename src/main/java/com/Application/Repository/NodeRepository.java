package com.Application.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Application.Model.Node;

@Repository
public interface NodeRepository extends MongoRepository<Node, Long>{
	Node findByNodeName(String name);
}
