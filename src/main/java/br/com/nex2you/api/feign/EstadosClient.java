package br.com.nex2you.api.feign;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.nex2you.api.entity.Location;

@FeignClient(name = "estados-service", url = "${api.url}")
@RibbonClient(name = "estados-service")
public interface EstadosClient {

	@GetMapping
	public List<Location> findEstados();

	@GetMapping("/{estadoId}/distritos")
	public List<Location> findMunicipios(@PathVariable int estadoId);
}
