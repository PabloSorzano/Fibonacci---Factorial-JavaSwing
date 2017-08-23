/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci.factorial;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Pablo sorzano torres, Yin chew wah
 * 
 */
public class FibonacciFactorial extends JFrame implements ActionListener {
    private JTextField numero, result;//declaramos un campo de texto editable para el numero y el resultado 
    private JLabel resultado, nomero, obtener;//declaramos tres campos de texto ineditables   
    private JRadioButton Factorial, Fibonacci;//declaramos dos botones de tipo radio para elegir el cálculo deseado
    private JButton calcular;//declaramos                     
    Metodos metodo= new Metodos();
            
    FibonacciFactorial(){//constructor de la clase
        iniciarVentana();
        inicializarComponentes();
    }

    public void iniciarVentana(){
        this.setTitle("FIBONACCI-FACTORIAL");                   // colocamos titulo a la ventana
        this.setSize(400,300);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    public void inicializarComponentes(){
        nomero = new JLabel("AreaNumero");//texto ineditable de numero
        nomero.setBounds(50, 20, 60, 20);
        nomero.setText("Numero: ");
        nomero.setVisible(true);
        this.add(nomero);
        
        numero= new JTextField("Numero"); //numero a ingresar
        numero.setBounds(150, 20, 80, 20);
        numero.setText("");
        numero.setVisible(true);
        this.add(numero);
        
        obtener = new JLabel("AreaSelección");//texto ineditable para la selección  del cálculo
        obtener.setBounds(50, 60, 60, 20);
        obtener.setText("Obtener");
        obtener.setVisible(true);
        this.add(obtener);
        
        Fibonacci = new JRadioButton("Fibonacci");//fibonacci (botón de radio)
        Fibonacci.setBounds(150, 60, 100, 20);
        Fibonacci.addActionListener(this);
        Fibonacci.setVisible(true);
        this.add(Fibonacci);
        
        Factorial = new JRadioButton("Factorial");//factorial (botón de radio)
        Factorial.setBounds(150, 100, 100, 20);
        Factorial.addActionListener(this);
        Factorial.setVisible(true);
        this.add(Factorial);
        
        calcular =  new JButton("Calcular");//botón para accionar el cálculo deseado
        calcular.setBounds(50, 140, 180, 40);
        calcular.setVisible(true);
        calcular.addActionListener(this);
        this.add(calcular);
        
        resultado = new JLabel("Resultado: ");//texto ineditable para el resultado
        resultado.setBounds(50, 200, 100, 20);
        resultado.setVisible(true);
        this.add(resultado);
        
        result = new JTextField();//resultado obtenido
        result.setBounds(150, 200, 200, 20);
        result.setVisible(true);
        this.add(result);
        
        
       
        
    }
    
        @Override public void actionPerformed(ActionEvent e) {
            Metodos obj = new Metodos();
             if(e.getSource()==calcular){//si el botón calcular es presionado
                 if(Factorial.isSelected()){//si la opción factorial está seleccionada
                        if(numero.getText().equals("")||numero.getText().equals("0")){//si no hay nada en el número o tiene un  0
                        JOptionPane.showMessageDialog(rootPane, "Valor ingresado incorrecto");
                        numero.setText("");
                        }else{
                            obj.factorial(numero.getText());//método instanciado de Métodos
                            result.setText(String.valueOf(obj.getFactorial()));
                        }
                     
                 }else if(Fibonacci.isSelected()){//si la opción fibonacci está seleccionada
                        if(numero.getText().equals("")||numero.getText().equals("0")){//si no hay nada en el número o tiene un  0
                        JOptionPane.showMessageDialog(rootPane, "Valor ingresado incorrecto");
                        numero.setText("");
                        }else{
                            obj.fibonacci(numero.getText());//método instanciado de Métodos
                            result.setText(String.valueOf(obj.getFibonacci()));
                        }
                 }else if(numero.getText().equals("")||numero.getText().equals("0")){//si nada ha sido seleccionado
                        JOptionPane.showMessageDialog(rootPane, "Seleccione una opción a calcular primero");
                        }else{
                            
                        }
             }else if(e.getSource()==Factorial){//si el botón factorial es seleccionado
                 Fibonacci.setSelected(false);//de-selecciona el botón fibonacci
                 
             }else if(e.getSource()==Fibonacci){//si el botón fibonacci es seleccionado
                 Factorial.setSelected(false);//de-selecciona el botón factorial
                
             }
		
         
	}
    /**
     * @param args the command line arguments
     **/
    
    
    
}
