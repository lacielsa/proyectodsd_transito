using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace RestServices.Persistencia
{
    public class ConexionUtil
    {
        public static string Cadena 
        { 
            get
            {
                return "user id=dsdtransito_SQLLogin_1; pwd = w13li1o8us; data source = DBReniec.mssql.somee.com; Persist Security Info = False; initial catalog = DBReniec";
            }
        }
    }
}