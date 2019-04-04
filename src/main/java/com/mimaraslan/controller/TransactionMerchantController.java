package com.mimaraslan.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mimaraslan.message.request.TransactionMerchantForm;
import com.mimaraslan.model.entity.CustomerInfo;
import com.mimaraslan.model.entity.Data;
import com.mimaraslan.model.entity.Query;
import com.mimaraslan.model.entity.Report;
import com.mimaraslan.model.entity.Response;
import com.mimaraslan.repository.ClientRepository;
import com.mimaraslan.repository.DataRepository;
import com.mimaraslan.repository.QueryRepository;
import com.mimaraslan.repository.ReportRepository;
import com.mimaraslan.repository.ResponseRepository;

@RestController
@RequestMapping("/api/v3")
public class TransactionMerchantController {

	// http://localhost:8080/api/v3/hello
	@GetMapping("/hello")
	public String greetingHello() {
		return "Hello World";
	}	
	
//TRANSACTION​ ​REPORT
	@Autowired
	ReportRepository reportRepository;

	// http://localhost:8080/api/v3/transactions/report
	@PostMapping("/transactions/report")
	public List<Report> transactionsReport(@Valid @RequestBody TransactionMerchantForm transcationMerchantRequest) {
		return reportRepository.findAll();
	}
	 
 
	
//TRANSACTION​ ​QUERY
	@Autowired
	QueryRepository queryRepository;
	
	// http://localhost:8080/api/v3/transaction/list
	@PostMapping("/transaction/list")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public List<Query> transcationsList(@Valid @RequestBody TransactionMerchantForm transcationMerchantRequest) {
		return queryRepository.findAll();
	}

	

//GET​ ​TRANSACTION
	@Autowired
	DataRepository dataRepository;

	//	http://localhost:8080/api/v3/transaction
	@PostMapping("/transaction")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public List<Data> transaction(@Valid @RequestBody TransactionMerchantForm transcationMerchantRequest) {
		return dataRepository.findAll();
	}



//GET​ ​CLIENT
	@Autowired
	ClientRepository clientRepository;

	//	http://localhost:8080/api/v3/client
	@PostMapping("/client")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public List<CustomerInfo> client(@Valid @RequestBody TransactionMerchantForm transcationMerchantRequest) {
		return clientRepository.findAll();
	}



//TRANSACTION​ ​RESPONSE
	@Autowired
	ResponseRepository responseRepository;

	//	http://localhost:8080/api/v3/transactions/responses
	@GetMapping("/transactions/responses")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public List<Response> getAllResponses() {
		return responseRepository.findAll();
	}
	
}