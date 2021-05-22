package br.com.nex2you.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nex2you.api.entity.Location;
import br.com.nex2you.api.feign.EstadosClient;
import br.com.nex2you.api.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private EstadosClient estadosClient;

	@Override
	public List<Location> findEstados() {
		return estadosClient.findEstados();
	}

	@Override
	public List<Location> findMunicipios(int estadoId) {
		return estadosClient.findMunicipios(estadoId);
	}
}
