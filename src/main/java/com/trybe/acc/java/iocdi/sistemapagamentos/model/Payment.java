package com.trybe.acc.java.iocdi.sistemapagamentos.model;

public class Payment {
  private String id;
  private String valor;

  /**
   * Instantiates a new payment.
   *
   * @param id    the id
   * @param valor the valor
   */
  public Payment(String id, String valor) {
    super();
    this.id = id;
    this.valor = valor;
  }

  public Payment() {
    super();
  }

}
