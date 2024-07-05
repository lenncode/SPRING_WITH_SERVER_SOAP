package com.cibertec.spring.soap.api.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductoRepository {

	 @Autowired
     JdbcTemplate template;

/*
	 
	 public int saveProducto(Producto p){
			String query="insert into tb_producto values(null,?,?,?,?)";
			
		    return template.update(query,p.getNombre(),p.getStock(),p.getPrecio(),p.getMarca().getId());
	 }
	 
	 public int updateProducto(Producto p){
			String query="update tb_producto set nom_pro=?,stock_pro=?,pre_pro=?,cod_mar=? where id_pro=?";
			
		    return template.update(query,p.getNombre(),p.getStock(),p.getPrecio(),p.getMarca().getId(),p.getId());
	 }
	 
	 
	 public List<Producto> listProductos(){
		 String sql="select id_pro,nom_pro,stock_pro,pre_pro,p.cod_mar,nom_mar from tb_producto p join tb_marca m on p.cod_mar=m.cod_mar";
		 
	        List<Producto> items = template.query(sql,
	        					(result,rowNum)->new Producto(result.getInt(1),result.getString(2),result.getInt(3),
	        							result.getBigDecimal(4),new Marca(result.getInt(5),result.getString(6))));
	        return items;
	 }
	 public int deleteProducto(int cod){
			String query="delete from tb_producto where id_pro=?";
			
		    return template.update(query,cod);
	 }
	 public Producto findProducto(int cod){
		 String sql="select id_pro,nom_pro,stock_pro,pre_pro,p.cod_mar,nom_mar from tb_producto p join tb_marca m on p.cod_mar=m.cod_mar where id_pro=?";
		 
		 return template.queryForObject(sql, new Object[]{cod}, (result, rowNum) ->
         new Producto(
        		 result.getInt(1),result.getString(2),result.getInt(3),
					result.getBigDecimal(4),new Marca(result.getInt(5),result.getString(6))
         ));
	 }
	 
	 public List<Marca> listMarcas(){
		 String sql="select *from tb_marca";
		 
	        List<Marca> items = template.query(sql,
	        					(result,rowNum)->new Marca(result.getInt(1),result.getString(2)));
	        return items;
	 }
	 
	*/ 
 
	 
}



