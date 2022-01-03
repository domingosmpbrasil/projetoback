package com.javabank.power.controller;

import com.javabank.power.dao.BaseContaDao;

@RestController
public class BaseContaController {
@Autowired
private BaseContaDao dao;
@GetMapping("/contas")
public List<BaseConta> consultarConta(){
return (List<BaseConta>) dao.findAll();
}

@GetMapping(/contas/{numero})
public BaseConta consultarPelaConta(@PathVariable int numero) {
return dao.findById(numero).orElse(null);
}

@GetMapping("/Contas/saldo")

}
