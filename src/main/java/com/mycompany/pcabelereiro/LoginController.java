/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pcabelereiro;

import Cabelereiro.DAO.UsuarioDAO;
import Cabelereiro.gui.TelaClientes;
import Cabelereiro.gui.TelaLogin;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class LoginController {

    public void logarUsuario(TelaLogin telaL) throws SQLException {
        UsuarioDAO usuario = new UsuarioDAO();
        boolean loginValido = usuario.validarlogin(telaL.getTxtNome().getText(), telaL.getTxtSenha().getText());
        
        if (loginValido) {
            JOptionPane.showMessageDialog(telaL, "Login realizado com sucesso");
            // Abre a TelaClientes
            TelaClientes telaClientes = new TelaClientes();
            telaClientes.setVisible(true);
            telaL.dispose(); // Fecha a tela de login após login bem-sucedido
        } else {
            JOptionPane.showMessageDialog(telaL, "ERRO! Verifique se os campos estão corretos");
        }
    }
} 

