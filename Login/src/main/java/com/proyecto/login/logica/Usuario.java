package com.proyecto.login.logica;

public class Usuario {
    
    private int id;
    private String userName;
    private String pass;

    public Usuario(int id, String userName, String pass) {
        this.id = id;
        this.userName = userName;
        this.pass = pass;
    }

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", userName=" + userName + ", pass=" + pass + '}';
    }
    
    
    
}
