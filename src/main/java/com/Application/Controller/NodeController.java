package com.Application.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Application.Model.Node;
import com.Application.Repository.NodeRepository;

@RestController
@RequestMapping(value="/")
public class NodeController {

	@Autowired
	NodeRepository nodeRepository;
	
	@CrossOrigin
	@RequestMapping(value="addNode" , method= RequestMethod.POST)
	public String addNode(@RequestBody Node node)
	{
		nodeRepository.save(node);
		return "{\"message\":\"New Node added successfully\" }";
	}
	@CrossOrigin
	@RequestMapping(value="getAllNode" , method= RequestMethod.GET)
	public @ResponseBody List<Node> getAllNode() throws Exception
	{
		return nodeRepository.findAll();
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	   public ResponseEntity<String> get() {
	       return new ResponseEntity<String>("Welcome to Logistic App", HttpStatus.OK);
	   }
	
	
}
