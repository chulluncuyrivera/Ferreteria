/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;
  
import Dao.CategoriaDao;
import entidades.Categoria;

/**
 *
 * @author USUARIO
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CategoriaDao catedao=new CategoriaDao();
        Categoria cate =new Categoria(10,"Metales",'A');
        
        catedao.guardar(cate);
    }
    
}
