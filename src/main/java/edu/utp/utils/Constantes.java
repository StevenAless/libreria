package edu.utp.utils;

/**
 *
 * @author Efrain Figueroa <efrain.figue.95@gmail.com>
 */
public class Constantes {

    public static final String[] cabeceras_ventas = {
        "Fecha Emisión", "Tipo Comprobante", "Nº Comprobante", "Vendedor", "Cliente", "RUC/Nº DOC", "Moneda", "Código", "Descripción", "Cantidad", "Precio Unitario", "Monto Neto", "IGV", "Precio Total"
    };

    public static final String[] cabecerasProducto = {
        "Producto", "Descripción", "Cantidad", "Valor Unitario", "Precio Unitario", "Monto Neto", "IGV", "Importe Total", "Cantidad de Comprobantes"
    };

    public static final String[] cabecerasCliente = {
        "Ruc Receptor", "Razón Social Receptor", "Moneda", "  Cantidad  ", "Base Imponible", "      IGV      ", "   Total   "
    };

    public static final String[] cabecerasRegistroVenta = {
        "ORG",
        "Nº VOU",
        "Fº Emision",
        "Fº Venc",
        "Datos del comprobante",
        "",
        "",
        "Referencia del comprobante",
        "",
        "",
        "",
        "Informacion del cliente",
        "",
        "",
        "Valor Facturado de la exportacion",
        "Base imponible de la operacion Gravada",
        "Imp. Total de la operacion",
        "",
        "I.S.C",
        "I.G.V",
        "Otros tributos",
        "Total",
        "T/C"
    };

    public static final String[] cabecerasRegistroVentaNivel2 = {
        "ORG",
        "Nº VOU",
        "Fº Emision",
        "Fº Venc",
        "T/D",
        "Serie",
        "Numero",
        "Fecha",
        "T/D",
        "Serie",
        "Numero",
        "Doc",
        "Numero",
        "Razon Social",
        "Valor Facturado de la exportacion",
        "Base imponible de la operacion Gravada",
        "Exonerado",
        "Inafecto",
        "I.S.C",
        "I.G.V",
        "Otros tributos",
        "Total",
        "T/C"
    };

    public static final String FECHAEMISION = "fecha-emision";
    public static final String TIPOCOMPROBANTE = "tipo-comprobante";
    public static final String SERIECORRELATIVO = "serie-correlativo";
    public static final String CLIENTE = "cliente";
    public static final String EMISOR = "emisor";
    public static final String TOTALES = "totales";
    public static final String TIPODOCUMENTO = "tipo-documento";
    public static final String NUMERODOCUMENTO = "numero-documento";
    public static final String NUMERODOCUMENTOCLIENTE = "numero-documento-cliente";
    public static final String NUMERODOCUMENTOEMISOR = "numero-documento-emisor";
    public static final String RAZONSOCIAL = "razon-social";
    public static final String VENDEDOR = "vendedor";

    public static final String TIPOMONEDA = "tipo-moneda";

    public static final String ITEMS = "items";
    public static final String ITEMCANTIDAD = "cantidad";
    public static final String ITEMCODIGOPRODUCTO = "codigo-producto";
    public static final String ITEMUNIDADMEDIDA = "unidad-medida";
    public static final String ITEMDESCRIPCION = "descripcion";
    public static final String ITEMPRECIOUNITARIO = "precio-unitario";
    public static final String ITEMPRECIOVENTA = "precio-venta";
    public static final String ITEMTOTALITEM = "total-item";
    //public static final String ITEMTOTALITEMPRODUCTO = "total-item-producto";
    public static final String ITEMDESCUENTO = "item-descuento";
    public static final String TOTALESTOTALIMPUESTOS = "totales-total-impuestos";
    public static final String ITEMTOTALIMPUESTOS = "total-impuestos";
    public static final String ITEMTOTALSINIMPUESTOS = "total-sin-impuestos";
    public static final String ITEMIMPORTETOTAL = "item-importe-total";
    public static final String TOTALESLIMPORTETOTAL = "total-importe-total";
    public static final String TOTALCOMPROBANTES = "total-comprobantes";
    public static final String TOTALIMPORTETOTAL = "importe-total";
    public static final String ESTADO_COMPROBANTE = "estado-comprobante";
    public static final String ESTADO_SUNAT = "estado-sunat";
    public static final String RUC_ANULADO = "ruc-anulado";
    public static final String DESCRIPCION_SUNAT = "descripcionSunat";

    public static final Integer POS_FECHAEMISION = 0;
    public static final Integer POS_TIPOCOMPROBANTE = 1;
    public static final Integer POS_NUMCOMPROBANTE = 2;
    public static final Integer POS_VENDEDOR = 3;
    public static final Integer POS_TIPOCLIENTE = 4;
    public static final Integer POS_RUCCLIENTE = 5;
    public static final Integer POS_RAZONSOCIAL = 6;
    public static final Integer POS_MONEDA = 7;
    public static final Integer POS_ITEMCODIGOPRODUCTO = 8;
    public static final Integer POS_ITEMDESCRIPCION = 9;
    public static final Integer POS_ITEMUNIDADMEDIDA = 10;
    public static final Integer POS_ITEMCANTIDAD = 11;
    public static final Integer POS_VALORUNITARIO = 12;
    public static final Integer POS_PRECIOUNITARIO = 13;
    public static final Integer POS_IGV = 14;
    public static final Integer POS_DESCUENTOUNITARIO = 15;
    public static final Integer POS_VALORVENTA = 16;
    public static final Integer POS_ESTADOCOMPROBANTE = 17;
    public static final Integer POS_ESTADOSUNAT = 18;
}
