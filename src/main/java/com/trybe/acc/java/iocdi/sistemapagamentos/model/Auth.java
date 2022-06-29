package com.trybe.acc.java.iocdi.sistemapagamentos.model;

public class Auth {
  private String usuario;
  private String senha;
  private String nivelDeAcesso;

  /**
   * contructor.
   */

  public Auth(String user, String pwd, String accessLvl) {
    super();
    this.usuario = user;
    this.senha = pwd;
    this.nivelDeAcesso = accessLvl;
  }

  public Auth() {
    super();
  }

}
