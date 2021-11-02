package com.robson.os.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robson.os.domain.Cliente;
import com.robson.os.domain.OS;
import com.robson.os.domain.Tecnico;
import com.robson.os.domain.enuns.Prioridade;
import com.robson.os.domain.enuns.Status;
import com.robson.os.repositories.ClienteRepository;
import com.robson.os.repositories.OSRepository;
import com.robson.os.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private OSRepository osRepository;
	
	public void instanciaDB() {

		Tecnico t1 = new Tecnico(null, "Valdir Cesar", "669.506.270-68", "(88)98888-8888");
		Cliente c1 = new Cliente(null, "Betina Campos", "397.562.960-62", "(88)98778-8888");
		OS os1 = new OS(null, Prioridade.ALTA, "Teste create OD", Status.ANDAMENTO, t1, c1);
		
		t1.getList().add(os1);
		c1.getList().add(os1);
		
		tecnicoRepository.saveAll(Arrays.asList(t1));
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));
		
	}
}
