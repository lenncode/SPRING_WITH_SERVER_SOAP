//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.26 a las 03:55:59 AM PDT 
//


package com.cibertec.spring.soap.api.servicioproducto;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cibertec.spring.soap.api.servicioproducto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cibertec.spring.soap.api.servicioproducto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProductosResponse }
     * 
     */
    public GetProductosResponse createGetProductosResponse() {
        return new GetProductosResponse();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link GetProductoRequest }
     * 
     */
    public GetProductoRequest createGetProductoRequest() {
        return new GetProductoRequest();
    }

    /**
     * Create an instance of {@link GetProductosRequest }
     * 
     */
    public GetProductosRequest createGetProductosRequest() {
        return new GetProductosRequest();
    }

    /**
     * Create an instance of {@link GetProductoResponse }
     * 
     */
    public GetProductoResponse createGetProductoResponse() {
        return new GetProductoResponse();
    }

}
