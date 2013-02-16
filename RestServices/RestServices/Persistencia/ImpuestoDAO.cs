using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using RestServices.Dominio;
using System.Data.SqlClient;

namespace RestServices.Persistencia
{
    public class ImpuestoDAO
    {
        public List<Impuesto> ListarImpuestos(string dni)
        {
            List<Impuesto> listImpuestoEncontrado = new List<Impuesto>();
            
            string sql = "SELECT * FROM impuesto WHERE v_dni=@cod";
            using(SqlConnection con=new SqlConnection(Persistencia.ConexionUtil.Cadena))
            {
                con.Open();
                using(SqlCommand com=new SqlCommand(sql,con))
                {
                    com.Parameters.Add(new SqlParameter("@cod",dni));
                    using(SqlDataReader reader=com.ExecuteReader()){
                       while(reader.Read())
                        {	
                            Impuesto impuesto = new Impuesto();                          
                             impuesto.Dni = (string)reader["v_dni"];
                             impuesto.Placa = (string)reader["V_placa"];
                             impuesto.NumCuota = (string)reader["v_nucuota"];
                             impuesto.Multa = (decimal)reader["v_monto"];
                             impuesto.Fecha = (string)reader["V_fecvcto"];
                            listImpuestoEncontrado.Add(impuesto);
                         }
                     }       
                }       
            }
            return listImpuestoEncontrado;
        }
    }
}