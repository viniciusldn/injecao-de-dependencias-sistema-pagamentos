package com.trybe.acc.java.iocdi.sistemapagamentos.service;

import com.trybe.acc.java.iocdi.sistemapagamentos.model.Auth;
import com.trybe.acc.java.iocdi.sistemapagamentos.model.Payment;
import com.trybe.acc.java.iocdi.sistemapagamentos.repository.PagamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

  @Autowired
  private PagamentoRepository pagamentoRepo;
  @Autowired
  private AuthConfigService authCfgSvc;

  public Auth validarLogin(Auth auth) {
    return authCfgSvc.fazerLogin(auth);
  }

  public Payment criarPagamento(Payment pagamento) {
    return pagamentoRepo.criarPagamento(pagamento);
  }

}
