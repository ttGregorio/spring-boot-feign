package br.com.nex2you.api.service;

import java.util.List;

import br.com.nex2you.api.entity.Location;

public interface LocationService {

	List<Location> findEstados();

	List<Location> findMunicipios(int estadoId);

}