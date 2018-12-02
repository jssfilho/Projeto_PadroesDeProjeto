/*
 * To change this license header, choose License Headers in SujeitoConcreto Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import observerProject.mainfx;

public class Cadastro implements PaginaInicial{
    
  
    @FXML
    private TextField nomeUser;

    @FXML
    private TextField emailUser;

    @FXML
    private TextField cpfUser;

    @FXML
    private TextField bairro;

    @FXML
    private TextField rua;

    @FXML
    private TextField numEndereco;

    @FXML
    private TextField nomeLoja;

    @FXML
    private TextField cnpj;

    @FXML
    private RadioButton tipoUserV;
    
    @FXML
    private RadioButton tipoUserC;
    
    @FXML
    private Button cadastroBtn;

    @FXML
    private Button cancel;
    
    public FXMLLoader loader;
    
    
    public Cadastro() throws IOException{
        FXMLLoader loade = new FXMLLoader(getClass().getResource("cadastro.fxml"));
        this.loader=loade;
    }
    
    @FXML
    void onActComprador(ActionEvent event) {
        if(!this.nomeLoja.isDisable()){
            this.nomeLoja.setDisable(true);
            this.cnpj.setDisable(true);}
    }
    @FXML
    void onActVendedor(ActionEvent event) {
        if(this.nomeLoja.isDisable()){
            this.nomeLoja.setDisable(false);
            this.cnpj.setDisable(false);}
    }

    
    @FXML
    @Override
    public void cadastrar(ActionEvent event) {

    }

    @FXML
    void cancelVoid(ActionEvent event) {
        mainfx.OnChangeScene("Login");
    }

    @Override
    public FXMLLoader getParent() {
        return this.loader;
    }


}