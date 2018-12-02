/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactoryProject;

import java.awt.event.InputMethodEvent;
import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import observerProject.mainfx;

/**
 *
 * @author Joao Santos
 */
public class HomeAdm implements Home{
    public FXMLLoader loader;
    @FXML
    private Button config;

    @FXML
    private Button sair;

    @FXML
    private Button home;

    @FXML
    private Button saveProdBtn;
    
    @FXML
    private Label opcaoLbCadas;

    @FXML
    private TextField codCadastro;

    @FXML
    private TextField precoCadastro;

    @FXML
    private TextField nomeCadastro;

    @FXML
    private TextArea descriCadastro;

    @FXML
    private TextField opcaoCadastro;

    @FXML
    private TextField rmCod;

    @FXML
    private Button rmBtn;

    @FXML
    private TextField pesquisaEstoq;

    @FXML
    private Label mostraEstoq;

    @FXML
    private Label valorReceita;
    
    @FXML
    private RadioButton tipoCadastroAlim;

    @FXML
    private RadioButton tipoCadastroEletro;

    @FXML
    private RadioButton tipoCadastroVesti;
    
    public HomeAdm() throws IOException{
        FXMLLoader loade = new FXMLLoader(getClass().getResource("HomeAdm.fxml"));
        this.loader=loade;
    }
    
    @FXML
    void getProdEstoq(InputMethodEvent event) {
        
    }

    @FXML
    void cadastroAlimento(ActionEvent event) {
        this.opcaoLbCadas.setText("Válidade");
    }

    @FXML
    void cadastroEletro(ActionEvent event) {
        this.opcaoLbCadas.setText("Garantia");
    }

    @FXML
    void cadastroVesti(ActionEvent event) {
        this.opcaoLbCadas.setText("Tamanho");
    }

    @FXML
    void rmProduto(ActionEvent event) {
        
    }

    @FXML
    void salvaProduto(ActionEvent event) {
        
    }
    
    @Override
    @FXML
    public void clickHome() {
        mainfx.OnChangeScene("Home");
    }

    @Override
    @FXML
    public void clickEdite() {
        mainfx.OnChangeScene("Config");
    }

    @Override
    @FXML
    public void clickSair() {
        mainfx.OnChangeScene("Login");
    } 

    @Override
    public FXMLLoader getLoad() {
       return this.loader;
    }
    
}
