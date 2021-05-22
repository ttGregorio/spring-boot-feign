package br.com.nex2you.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.nex2you.api.entity.Location;
import br.com.nex2you.api.service.LocationService;

@RestController
public class LocationController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private LocationService locationService;

	@GetMapping
	public ResponseEntity<List<Location>> listEstados() {
		return ResponseEntity.ok(locationService.findEstados());
	}

	@GetMapping("{estadoId}")
	public ResponseEntity<List<Location>> listMunicipios(@PathVariable int estadoId) {
		return ResponseEntity.ok(locationService.findMunicipios(estadoId));
	}

}
