package com.empresa.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.empresa.entity.Medicamento;
import com.empresa.service.MedicamentoService;

import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
@RestController
@RequestMapping("/rest/medicamento")
public class MedicamentoController {
	
	@Autowired
	private MedicamentoService service;
	
	@GetMapping
	public ResponseEntity<List<Medicamento>> lista(){
		log.info(">>> inicio >>> lista ");
		List<Medicamento> lstMedicamento = service.listaMedicamento();
		return ResponseEntity.ok(lstMedicamento);
	}
	
	
	
}



