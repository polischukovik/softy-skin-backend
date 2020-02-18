package com.softyskin.photoupload;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class PhotoController {
	
	@Autowired
	private PhotoService photoService;
	
	@PostMapping("/photos/add")
	public ResponseEntity<String> addPhoto(@RequestParam("image") MultipartFile image) 
	  throws IOException {
	    String id = photoService.addPhoto(image);
	    return ResponseEntity
	    		.ok()
	    		.contentType(MediaType.APPLICATION_JSON)
	    		.body(id);
	}
	
	@GetMapping("/photos/{id}")
	public ResponseEntity<byte[]> getPhoto(@PathVariable String id) {
	    return photoService.getPhoto(id)
	            .map( photo -> ResponseEntity.ok().contentType(MediaType.IMAGE_PNG).body(photo.getImage().getData()) )
	            .orElseGet( () -> ResponseEntity.notFound().build() );
	}
}
